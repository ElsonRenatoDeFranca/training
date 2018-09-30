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
        Passport passport = new Passport();

        passport.setDocSerialNumber(person.getPassportDetails().getDocSerialNumber());
        passport.setExpirationDate(person.getPassportDetails().getExpirationDate());
        passport.setIssueDate(person.getPassportDetails().getIssueDate());
        passport.setIssuerCountry(person.getPassportDetails().getIssuerCountry());

        person1.setFirstName(person.getFirstName());
        person1.setMiddleName(person.getMiddleName());
        person1.setLastName(person.getLastName());
        person1.setEmail(person.getEmail());

        if (null != person.getPhones()) {
            for (Phone phone : phoneList) {
                Phone myPhone = new Phone();
                PhoneDetails phoneDetails = new PhoneDetails();

                myPhone.setPhoneNumber(phone.getPhoneNumber());
                phoneDetails.setColor(phone.getDetails().getColor());
                phoneDetails.setModel(phone.getDetails().getModel());
                phoneDetails.setManufacturer(phone.getDetails().getManufacturer());
                phoneDetails.setPhoneType(phone.getDetails().getPhoneType());
                myPhone.setDetails(phoneDetails);
                person1.getPhones().add(myPhone);
                person1.setPassportDetails(passport);
            }
        }

        if(null != person.getAddresses()){

            for(Address myAddress : person.getAddresses()){
                Address address = new Address();
                address.setCity(myAddress.getCity());
                address.setNumber(myAddress.getNumber());
                address.setStreet(myAddress.getStreet());
                address.setZipCode(myAddress.getZipCode());

                person1.getAddresses().add(address);
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