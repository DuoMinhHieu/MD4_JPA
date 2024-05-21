package com.example.storeproceducejpa.controller;

import com.example.storeproceducejpa.model.Customer;
import com.example.storeproceducejpa.service.ICustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/customers")
public class CustomerController {
    @Autowired
    private ICustomerService customerService;


    @GetMapping("/create")
    public String showFormCreate(Model model) {
        model.addAttribute("customer", new Customer());
        return "create";
    }

    @PostMapping("/update")
    public String save(Customer customer) {
        customerService.saveWithStoredProcedure(customer);
        return "create";
    }


}

