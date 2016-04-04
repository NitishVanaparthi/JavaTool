package org.jnit.webService;

import java.util.List;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Response;

import org.jnit.exceptions.CustomerNotFoundException;
import org.jnit.model.Customer;

@Path("/customerService/")
public interface CustomerSevice {
	//http://localhost:8080/appName/rest/customerService/create?cname=x&city=y&state=z&country=p&zipcode=r
	//http://localhost:8080/appName/rest/customerService/create/x/y/z/p/r	
	@Path("create")
	@Produces("application/json")
	@POST
	public Response createCustomer(@QueryParam("cname")String cname, String street, String city, String state, String country, String zipCode);
	
	@Path("update")
	@Produces("application/json")
	@PUT
	public String updadateCustomer(@QueryParam("cname") String cname, @QueryParam("customerId") int customerId);
	
	@Path("delete")
	@Produces("application/json")
	@DELETE
	public String deleteCustomer(@QueryParam("customerId") int customerId);
	
	@Path("findCustomer")
	@Produces("application/json")
	@GET
	public Customer getCustomer(@QueryParam("customerId") int customerId) throws CustomerNotFoundException;
	
	@Path("findCustomers")
	@Produces({"application/json", "application/xml"})
	@GET
	public List<Customer> getAllCustomers() throws CustomerNotFoundException;
}
