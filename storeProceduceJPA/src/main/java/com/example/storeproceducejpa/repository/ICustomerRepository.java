package com.example.storeproceducejpa.repository;

import com.example.storeproceducejpa.model.Customer;

import java.util.List;

public interface ICustomerRepository {
    boolean saveWithStoredProcedure(Customer customer);
}