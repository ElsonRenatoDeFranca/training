package com.example.training.springboot.dao;

import com.example.training.springboot.entity.DocumentIdentification;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DocumentIdentificationRepository extends JpaRepository<DocumentIdentification,Long> {

    DocumentIdentification findByPersonId(Long personId);

}
