package com.SuperMarket.ServiceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.SuperMarket.Repository.OrderRepo;
import com.SuperMarket.model.Order;

import com.SuperMarket.service.OrderService;

//Service class
@Service
public class OrderServiceImpl implements OrderService 
{
    @Autowired
    private OrderRepo orepo;
    
	/*public OrderServiceImpl(OrderRepo orepo) 
	{
		super();
		this.orepo = orepo;
	}*/
    
	//Get a Order by its id
	@Override
	public Order getOrder(Integer id) 
	{
		Optional<Order> a=orepo.findById(id);
		Order a1=a.get();
		return a1;
		
	}
    // Get all Orders
	@Override
	public List<Order> getAllOrders() 
	{
		List<Order> o=orepo.findAll();
		return o;
		
	}
    // Insert a new Order
	@Override
	public String insertOrder(Order o)
	{
		orepo.save(o);
		return "One record has been inserted";
	}
	//update an existing Order
	@Override
	public String updateOrder(Order o) 
	{
		orepo.save(o);
		return "One record has been updated";
	}
	//delete Order by its id
	@Override
	public String deleteOrder(Integer id) 
	{
		orepo.deleteById(id);
		return "One record has been deleted";
	}
	//Get a Order by its orderdate
	@Override
	public Order getByOrderDate(String orderdate) 
	{
		Order orderDate=orepo.findByOrderDate(orderdate);
		return orderDate;
	}
	//get a Order by its orderid
	@Override
	public Order getByOrderId(Integer orderid) {
		Order orderId=orepo.findByOrderId(orderid);
		return orderId;
	}
}

