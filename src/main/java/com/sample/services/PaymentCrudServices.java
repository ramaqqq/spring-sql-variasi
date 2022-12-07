package com.sample.services;

import com.sample.models.entity.PaymentCrud;
import com.sample.models.repos.PaymentCrudRepo;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
public class PaymentCrudServices {

    @Autowired
    private PaymentCrudRepo paymentCrudRepo;

    public PaymentCrud save(PaymentCrud paymentCrud) {
        return paymentCrudRepo.save(paymentCrud);
    }

    public PaymentCrud findOne(Long id) {
        return paymentCrudRepo.findById(id).get();
    }

    public Iterable<PaymentCrud> findAll() {
        return paymentCrudRepo.findAll();
    }

    public void removeOne(Long id){
        paymentCrudRepo.deleteById(id);
    }

    //search
    public List<PaymentCrud> findByMsisdn(String msisdn){
        return paymentCrudRepo.findByMsisdnContains(msisdn);
    }


}
