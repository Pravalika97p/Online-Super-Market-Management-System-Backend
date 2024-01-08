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

import com.SuperMarket.ServiceImpl.DeliveryAddressServiceImpl;
import com.SuperMarket.model.DeliveryAddress;

//RestController for handling Customer related endpoints
	@RestController
    @CrossOrigin
	public class DeliveryAddressController 
			{
				@Autowired
				 private DeliveryAddressServiceImpl dservice;// Autowired CustomerService

				/*public DeliveryAddressController(DeliveryAddressService dservice) 
				{
					super();
					this.dservice = dservice;
				}*/
				
			    // Endpoint to get all DeliveryAddress
				@GetMapping("/getallDeliveryAddress")
				public ResponseEntity<List<DeliveryAddress>> getall()
				{
					List<DeliveryAddress> list=dservice.getAllDeliveryAddress();
					return new ResponseEntity<>(list,HttpStatus.OK);
				}
				
			    // Endpoint to insert a new DeliveryAddress
				@PostMapping("/insertDeliveryAddress")
				public ResponseEntity<String> insertDeliveryAddress(@RequestBody DeliveryAddress d)
				{
					String s=dservice.insertDeliveryAddress(d);
					return new ResponseEntity<>(s,HttpStatus.CREATED);
				}
				
			    // Endpoint to get DeliveryAddress by their id
				@GetMapping("/getDeliveryAddress/{id}")
				public ResponseEntity<DeliveryAddress> getDeliveryAddress(@PathVariable("id") Integer id)
				{
					DeliveryAddress d=dservice.getDeliveryAddress(id);
					return new ResponseEntity<>(d,HttpStatus.OK);
				}
				
			    // Endpoint to update an existing DeliveryAddress
				@PutMapping("/updateDeliveryAddress")
				public ResponseEntity<String> updateDeliveryAddress(@RequestBody DeliveryAddress d)
				{
					String s=dservice.updateDeliveryAddress(d);
					return new ResponseEntity<>(s,HttpStatus.CREATED);
				}
				
			    // End point to delete a DeliveryAddress by their ID
				@DeleteMapping("/deleteDeliveryAddress/{id}")
				public ResponseEntity<String> deleteDeliveryAddress(@PathVariable("id") Integer id)
				{
					String s=dservice.deleteDeliveryAddress(id);
					return new ResponseEntity<>(s,HttpStatus.OK);
				}
				
				// End point to get a DeliveryAddress by their Address id
				@GetMapping("/get-by-addressid/{addressid}") 
				public ResponseEntity<DeliveryAddress> getaddressid(@PathVariable("addressid") Integer id)
				{
				DeliveryAddress d=dservice.getByDeliveryId(id);
				return new ResponseEntity<>(d,HttpStatus.OK);
				}

				
				/* // End point to get a DeliveryAddress by their city
				@GetMapping("/get-by-city/{city}")
				public ResponseEntity<DeliveryAddress> getaddresscity(@PathVariable("city") String city)
				{
					DeliveryAddress d=dservice.getByDeliveryAddressCity(city);
					return new ResponseEntity<>(d,HttpStatus.OK);
				}*/
				
			    // End point to get a DeliveryAddress by their pincode
				@GetMapping("/get-by-pincode/{pincode}")
				public ResponseEntity<DeliveryAddress> getpincode(@PathVariable("pincode") Integer pincode)
				{
					DeliveryAddress d=dservice.getByDeliveryPincode(pincode);
					return new ResponseEntity<>(d,HttpStatus.OK);
				}
				
			    		}




