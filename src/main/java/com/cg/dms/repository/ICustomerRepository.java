package com.cg.dms.repository;

import com.cg.dms.entities.Customer;
import com.cg.dms.exception.CustomerNotFoundException;

public interface ICustomerRepository {
	public Customer insertCustomer(Customer customer);
	public Customer updateCustomer(Customer customer) throws CustomerNotFoundException;
	public Customer deleteCustomer(Customer customer) throws CustomerNotFoundException;
	public Customer viewCustomer(int customerId) throws CustomerNotFoundException;
	public Customer validateCustomer(String username, String password) throws CustomerNotFoundException;
}