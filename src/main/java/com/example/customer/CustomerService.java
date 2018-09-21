package com.example.customer;

import java.util.List;

public interface CustomerService {
	
	public void save(CustomerModel customer);
	
	public List<CustomerModel> fetchCustomer();

}
