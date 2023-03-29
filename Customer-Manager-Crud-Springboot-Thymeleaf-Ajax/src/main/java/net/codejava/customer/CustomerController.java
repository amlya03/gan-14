package net.codejava.customer;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CustomerController {
	
	@Autowired
	private CustomerService service;
	
	@GetMapping("/")
	public String list() {
		return "customer";
	} 
	
	@GetMapping("/list")
	public String home(Model model) {
		List<Customer> listCustomers = service.listAll();
		model.addAttribute("listCustomers", listCustomers);
		return "display";
	} 
	
	@GetMapping("/newCustomerForm")
	public String newCustomerForm(Model model) {
		Customer customer = new Customer();
	    model.addAttribute("customer", customer);
	    return "new_customer";
	}
	
	@PostMapping("/saveCustomer")
	public String saveCustomer(@ModelAttribute("customer") Customer customer) {
	    service.saveCustomer(customer);
	    return "redirect:/";
	}

	@GetMapping("/editCustomerForm/{id}")
	public String editCustomerForm(@PathVariable(value = "id") long id, Model model) {
	    Customer customer = service.getCustomerById(id);
	    model.addAttribute("customer", customer);
	    return "edit_customer";
	}

	@GetMapping("/deleteCustomer/{id}")
	public String deleteCustomer(@PathVariable(value = "id") long id) {
	    service.deleteCustomerById(id);
	    return "redirect:/";       
	}
	
	@GetMapping("/search")
	public String search(@RequestParam("keyword") String keyword, Model model) {
	    List<Customer> listCustomers = service.search(keyword);
	    model.addAttribute("listCustomers", listCustomers);
	    model.addAttribute("title", "Search Result");
	    return "search";    
	}
}