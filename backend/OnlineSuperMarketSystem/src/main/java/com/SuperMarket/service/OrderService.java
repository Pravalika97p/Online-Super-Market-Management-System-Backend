package com.SuperMarket.service;

import java.util.List;

import com.SuperMarket.model.Order;


public interface OrderService {
	
		
		public Order getOrder(Integer id);// Retrieve a Order by its ID
		public List<Order>getAllOrders(); // Retrieve all Orders
		public String insertOrder(Order o);//Insert a new Order
		public String updateOrder(Order o);//    // Update an existing Order
		public String deleteOrder(Integer id);// Delete a Order by its ID

		public Order getByOrderDate(String orderdate);//  method to get a Order by its Order date
	
		public Order getByOrderId(Integer orderid);//method to get a Order by OrderId

}
