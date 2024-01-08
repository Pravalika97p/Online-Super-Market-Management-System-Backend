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

import com.SuperMarket.ServiceImpl.OrderServiceImpl;
import com.SuperMarket.model.Order;


//RestController for handling Order related endpoints
@RestController
@CrossOrigin
public class OrderController {
	
	/*public OrderController(OrderService oservice) 
	{
		super();
		this.oservice = oservice;
	}*/
	@Autowired
	private OrderServiceImpl oservice;// Autowired OrderService
			
			
		    // Endpoint to get all Orders
			@GetMapping("/getallOrders")
			public ResponseEntity<List<Order>> getall()
			{
				List<Order> list=oservice.getAllOrders();
				return new ResponseEntity<>(list,HttpStatus.OK);
			}
			
		    // Endpoint to insert a new Order
			@PostMapping("/insertOrder")
			public ResponseEntity<String> insertOrder(@RequestBody Order d)
			{
				String s=oservice.insertOrder(d);
				return new ResponseEntity<>(s,HttpStatus.CREATED);
			}
			
		    // Endpoint to get Order by their id
			@GetMapping("/getOrder/{id}")
			public ResponseEntity<Order> getOrder(@PathVariable("id") Integer id)
			{
				Order o=oservice.getOrder(id);
				return new ResponseEntity<>(o,HttpStatus.OK);
			}
			
		    // Endpoint to update an existing Order
			@PutMapping("/updateOrder")
			public ResponseEntity<String> updateOrder(@RequestBody Order d)
			{
				String s=oservice.updateOrder(d);
				return new ResponseEntity<>(s,HttpStatus.CREATED);
			}
			
		    // Endpoint to delete a Order by their ID
			@DeleteMapping("/deleteOrder/{id}")
			public ResponseEntity<String> deleteOrder(@PathVariable("id") Integer id)
			{
				String s=oservice.deleteOrder(id);
				return new ResponseEntity<>(s,HttpStatus.OK);
			}
			
			// Endpoint to get a Order by their id
			@GetMapping("/get-by-orderid/{orderid}")
			public ResponseEntity<Order> getOrderById(@PathVariable("orderid") Integer orderid)
			{
				Order o=oservice.getByOrderId(orderid);
				return new ResponseEntity<>(o,HttpStatus.OK);
			}
			
		    // Endpoint to get a Order by their date
			@GetMapping("/get-by-orderdate/{orderdate}")
			public ResponseEntity<Order> getOrder(@PathVariable("orderdate") String orderdate)
			{
				Order o=oservice.getByOrderDate(orderdate);
				return new ResponseEntity<>(o,HttpStatus.OK);
			}
			
		}




