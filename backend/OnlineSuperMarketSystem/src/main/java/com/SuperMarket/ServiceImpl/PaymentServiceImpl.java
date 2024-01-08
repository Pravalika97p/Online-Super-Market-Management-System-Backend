package com.SuperMarket.ServiceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.SuperMarket.Repository.PaymentRepo;
import com.SuperMarket.model.Payment;
import com.SuperMarket.service.PaymentService;

//Service class
@Service
public class PaymentServiceImpl implements PaymentService 
{
    @Autowired
    private PaymentRepo prepo;
    
	/*public PaymentServiceImpl(PaymentRepo prepo) 
	{
		super();
		this.prepo = prepo;
	}*/
    
	//Get a payment by its id
	@Override
	public Payment getPayment(Integer id) 
	{
		Optional<Payment> a=prepo.findById(id);
		Payment a1=a.get();
		return a1;
		
	}
    // Get all payments
	@Override
	public List<Payment> getAllPayments() 
	{
		List<Payment> p=prepo.findAll();
		return p;
		
	}
    // Insert a new payment
	@Override
	public String insertPayment(Payment p)
	{
		prepo.save(p);
		return "One record has been inserted";
	}
	//update an existing payment
	@Override
	public String updatePayment(Payment p) 
	{
		prepo.save(p);
		return "One record has been updated";
	}
	//delete payment by its id
	@Override
	public String deletePayment(Integer id) 
	{
		prepo.deleteById(id);
		return "One record has been deleted";
	}
	//Get a payment by its mode
	@Override
	public Payment getByPaymentMode(String paymode) 
	{
		Payment paymentMode=prepo.findByPaymentMode(paymode);
		return paymentMode;
	}
	//get a payment by its date 
	@Override
	public Payment getByPaymentDate(String paydate) 
	{
		Payment paymentDate=prepo.findByPaymentDate(paydate);
		return paymentDate;
	}
}

