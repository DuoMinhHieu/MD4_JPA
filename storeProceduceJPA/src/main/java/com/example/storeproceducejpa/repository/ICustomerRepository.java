package com.example.storeproceducejpa.repository;

import com.example.storeproceducejpa.model.Customer;

public interface ICustomerRepository {
    boolean saveWithStoredProcedure(Customer customer);
}