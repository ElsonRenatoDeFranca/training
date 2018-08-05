package com.example.training.springboot.controller;

import com.example.training.springboot.entity.Customer;
import com.example.training.springboot.service.IDemoAppService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DemoAppController {

    @Autowired
    private IDemoAppService demoAppService;

    @RequestMapping("/customers")
    public List<Customer> findAll(){
        return demoAppService.findAll();
    }

    @RequestMapping("/customers/{id}")
    public Customer findById(@PathVariable String id){
        return demoAppService.findCustomerById(id);
    }

    @RequestMapping(method=RequestMethod.POST, value="/customers")
    public void save(@RequestBody Customer customer){
        demoAppService.saveCustomer(customer);
    }

    @RequestMapping(method=RequestMethod.PUT, value="/customers/{id}")
    public void update(@RequestBody Customer customer, @PathVariable String id){
        demoAppService.updateCustomer(id, customer);
    }

    @RequestMapping(method= RequestMethod.DELETE, value="/customers/{id}")
    public void delete(@PathVariable String id){
        demoAppService.deleteCustomer(id);

    }

}
