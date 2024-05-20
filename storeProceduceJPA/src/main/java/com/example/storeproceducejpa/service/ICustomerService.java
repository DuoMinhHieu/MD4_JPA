package com.example.storeproceducejpa.service;

import com.example.storeproceducejpa.model.Customer;

import java.util.List;

public interface ICustomerService {
    boolean saveWithStoredProcedure(Customer customer);
}