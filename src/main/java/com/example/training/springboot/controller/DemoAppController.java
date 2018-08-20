package com.example.training.springboot.controller;

import com.example.training.springboot.entity.Person;
import com.example.training.springboot.service.IDemoAppService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DemoAppController {

    @Autowired
    private IDemoAppService demoAppService;

    @RequestMapping("/people")
    public List<Person> findAll(){
        return demoAppService.findAll();
    }

    @RequestMapping("/person/{id}")
    public Person findById(@PathVariable Long id){
        return demoAppService.findCustomerById(id);
    }

    @RequestMapping(method=RequestMethod.POST, value="/people")
    public void save(@RequestBody Person person){
        demoAppService.saveCustomer(person);
    }

    @RequestMapping(method=RequestMethod.PUT, value="/people/{id}")
    public void update(@RequestBody Person person, @PathVariable Long id){
        demoAppService.updateCustomer(id, person);
    }

    @RequestMapping(method= RequestMethod.DELETE, value="/people/{id}")
    public void delete(@PathVariable Long id){
        demoAppService.deleteCustomer(id);

    }

}
