package com.sample.controllers;

import com.sample.models.entity.PaymentHistory;
import com.sample.models.entity.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

//SELECT trxid, loan_trxid FROM loan_payment_history Limit 1
@RestController
public class PaymentHistoryControllers {

    @Autowired
    JdbcTemplate jdbcTemplate;

    @RequestMapping("/gld/msisdn")
    public ResponseEntity<List<PaymentHistory>> getFindAll() {
        List<PaymentHistory> paymentHistory = jdbcTemplate.query("SELECT profile.customer_id, profile.msisdn, loan_payment_history.value FROM profile RIGHT JOIN loan_payment_history ON profile.customer_id=loan_payment_history.customer_id", new BeanPropertyRowMapper(PaymentHistory.class));
        return new ResponseEntity<>(paymentHistory, HttpStatus.OK);
    }

    @RequestMapping("/gld/result")
    public ResponseEntity<List<Result>> getFindAllResult() {
        List<Result> results = jdbcTemplate.query("SELECT profile.customer_id, profile.msisdn, loan_payment_history.value FROM profile RIGHT JOIN loan_payment_history ON profile.customer_id=loan_payment_history.customer_id", new BeanPropertyRowMapper(Result.class));
        return new ResponseEntity<>(results, HttpStatus.OK);
    }








}
