package org.jnit.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.jnit.model.Customer;
import org.springframework.jdbc.core.RowMapper;

public class CustomerRowMapper implements RowMapper<Customer> {

	@Override
	public Customer mapRow(ResultSet rs, int rowNum) throws SQLException {
		Customer customer = new Customer(rs.getString("cname"), rs.getString("street"), rs.getString("city"), rs.getString("state"), rs.getString("country"), rs.getString("zipCode"));
		return customer;
	}

}
