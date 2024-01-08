package com.SuperMarket.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.SuperMarket.ServiceImpl.PaymentServiceImpl;
import com.SuperMarket.model.Payment;
import com.SuperMarket.service.PaymentService;

// RestController for handling Payment related endpoints
	@RestController
	@CrossOrigin
	public class PaymentController {
		@Autowired
	    private PaymentServiceImpl pservice; // Autowired PaymentService

	    
	   /* public PaymentController(PaymentService pservice) {
	        this.pservice = pservice;
	    }*/

	    // End point to get all payments
	    @GetMapping("/getallpayments")
	    public ResponseEntity<List<Payment>> getall() {
	        List<Payment> list = pservice.getAllPayments();
	        return new ResponseEntity<>(list, HttpStatus.OK);
	    }

	    // End point to insert a new payment
	    @PostMapping("/insertpayments")
	    public ResponseEntity<String> insertpayments(@RequestBody Payment p) {
	        String s = pservice.insertPayment(p);
	        return new ResponseEntity<>(s, HttpStatus.CREATED);
	    }

	    // End point to get a payment by its ID
	    @GetMapping("/getpayment/{id}")
	    public ResponseEntity<Payment> getpayment(@PathVariable("id") Integer id) {
	        Payment p = pservice.getPayment(id);
	        return new ResponseEntity<>(p, HttpStatus.OK);
	    }

	    // End point to update an existing payment
	    @PutMapping("/updatepayment")
	    public ResponseEntity<String> updatepayment(@RequestBody Payment p) {
	        String s = pservice.updatePayment(p);
	        return new ResponseEntity<>(s, HttpStatus.CREATED);
	    }

	    // End point to delete a payment by its ID
	    @DeleteMapping("/deletepayment/{id}")
	    public ResponseEntity<String> deletepayment(@PathVariable("id") Integer id) {
	        String s = pservice.deletePayment(id);
	        return new ResponseEntity<>(s, HttpStatus.OK);
	    }

	    // End point to get a payment by its mode
	    @GetMapping("/get-by-paymode/{mode}")
	    public ResponseEntity<Payment> getpaymode(@PathVariable("mode") String mode) {
	        Payment p = pservice.getByPaymentMode(mode);
	        return new ResponseEntity<>(p, HttpStatus.OK);
	    }

	    // End point to get a payment by its date
	    @GetMapping("/get-by-paydate/{date}")
	    public ResponseEntity<Payment> getpaydate(@PathVariable("date") String date) {
	        Payment p = pservice.getByPaymentDate(date);
	        return new ResponseEntity<>(p, HttpStatus.OK);
	    }
	}



