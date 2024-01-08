package com.SuperMarket.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.SuperMarket.model.Order;
@Repository
public interface OrderRepo extends JpaRepository <Order,Integer> 
{
	
	public Order findByOrderDate(String orderdate);//method to find a Order by Order date
	
	public Order findByOrderId(Integer orderid);//method to find a Order by Order Id
	
}

