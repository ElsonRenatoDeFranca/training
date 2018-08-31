package com.example.training.springboot.service.impl;

import com.example.training.springboot.dao.AddressAppRepository;
import com.example.training.springboot.entity.Address;
import com.example.training.springboot.service.IAddressAppService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AddressServiceAppImpl implements IAddressAppService {

    @Autowired
    private AddressAppRepository addressAppRepository;


    @Override
    public List<Address> findAllAddresses() {
        List<Address> addressList = new ArrayList<>();
        addressAppRepository.findAll().forEach(addressList::add);
        return addressList;
    }

    @Override
    public List<Address> findAllAddressesByPersonId(Long personId) {
        List<Address> addresses = addressAppRepository.findAddressByPersonId(personId);
        return addresses;
    }

    @Override
    public Address findAddressById(Long id) {
        return null;
    }

    @Override
    public void saveAddress(Address address) {
        addressAppRepository.save(address);
    }

    @Override
    public void updateAddress(Long id, Address address) {
        addressAppRepository.save(address);
    }

    @Override
    public void deleteAddress(Long id) {
        addressAppRepository.deleteById(id);
    }
}
