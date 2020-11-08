package repository.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import repository.staticValue.Title;

@Entity
@NamedQueries({
	@NamedQuery(name = Contact.GET_BY_CUSTOMER, query = "SELECT c FROM Contact c WHERE c.customer.customerId = :customerId order by c.contactId desc"),
	@NamedQuery(name = Contact.GET_ALL_QUERY_NAME, query = "SELECT c FROM Contact c order by c.contactId desc")
})
@Table(name="CONTACTS")
public class Contact implements Serializable {
	public static final String GET_BY_CUSTOMER = "Contact.getByCustomer";
	public static final String GET_ALL_QUERY_NAME = "Contact.getAll";
	
	@Id
	@Column(name = "contact_id")
	private long contactId;
	
	@Column(name = "contact_name")
    private String contactName;
	
	@Column(name = "title")
	@Enumerated(EnumType.STRING)
    private Title title = Title.UNKNOWN;
	
	@Column(name = "contact_phone_number")
    private String contactPhoneNumber;
	
	@Column(name = "contact_email")
    private String contactEmail;
	
	@ManyToOne
	@JoinColumn(name = "customer_id", nullable = false)
    private Customer customer;

    public Contact() {
    	
    }
    
	public Contact(long contactId, String contactName, Title title, String contactPhoneNumber, String contactEmail,
			Customer customer) {
		super();
		this.contactId = contactId;
		this.contactName = contactName;
		this.title = title;
		this.contactPhoneNumber = contactPhoneNumber;
		this.contactEmail = contactEmail;
		this.customer = customer;
	}

	
	public long getContactId() {
		return contactId;
	}

	public void setContactId(long contactId) {
		this.contactId = contactId;
	}

	
	public String getContactName() {
		return contactName;
	}

	public void setContactName(String contactName) {
		this.contactName = contactName;
	}

	
	public Title getTitle() {
		return title;
	}

	public void setTitle(Title title) {
		this.title = title;
	}

	
	public String getContactPhoneNumber() {
		return contactPhoneNumber;
	}

	public void setContactPhoneNumber(String contactPhoneNumber) {
		this.contactPhoneNumber = contactPhoneNumber;
	}

	
	public String getContactEmail() {
		return contactEmail;
	}

	public void setContactEmail(String contactEmail) {
		this.contactEmail = contactEmail;
	}

	
	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
}
