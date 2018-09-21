package com.example.training.springboot.controller;

import com.example.training.springboot.entity.Person;
import com.example.training.springboot.service.IPersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by e068635 on 9/21/2018.
 */
@RestController
public class PersonAppController {

    @Autowired
    private IPersonService personService;



    @RequestMapping("/people")
    public List<Person> findAll(){

        return personService.findAll();
    }

    @RequestMapping("/person/{id}")
    public Person findById(@PathVariable Long id){

        return personService.findPersonById(id);
    }

    @RequestMapping(method=RequestMethod.POST, value="/people")
    public void save(@RequestBody Person person) {
        personService.savePerson(person);
    }






}
