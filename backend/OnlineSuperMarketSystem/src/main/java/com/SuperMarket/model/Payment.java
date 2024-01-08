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
public class Payment {
	
	
	@Id
	private Integer paymentId;
	private String  paymentMode;
	private String  paymentDate;
	private Integer paymentAmount;
	private Integer orderId;

	
	@ManyToOne
	@JoinColumn(name = "customerId")
	private Customer customer;
	
	
}
