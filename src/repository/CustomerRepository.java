package repository;

import java.util.List;

import javax.ejb.Remote;

import repository.entity.Contact;
import repository.entity.Customer;
import repository.entity.IndustryType;
import repository.entity.User;

@Remote
public interface CustomerRepository {
	
	public void createCustomer(Customer customer);
	
	public List<Customer> findCustomersByConnectUser(User connectUser);
	
	public Customer findCustomerByCustomerId(long customerId);
	
	public List<Customer> findCustomerByIndustryType(IndustryType industryType);
	
	public Customer findCustomerByContact(Contact contact);
	
	public List<Customer> findAllCustomers();
	
	public void updateCustomer(Customer customer);
	
	public void removeCustomer(long customerId);
	
	public void addCustomer(Customer customer);
	
}
