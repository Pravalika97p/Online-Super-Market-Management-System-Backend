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

import com.SuperMarket.ServiceImpl.ProductServiceImpl;
import com.SuperMarket.model.Product;
import com.SuperMarket.service.ProductService;

// RestController for handling Payment related endpoints
@RestController
@CrossOrigin
public class ProductController {


	    @Autowired
	    private ProductServiceImpl pservice; // Autowired PaymentService
	    /*public ProductController(ProductService pservice) {
	    	super();
	        this.pservice = pservice;
	    }*/

	    // Endpoint to get all payments
	    @GetMapping("/getallproducts")
	    public ResponseEntity<List<Product>> getall() 
	    {
	    	 List<Product> list = pservice.getAllProducts();
	        return new ResponseEntity<>(list, HttpStatus.OK);
	    }

	    // Endpoint to insert a new payment
	    @PostMapping("/insertproducts")
	    public ResponseEntity<String> insertproducts(@RequestBody Product p) 
	    {
	        String s = pservice.insertProduct(p);
	        return new ResponseEntity<>(s, HttpStatus.CREATED);
	    }

	    // Endpoint to get a payment by its ID
	    @GetMapping("/getProduct/{id}")
	    public ResponseEntity<Product> getproduct(@PathVariable("id") Integer id)
	    {
	    	Product p = pservice.getProduct(id);
	        return new ResponseEntity<>(p, HttpStatus.OK);
	    }

	    // Endpoint to update an existing Product
	    @PutMapping("/updateProduct")
	    public ResponseEntity<String> updateproduct(@RequestBody Product p)
	    {
	        String s = pservice.updateProduct(p);
	        return new ResponseEntity<>(s, HttpStatus.CREATED);
	    }

	    // Endpoint to delete a Product by its ID
	    @DeleteMapping("/deleteProduct/{id}")
	    public ResponseEntity<String> deleteproduct(@PathVariable("id") Integer id) {
	        String s = pservice.deleteProduct(id);
	        return new ResponseEntity<>(s, HttpStatus.OK);
	    }

	    // Endpoint to get a Product by its name
	    @GetMapping("/get-by-name/{name}")
	    public ResponseEntity<Product> getname(@PathVariable("name") String name) {
	    	Product p = pservice.getByProductName(name);
	        return new ResponseEntity<>(p, HttpStatus.OK);
	    }

	    // Endpoint to get a Product by its price
	    @GetMapping("/get-by-price/{price}")
	    public ResponseEntity<Product> getproductprice(@PathVariable("productprice") Integer productprice) {
	    	Product p = pservice.getByProductPrice(productprice);
	        return new ResponseEntity<>(p, HttpStatus.OK);
	    }
	    
	 // Endpoint to get a Product by its id
	    @GetMapping("/get-by-id/{id}")
	    public ResponseEntity<Product> getproductid(@PathVariable("productid") Integer productid) {
	    	Product p = pservice.getByProductId(productid);
	        return new ResponseEntity<>(p, HttpStatus.OK);
	    }

	}



