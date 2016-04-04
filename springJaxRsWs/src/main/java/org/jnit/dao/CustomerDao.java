package org.jnit.dao;

import java.util.List;

import org.jnit.model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class CustomerDao {
	@Autowired
	private JdbcTemplate jdbcTemplate;

	public void createCustomer(Customer customer) {

		String query = "insert into customer(cname, street, city, state, country, zipCode ) values(?, ?, ?, ?, ?, ?)";
		int rowCount = jdbcTemplate.update(
				query,
				new Object[] { customer.getCname(), customer.getStreet(),
						customer.getCity(), customer.getState(),
						customer.getCountry(), customer.getZipCode() });
		System.out.println(rowCount);

	}

	public Customer getCustomerById(int customerId) {
		String query = "select * from customer where customerId=?";
		return jdbcTemplate.queryForObject(query, new Object[] { customerId },
				new CustomerRowMapper());
	}

	public void deleteById(int customerId) {
		String query = "delete from customer where customerId=?";
		jdbcTemplate.update(query, new Object[] { customerId });
	}

	public void updateCustomer(String cname, int customerId) {
		String query = "update Customer set cname=? where customerid=?";
		jdbcTemplate.update(query, new Object[] { cname, customerId });
	}

	public List<Customer> getAllCustomer() {
		String query = "select * from Customer";
		return jdbcTemplate.query(query, new CustomerRowMapper());

	}
	
	public List<Customer> getByCity(String city){
		String query = "select * from Customer where city=?";
		return jdbcTemplate.query(query, new CustomerRowMapper());
	}
	
	

}
