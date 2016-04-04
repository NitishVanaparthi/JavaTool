package org.jnit.webService;

import java.util.List;

import javax.ws.rs.core.Response;

import org.jnit.dao.CustomerDao;
import org.jnit.exceptions.CustomerNotFoundException;
import org.jnit.model.Customer;
import org.springframework.beans.factory.annotation.Autowired;

public class CustomerServiceImpl implements CustomerSevice {

	@Autowired
	CustomerDao customerDao ;

	@Override
	public Response createCustomer(String cname, String street, String state, String city, String country, String zipCode) {
		Customer customer = new Customer(cname, street, city, state, country, zipCode);
		customerDao.createCustomer(customer);
		return Response.ok().build();
	}

	@Override
	public String updadateCustomer(String cname, int customerId) {
		
		customerDao.updateCustomer(cname, customerId);
		return null;
	}

	@Override
	public String deleteCustomer(int customerId) {
		customerDao.deleteById(customerId);
		return "DELETED";
	}

	@Override
	public Customer getCustomer(int customerId) throws CustomerNotFoundException {
		try {
			Customer customer = customerDao.getCustomerById(customerId);
			if (customer == null) {
				throw new CustomerNotFoundException("Customer Id with" + customerId + "does not exist");
			}
			return customer;
		} catch (Exception e) {
			e.printStackTrace();
		}

		return null;
	}

	@Override
	public List<Customer> getAllCustomers() {
		try {
			List<Customer> list = customerDao.getAllCustomer();

			return list;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

}
