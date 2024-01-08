package com.SuperMarket.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data

public class Customer 
{
@Id
private Integer customerId;
private String  customerName;
private String  email;
private String  customerAddress;
private Long phoneNumber;



}