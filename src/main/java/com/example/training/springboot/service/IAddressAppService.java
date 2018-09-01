package com.example.training.springboot.service;

import com.example.training.springboot.entity.Address;

import java.util.List;

public interface IAddressAppService {



    /**
     *
     * @return
     */
    List<Address> findAllAddresses();

    /**
     *
     * @return
     */
    List<Address> findByPersonId(Long personId);

    /**
     *
     * @param id
     * @return
     */
    Address findAddressById(Long id);


    /**
     *
     * @param address
     */
    void saveAddress(Address address);

    /**
     *
     * @param id
     * @return
     */
    void updateAddress(Long id, Address address);

    /**
     *
     * @param id
     */
    void deleteAddress(Long id);

}
