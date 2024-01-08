package com.SuperMarket.ServiceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.SuperMarket.Repository.ProductRepo;
import com.SuperMarket.model.Product;
import com.SuperMarket.service.ProductService;

//Service class
	@Service
	public class ProductServiceImpl implements ProductService
	{
	   @Autowired
		private ProductRepo prepo;
	   
		/*public ProductServiceImpl(ProductRepo prepo)
		{
		super();
		this.prepo = prepo;
	    }*/
	   
		//Get Product by its Id
	   @Override
		public Product getProduct(Integer id) 
	    {
			Optional<Product> a=prepo.findById(id);
			Product a1=a.get();
			return a1;
		}
	   //Retrieve all Products
		@Override
		public List<Product> getAllProducts()
		{
			List<Product> b=prepo.findAll();
			return b;
		}
		//Insert a new Product
		@Override
		public String insertProduct(Product p) 
		{
			prepo.save(p);
			return " One record has been inserted";
		}
		//Update an existing product
		@Override
		public String updateProduct(Product p) 
		{
			prepo.save(p);
			return " One record has been updated";
		}
		//Delete an event by its id
		@Override
		public String deleteProduct(Integer id) 
		{
			prepo.deleteById(id);
			return " One record has been deleted";
		}
		
		//Get an product by its name
		@Override
		public Product getByProductName(String name)
		{
			Product productName=prepo.findByProductName(name);
			return productName;
		}
		//Get an product by its price
		@Override
		public Product getByProductPrice(Integer productprice) 
		{
			Product productPrice=prepo.findByProductPrice(productprice);
			return productPrice;
		}
		@Override
		public Product getByProductId(Integer productid) 
		{
			Product productId=prepo.findByProductId(productid);
			return productId;
		}
		
	}



