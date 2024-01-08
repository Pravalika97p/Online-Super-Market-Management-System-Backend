package com.SuperMarket.ServiceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.SuperMarket.Repository.CustomerRepo;
import com.SuperMarket.model.Customer;
import com.SuperMarket.service.CustomerService;

//Service class
@Service
public class CustomerServiceImpl implements CustomerService 
{
  @Autowired
  private CustomerRepo crepo;
  
  
  /*public CustomerServiceImpl(CustomerRepo crepo)
  {
		super();
		this.crepo = crepo;
	}*/
  
  // Retrieve a customer by their ID
  @Override
	public Customer getCustomer(Integer id)
	{
		Optional<Customer> a=crepo.findById(id);
		Customer a1=a.get();
		return a1;
	}
  // Retrieve all customers
  @Override
	public List<Customer> getAllCustomers()
	{
		List<Customer> c=crepo.findAll();
		return c;
	}
  //insert a new customer
	@Override
	public String insertCustomer(Customer c) 
	{
		crepo.save(c);
		return "One record has been inserted";
	}
	//update an existing customer
	@Override
	public String updateCustomer(Customer c) 
	{
		crepo.save(c);
		return "One record has been updated";
	}
	// Delete a customer by their 
	@Override
	public String deleteCustomer(Integer id) 
	{
		crepo.deleteById(id);
		return "One record has been deleted";
	}
  
	// Get a customer by their name
	@Override
	public Customer getByCustomerName(String name) 
	{
	Customer customerName=crepo.findByCustomerName(name);
		return customerName;
	}
	//get a customer by their email
	@Override
	public Customer getByemail(String email)
	{
		Customer Email=crepo.findByemail(email);
		return Email;
	}
	//get a customer by their address
	@Override
	public Customer getByCustomerAddress(String custaddress)
	{
		Customer customerAddress=crepo.findByCustomerAddress(custaddress);
		return customerAddress;
	}
}
