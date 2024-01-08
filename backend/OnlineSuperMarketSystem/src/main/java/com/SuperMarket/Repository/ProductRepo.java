package com.SuperMarket.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.SuperMarket.model.Product;
@Repository
public interface ProductRepo extends JpaRepository <Product,Integer> 
{
	
	public Product findByProductName(String name); //method to find an Product by Product name
	public Product findByProductPrice(Integer productprice);//method to find an Product by Product price
	public Product findByProductId(Integer productid);//method to find an Product by Product id

}

