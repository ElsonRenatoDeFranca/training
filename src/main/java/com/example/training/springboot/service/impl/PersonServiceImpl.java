package com.example.training.springboot.service.impl;

import com.example.training.springboot.dao.PersonAppRepository;
import com.example.training.springboot.entity.Address;
import com.example.training.springboot.entity.Passport;
import com.example.training.springboot.entity.Person;
import com.example.training.springboot.entity.Phone;
import com.example.training.springboot.entity.PhoneDetails;
import com.example.training.springboot.service.IPersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 * Created by e068635 on 9/21/2018.
 *
 * Used for testing
 *

 [
 {
 "id": 1,
 "firstName": "Elson",
 "middleName": "Renato",
 "lastName": "de Franca",
 "email": "elson.renato.de.franca@gmail.com",
 "phones": [
 {
 "id": 5,
 "phoneNumber": "55 41 99503-1617",
 "details": {
 "id": 6,
 "manufacturer": "Samsung",
 "model": "S10",
 "color": "White",
 "phoneType": "MOBILE"
 }
 },
 {
 "id": 7,
 "phoneNumber": "55 41 3964-6716",
 "details": {
 "id": 8,
 "manufacturer": "Factory01",
 "model": "546-TI",
 "color": "White",
 "phoneType": "LAND_LINE"
 }
 }
 ],
 "passportDetails": {
 "id": 2,
 "docSerialNumber": "KY543L",
 "issueDate": "2018-01-15T00:00:00.000+0000",
 "expirationDate": "2028-01-15T00:00:00.000+0000",
 "issuerCountry": "BRA"
 },
 "addresses": [
 {
 "id": 3,
 "number": "59",
 "street": "Otavio Afonso da Silva",
 "zipCode": "6578-890",
 "city": "Curitiba"
 },
 {
 "id": 4,
 "number": "139",
 "street": "Rua Joao Marchesini",
 "zipCode": "87698-890",
 "city": "Curitiba"
 }
 ]
 }
 ]



 *
 */
@Service
public class PersonServiceImpl implements IPersonService {

    @Autowired
    private PersonAppRepository personAppRepository;

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
        personAppRepository.save(person);
    }

    @Override
    public void updatePerson(Long id, Person person) {
        person.setId(id);
        Optional<Person> existingPerson = personAppRepository.findById(id);
        existingPerson.ifPresent(p -> personAppRepository.save(person));
    }

    @Override
    public void deletePerson(Long id) {
        Optional<Person> existingPerson = personAppRepository.findById(id);
        existingPerson.ifPresent(person -> personAppRepository.deleteById(id));
    }

}