package com.SuperMarket.model;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.Data;

@Entity
@Data

public class DeliveryAddress {
	
	@Id
	private Integer deliveryId; 
    private String streetAddress;
	private String city;
	private String state;
	private Integer deliveryPincode;
	

@ManyToOne 
@JoinColumn(name = "customerId") 
private Customer customer;

@OneToMany(mappedBy = "deliveryAddress")
private List<Order> orders;
}



