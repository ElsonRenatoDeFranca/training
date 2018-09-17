package com.example.training.springboot.service.impl;

import com.example.training.springboot.dao.PersonAppRepository;
import com.example.training.springboot.entity.DocumentIdentification;
import com.example.training.springboot.entity.DocumentationIdentificationDTO;
import com.example.training.springboot.entity.Person;
import com.example.training.springboot.entity.PersonDTO;
import com.example.training.springboot.service.IPersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PersonServiceImpl implements IPersonService {

    @Autowired
    private PersonAppRepository personAppRepository;

    @Override
    public List<Person> findAll() {
        List<Person> people = new ArrayList<>();
        people = personAppRepository.findAll();
        for(Person person : people){

            /*DocumentIdentification doc = person.getDocumentIdentification();
            if(doc != null){

            }*/
        }
        //personAppRepository.findAll().forEach(people::add);
        return people;
    }

    @Override
    public Person findPersonById(Long id) {
        return personAppRepository.findById(id).get();
    }

    @Override
    public void savePerson(Person person) {

      //DocumentIdentification doc = person.getDocumentIdentification();
      //doc.setPerson(person);
      //person.setDocumentIdentification(doc);



      //DocumentIdentification doc = person.getDocumentIdentification();
      //person.addDocumentIdentification(doc);

        /*DocumentationIdentificationDTO doc = new DocumentationIdentificationDTO();
        doc.setId(person.getDocumentIdentification().getId());
        doc.setDocSerialNumber(person.getDocumentIdentification().getDocSerialNumber());
        doc.setExpirationDate(person.getDocumentIdentification().getExpirationDate());
        doc.setIssueDate(person.getDocumentIdentification().getIssueDate());
        doc.setIssuerCountry(person.getDocumentIdentification().getIssuerCountry());

        PersonDTO personDTO = new PersonDTO();
        personDTO.setId(person.getId());
        personDTO.setFirstName(person.getFirstName());
        personDTO.setMiddleName(person.getMiddleName());
        personDTO.setLastName(person.getLastName());
        personDTO.setDocumentIdentification(doc);
*/

        DocumentIdentification doc = person.getDocumentIdentification();
        person.addDocumentIdentification(doc);
        doc.setPerson(person);

        //DocumentIdentification doc = person.getDocumentIdentification();
        //doc.setPerson(person);
        //person.setDocumentIdentification(doc);


        //DocumentIdentification doc = person.getDocumentIdentification();
        //person.addDocumentIdentification(doc);



        if(person != null){
          this.personAppRepository.save(person);
       }


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
