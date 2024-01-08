package com.SuperMarket.Repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.SuperMarket.model.Customer;

//Importing the necessary libraries

@Repository
public interface CustomerRepo extends JpaRepository <Customer,Integer> 
{ 
  
  public Customer findByCustomerName(String name);// method to find a customer by customer name
  public Customer findByemail(String email);// method to find a customer by email
  public Customer findByCustomerAddress(String custaddress);// method to find a customer by customer address
}
