package org.jnit.jaxRsController;

import java.util.List;

import org.jnit.dao.CustomerDao;
import org.jnit.model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/customer")
public class CustomerController {

	@Autowired
	CustomerDao customerdao;

	@RequestMapping(value = "create", method = RequestMethod.POST)
	public String createCustomer(Customer customer, BindingResult result) {

		customerdao.createCustomer(customer);

		return "customer";
	}

	@RequestMapping(value = "/createPage", method = RequestMethod.GET)
	public String loadCustomerPage(Model model) {
		model.addAttribute("customer", new Customer());
		return "customer";

	}

	@RequestMapping(value = "delete", method = RequestMethod.POST)
	public String deleteCustomer(int customerId) {
		customerdao.deleteById(customerId);
		return "delete";
	}

	@RequestMapping(value = "/deletePage", method = RequestMethod.GET)
	public String deletebyId(Model model, Customer customer) {
		model.addAttribute("delete", new Customer());
		return "delete";
	}

	@RequestMapping(value = "update", method = RequestMethod.POST)
	public String updateCustomer(String cname, int customerId) {
		customerdao.updateCustomer(cname, customerId);
		return "updateCust";
	}

	@RequestMapping(value = "/updatePage", method = RequestMethod.GET)
	public String updateCustom(Model model, Customer customer) {
		model.addAttribute("update", new Customer());
		return "updateCust";
	}

	@RequestMapping(value = "/findAll", method = RequestMethod.GET)
	public String findAllCustomers(Model model) {
		List<Customer> list = customerdao.getAllCustomer();
		model.addAttribute("customer", list);
		return "getAll";
	}

	@RequestMapping(value = "findACustomer", method = RequestMethod.POST)
	public String getById(int customerId, Model model) {
		Customer customer = customerdao.getCustomerById(customerId);
		model.addAttribute("printCust", customer);
		return "printCustomer";
	}

	@RequestMapping(value = "/findACustomerPage", method = RequestMethod.GET)
	public String findById(Customer customer, Model model) {
		model.addAttribute("findCust", new Customer());
		return "findCustomer";
	}

}
