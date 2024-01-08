package com.SuperMarket.service;

import java.util.List;

import com.SuperMarket.model.Product;

public interface ProductService {
	
	
	public Product getProduct(Integer id);//Retrieve a Product by their id
	public List<Product>getAllProducts();//Retrieve all Products
	public String insertProduct(Product p);//Insert a new Product
	public String updateProduct(Product p);//Update an existing Product
	public String deleteProduct(Integer id);//delete Product by their id


	public Product getByProductName(String name);//method to get a Product by its name
	public Product getByProductPrice(Integer productprice);//method to get a Product by its price
	public Product getByProductId(Integer productid);//method to get a product by its id
	}



