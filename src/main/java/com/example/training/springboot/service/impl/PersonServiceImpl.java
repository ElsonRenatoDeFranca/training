package com.example.training.springboot.service.impl;

import com.example.training.springboot.dao.PersonAppRepository;
import com.example.training.springboot.entity.Person;
import com.example.training.springboot.entity.Phone;
import com.example.training.springboot.entity.PhoneDetails;
import com.example.training.springboot.service.IPersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by e068635 on 9/21/2018.
 *
 * Used for testing
 *
  {
 "firstName":"Joaquina",
 "middleName":"Silverio",
 "lastName":"dos Reis",
 "phones":[
 { "phoneNumber":"99554-3456","phoneDetails":{"manufacturer": "Samsumg", "model": "S7", "color": "white"}}

 ]




 }
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

        List<Phone> phoneList = person.getPhones();
        Person person1 = new Person();
        person1.setFirstName(person.getFirstName());
        person1.setMiddleName(person.getMiddleName());
        person1.setLastName(person.getLastName());

        if(null != person.getPhones()){
            for(Phone phone : phoneList){
                Phone myPhone = new Phone();
                myPhone.setPhoneNumber(phone.getPhoneNumber());
                person1.getPhones().add(myPhone);
            }
        }
        personAppRepository.save(person1);
    }

    @Override
    public void updatePerson(Long id, Person person) {

    }

    @Override
    public void deletePerson(Long id) {

    }
}
