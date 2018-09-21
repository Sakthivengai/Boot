package com.example.customer;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerServiceImpl implements CustomerService{

	@Autowired
	CustomerRepository custRep;
	
	@Override
	public void save(CustomerModel customer) {
		custRep.save(customer);		
	}

	@Override
	public List<CustomerModel> fetchCustomer() {
		List<CustomerModel> list = (List<CustomerModel>) custRep.findAll();
		return list;
	}
	

}
