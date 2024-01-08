package com.SuperMarket.service;

import java.util.List;

import com.SuperMarket.model.DeliveryAddress;

public interface DeliveryAddressService {
	
	public DeliveryAddress getDeliveryAddress(Integer id);//Retrieve a  by their DeliveryAddress id
	public List<DeliveryAddress>getAllDeliveryAddress();//Retrieve all DeliveryAddress
	public String insertDeliveryAddress(DeliveryAddress d);//Insert a new DeliveryAddress
	public String updateDeliveryAddress(DeliveryAddress d);//Update an existing DeliveryAddress
	public String deleteDeliveryAddress(Integer id);//delete event by their id


	public DeliveryAddress getByDeliveryId(Integer id);// method to find a DeliveryAddress by AddressId

	public DeliveryAddress getByDeliveryPincode(Integer pincode);// method to find a DeliveryAddress by pincode
	
	/*public DeliveryAddress getByDeliveryAddressCity(String city);// method to find a DeliveryAddress by City*/


}
