package com.example.training.springboot.service.impl;

import com.example.training.springboot.dao.AddressAppRepository;
import com.example.training.springboot.dao.DocumentIdentificationRepository;
import com.example.training.springboot.dao.PersonAppRepository;
import com.example.training.springboot.entity.DocumentIdentification;
import com.example.training.springboot.entity.Person;
import com.example.training.springboot.service.IPersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PersonServiceImpl implements IPersonService {

    @Autowired
    private PersonAppRepository personAppRepository;


    @Autowired
    private DocumentIdentificationRepository documentIdentificationRepository;

    @Override
    public List<Person> findAll() {
        List<Person> people = new ArrayList<>();
        personAppRepository.findAll().forEach(people::add);
        return people;
    }

    @Override
    public Person findPersonById(Long id) {
        return personAppRepository.findById(id).get();
    }

    @Override
    public void savePerson(Person person) {
        this.personAppRepository.save(person);
    }

    @Override
    public void updatePerson(Long id, Person person) {
        personAppRepository.save(person);
    }

    @Override
    public void deletePerson(Long id) {
        this.personAppRepository.deleteById(id);
    }
}
