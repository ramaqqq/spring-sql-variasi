package com.sample.controllers;

import com.sample.models.entity.PaymentCrud;
import com.sample.services.PaymentCrudServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/gld/payhistory")
public class PaymentCrudController {

    @Autowired
    private PaymentCrudServices paymentCrudServices;

    @PostMapping
    public PaymentCrud create(@RequestBody PaymentCrud paymentCrud) {
        return paymentCrudServices.save(paymentCrud);
    }

    @GetMapping
    public Iterable<PaymentCrud> findAll() {
        return paymentCrudServices.findAll();
    }

    //searchById
    @GetMapping("/{id}")
    public PaymentCrud findOne(@PathVariable("id") Long id){
        return paymentCrudServices.findOne(id);
    }

    //update
    @PutMapping
    public PaymentCrud update(@RequestBody PaymentCrud paymentCrud) {
        return paymentCrudServices.save(paymentCrud);
    }

    @DeleteMapping("/{id}")
    public void removeOne(@PathVariable("id") Long id) {
        paymentCrudServices.removeOne(id);
    }


}
