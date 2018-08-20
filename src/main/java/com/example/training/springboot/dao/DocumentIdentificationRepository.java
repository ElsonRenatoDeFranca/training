package com.example.training.springboot.dao;

import com.example.training.springboot.entity.DocumentIdentification;
import org.springframework.data.repository.CrudRepository;

public interface DocumentIdentificationRepository extends CrudRepository<DocumentIdentification,Long> {
}
