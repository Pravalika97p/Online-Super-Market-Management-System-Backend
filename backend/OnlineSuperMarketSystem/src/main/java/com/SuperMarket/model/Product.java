package com.SuperMarket.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
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
public class Product {
	@Id

	private Integer productId;
	private String productName;
	private Integer productPrice;
	private Integer quantityInstock;
	
	@ManyToOne
	@JoinColumn(name = "orderId")
	private Order order;

}
