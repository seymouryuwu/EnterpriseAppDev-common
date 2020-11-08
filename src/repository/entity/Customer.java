package repository.entity;

import java.io.Serializable;
import java.util.ArrayList;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@NamedQueries({
	@NamedQuery(name = Customer.GET_ALL_QUERY_NAME, query = "SELECT c FROM Customer c order by c.customerId desc"),
	@NamedQuery(name = Customer.GET_BY_USER, query = "SELECT c FROM Customer c WHERE c.connectUser.username = :username order by c.customerId desc"),
	@NamedQuery(name = Customer.GET_BY_INDUSTRY, query = "SELECT c FROM Customer c WHERE c.industryType.industryTypeId = :industryTypeId order by c.customerId desc"),
})
@Table(name="CUSTOMERS")
public class Customer implements Serializable{
	public static final String GET_ALL_QUERY_NAME = "Customer.getAll";
	public static final String GET_BY_USER = "Customer.getByUser";
	public static final String GET_BY_INDUSTRY = "Customer.getByIndustry";
	
	@Id
	//@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@Column(name = "customer_id")
	private long customerId;
	
	@Column(name = "customer_name")
	private String customerName;
	
	@Embedded
	private Address address;
	
	@OneToMany(mappedBy = "customer")
	private ArrayList<Contact> contacts;
	
	@ManyToOne
	@JoinColumn(name = "connect_user")
	private User connectUser;
	
	@ManyToOne
	@JoinColumn(name = "industry_type")
	private IndustryType industryType;
	
	public Customer() {
		
	}
	
	public Customer(long customerId, String customerName, Address address, ArrayList<Contact> contacts,
			User connectUser, IndustryType industryType) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.address = address;
		this.contacts = contacts;
		this.connectUser = connectUser;
		this.industryType = industryType;
	}
	
	
	public long getCustomerId() {
		return customerId;
	}
	
	public void setCustomerId(long customerId) {
		this.customerId = customerId;
	}
	
	
	public String getCustomerName() {
		return customerName;
	}
	
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	
	
	public Address getAddress() {
		return address;
	}
	
	public void setAddress(Address address) {
		this.address = address;
	}
	
	
	public ArrayList<Contact> getContacts() {
		return contacts;
	}
	
	public void setContacts(ArrayList<Contact> contacts) {
		this.contacts = contacts;
	}
	
	
	public User getConnectUser() {
		return connectUser;
	}
	
	public void setConnectUser(User connectUser) {
		this.connectUser = connectUser;
	}

	public IndustryType getIndustryType() {
		return industryType;
	}

	public void setIndustryType(IndustryType industryType) {
		this.industryType = industryType;
	}
	
}
