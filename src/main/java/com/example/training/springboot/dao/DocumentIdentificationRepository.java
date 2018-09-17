package com.example.training.springboot.dao;

import com.example.training.springboot.entity.Address;
import com.example.training.springboot.entity.DocumentIdentification;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface DocumentIdentificationRepository extends JpaRepository<DocumentIdentification,Long> {


    @Query(value = "SELECT  *  FROM DOCUMENT_IDENTIFICATION DOC INNER JOIN PERSON P ON DOC.PERSON_ID = P.PERSON_ID ", nativeQuery = true)
        //@Query("select a from Address a where a.personId = :personId")
    List<DocumentIdentification> findByPersonId(@Param("personId") Long personId);
}
