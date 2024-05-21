package com.example.storeproceducejpa.service;

import com.example.storeproceducejpa.model.Customer;

public interface ICustomerService {
    boolean saveWithStoredProcedure(Customer customer);
}