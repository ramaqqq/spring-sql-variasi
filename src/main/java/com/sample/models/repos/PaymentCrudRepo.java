package com.sample.models.repos;

import com.sample.models.entity.PaymentCrud;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface PaymentCrudRepo extends CrudRepository<PaymentCrud, Long> {

    List<PaymentCrud> findByMsisdnContains(String msisdn);

}
