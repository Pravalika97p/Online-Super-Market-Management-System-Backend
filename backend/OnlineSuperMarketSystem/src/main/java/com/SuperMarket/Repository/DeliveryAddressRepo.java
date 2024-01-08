package com.SuperMarket.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.SuperMarket.model.DeliveryAddress;

@Repository

	public interface DeliveryAddressRepo extends JpaRepository <DeliveryAddress,Integer>
	{
		public DeliveryAddress findByDeliveryId(Integer id);// method to find a DeliveryAddress by Id

		public DeliveryAddress findByDeliveryPincode(Integer pincode);// method to find a DeliveryAddress by pincode

		
		

		
		
		  
	}



