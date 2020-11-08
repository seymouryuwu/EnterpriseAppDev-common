package repository;

import java.util.List;

import javax.ejb.Remote;

import repository.entity.Contact;
import repository.entity.Customer;

@Remote
public interface ContactRepository {
	
	public void addContact(Contact contact);
	
	public List<Contact> findAllContacts();
	
	public List<Contact> findContactsByCustomer(Customer customer);
	
	public Contact findContactByContactId(long contactId);
	
	public void updateContact(Contact contact);
	
	public void removeContact(long contactId);
	
	public void deleteContactsByCustomer(Customer customer);

}
