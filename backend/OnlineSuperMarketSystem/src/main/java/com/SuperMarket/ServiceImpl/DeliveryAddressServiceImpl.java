package com.SuperMarket.ServiceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.SuperMarket.Repository.DeliveryAddressRepo;
import com.SuperMarket.model.DeliveryAddress;
import com.SuperMarket.service.DeliveryAddressService;

//Service class
		@Service
		public class DeliveryAddressServiceImpl implements DeliveryAddressService 
		{
		  @Autowired
		 private DeliveryAddressRepo drepo;
		  
		  /*public DeliveryAddressServiceImpl(DeliveryAddressRepo drepo)
		  {
				super();
				this.drepo = drepo;
			}*/
		  
		  // Retrieve a DeliveryAddress by their ID
		  @Override
			public DeliveryAddress getDeliveryAddress(Integer id)
			{
				Optional<DeliveryAddress> a=drepo.findById(id);
				DeliveryAddress a1=a.get();
				return a1;
			}
		  // Retrieve all DeliveryAddress
		  @Override
			public List<DeliveryAddress> getAllDeliveryAddress()
			{
				List<DeliveryAddress> d=drepo.findAll();
				return d;
			}
		  //insert a new DeliveryAddress
			@Override
			public String insertDeliveryAddress(DeliveryAddress d) 
			{
				drepo.save(d);
				return "One record has been inserted";
			}
			//update an existing customer
			@Override
			public String updateDeliveryAddress(DeliveryAddress d) 
			{
				drepo.save(d);
				return "One record has been updated";
			}
			// Delete a DeliveryAddress by their 
			@Override
			public String deleteDeliveryAddress(Integer id) 
			{
				drepo.deleteById(id);
				return "One record has been deleted";
			}
		  
			//get a DeliveryAddress by their pincode
			@Override
			public DeliveryAddress getByDeliveryPincode(Integer pincode)
			{
				DeliveryAddress DeliveryPinCode=drepo.findByDeliveryPincode(pincode);
				return DeliveryPinCode;
			}
			@Override
			public DeliveryAddress getByDeliveryId(Integer id) {
				DeliveryAddress DeliveryId=drepo.findByDeliveryId(id);
				return DeliveryId;
			}
			/*@Override
			public DeliveryAddress getByDeliveryAddressCity(String city) {
				DeliveryAddress DeliveryAddressCity=drepo.findByDeliveryAddressCity(city);
				return DeliveryAddressCity;
						}*/


}
