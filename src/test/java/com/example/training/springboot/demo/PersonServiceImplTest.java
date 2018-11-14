package com.example.training.springboot.demo;

import com.example.training.springboot.dao.PersonAppRepository;
import com.example.training.springboot.entity.Address;
import com.example.training.springboot.entity.Passport;
import com.example.training.springboot.entity.Person;
import com.example.training.springboot.entity.Phone;
import com.example.training.springboot.entity.PhoneDetails;
import com.example.training.springboot.service.IPersonService;
import com.example.training.springboot.service.impl.PersonServiceImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;

import static org.hamcrest.Matchers.allOf;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.greaterThan;
import static org.hamcrest.Matchers.hasProperty;
import static org.hamcrest.Matchers.hasSize;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.notNullValue;
import static org.junit.Assert.assertThat;
import static org.mockito.ArgumentMatchers.anyLong;
import static org.mockito.Mockito.when;

/**
 * Created by e068635 on 11/14/2018.
 */
@SpringBootTest
@RunWith(MockitoJUnitRunner.class)
public class PersonServiceImplTest {

    @Mock
    private PersonAppRepository personAppRepository;

    @InjectMocks
    private IPersonService personService = new PersonServiceImpl();


    @Test
    public void testFindAll_shouldReturnNotEmptyList_whenSearchIsDoneW(){

        //When
        when(personAppRepository.findAll()).thenReturn(getPeople());

        List<Person> peopleList = personService.findAll();

        //Then
        assertThat(peopleList,is(notNullValue()));
        assertThat(peopleList,hasSize(greaterThan(0)));
        assertThat(peopleList,org.hamcrest.Matchers.<Person>hasItem(allOf(hasProperty("firstName", is(notNullValue())))));
        assertThat(peopleList,org.hamcrest.Matchers.<Person>hasItem(allOf(hasProperty("middleName", is(notNullValue())))));
        assertThat(peopleList,org.hamcrest.Matchers.<Person>hasItem(allOf(hasProperty("lastName", is(notNullValue())))));
        assertThat(peopleList,org.hamcrest.Matchers.<Person>hasItem(allOf(hasProperty("email", is(notNullValue())))));
        assertThat(peopleList,org.hamcrest.Matchers.<Person>hasItem(allOf(hasProperty("phones", hasSize(greaterThan(0))))));
        assertThat(peopleList,org.hamcrest.Matchers.<Person>hasItem(allOf(hasProperty("passportDetails", is(notNullValue())))));
        assertThat(peopleList,org.hamcrest.Matchers.<Person>hasItem(allOf(hasProperty("addresses", hasSize(greaterThan(0))))));
    }

    @Test
    public void testFinPersonById_shouldReturnNotEmptyList_whenSearchIsDoneW() {

        //When
        when(personAppRepository.findById(anyLong())).thenReturn(Optional.of(getPerson()));

    }



        private List<Person> getPeople(){
        List<Person> people = new ArrayList<>();
        people.add(getPerson());
        return people;
    }

    private Person getPerson(){

        Person person = new Person();
        Passport passport = getPassport();
        person.setId(1L);
        person.setFirstName("FirstName");
        person.setMiddleName("MiddleName");
        person.setLastName("LastName");
        person.setEmail("person@email.com");
        person.setPassportDetails(passport);
        person.setPhones(getPhones());
        person.setAddresses(getAddresses());

        return person;
    }

    private List<Phone> getPhones(){
        List<Phone> phones = new ArrayList<>();
        phones.add(getPhone());
        return phones;
    }

    private Phone getPhone(){

        Phone phone = new Phone();
        phone.setId(1L);

        PhoneDetails phoneDetails = getPhoneDetails();
        phone.setDetails(phoneDetails);
        phone.setPhoneNumber("+55 41 9090-9090");

        return phone;
    }

    private PhoneDetails getPhoneDetails(){
        PhoneDetails phoneDetails = new PhoneDetails();
        phoneDetails.setManufacturer("Manufacturer");
        phoneDetails.setModel("Model");
        phoneDetails.setColor("Color");
        phoneDetails.setId(1L);
        phoneDetails.setPhoneType("PhoneType");

        return phoneDetails;
    }

    private Passport getPassport(){

        Passport passport = new Passport();
        passport.setIssuerCountry("BRA");
        passport.setIssueDate(new Date());
        passport.setExpirationDate(new Date());
        passport.setId(1L);
        passport.setDocSerialNumber("ABC9876");

        return passport;
    }

    private Address getAddress(){

        Address address = new Address();
        address.setId(1L);
        address.setNumber("672627");
        address.setCity("City");
        address.setStreet("Street street");
        address.setZipCode("71871-980");

        return address;
    }

    private List<Address> getAddresses(){
        List<Address> addresses = new ArrayList<>();
        addresses.add(getAddress());
        return addresses;
    }

}
