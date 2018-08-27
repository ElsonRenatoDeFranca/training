package com.example.training.springboot.controller;

import com.example.training.springboot.entity.Address;
import com.example.training.springboot.entity.Person;
import com.example.training.springboot.service.IAddressAppService;
import com.example.training.springboot.service.IPersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DemoAppController {

    @Autowired
    private IPersonService personService;

    @Autowired
    private IAddressAppService addressAppService;


    @RequestMapping("/people")
    public List<Person> findAll(){

        return personService.findAll();
    }

    @RequestMapping("/person/{id}")
    public Person findById(@PathVariable Long id){

        return personService.findPersonById(id);
    }

    @RequestMapping(method=RequestMethod.POST, value="/people")
    public void save(@RequestBody Person person){

        personService.savePerson(person);
    }

    @RequestMapping(method=RequestMethod.PUT, value="/people/{id}")
    public void update(@RequestBody Person person, @PathVariable Long id){

        personService.updatePerson(id, person);
    }

    @RequestMapping(method= RequestMethod.DELETE, value="/people/{id}")
    public void delete(@PathVariable Long id){
        personService.deletePerson(id);
    }





    @RequestMapping("/person/{personId}/address")
    public List<Address> findAllAddressesByPersonId(@PathVariable Long personId){

        return addressAppService.findAllAddressesByPersonId(personId);
    }


    @RequestMapping("/person/{id}/address/{id}")
    public Address findAddressByPersonId(@PathVariable Long id){
        return addressAppService.findAddressById(id);
    }

    @RequestMapping(method=RequestMethod.POST, value="/person/{personId}/address")
    public void addAddress(@RequestBody Address address, @PathVariable Long personId){
        addressAppService.saveAddress(address);
    }

    @RequestMapping(method=RequestMethod.PUT, value="/person/{personId}/address/{addressId}")
    public void update(@RequestBody Address address, @PathVariable Long personId, @PathVariable Long addressId){
        addressAppService.saveAddress(address);
    }

    @RequestMapping(method= RequestMethod.DELETE, value="/person/{personId}/address/{addressId}")
    public void deleteAddress(@PathVariable Long id){
        addressAppService.deleteAddress(id);
    }



}
