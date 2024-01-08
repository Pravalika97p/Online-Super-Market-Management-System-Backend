package com.SuperMarket.Repository;

//Importing the necessary libraries

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.SuperMarket.model.Payment;

@Repository
public interface PaymentRepo extends JpaRepository <Payment,Integer>
{
	public Payment findByPaymentMode(String paymode);// method to find a payment by payment mode

	public Payment findByPaymentDate(String paydate);// method to find a payment by payment date
	  
}
