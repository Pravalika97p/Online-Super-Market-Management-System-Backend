package com.SuperMarket.model;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Data
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Table (name="orders")
public class Order {
	@Id
	private Integer customerId;
	private Integer orderId;
	private Integer totalAmount;
	private String orderDate;
	private String orderStatus;
	private String orderItem;
	
	@OneToMany(mappedBy = "order")
	private List<Product> products;	
	
	@ManyToOne
	@JoinColumn(name = "deliveryId")
	private DeliveryAddress deliveryAddress;
	
}

