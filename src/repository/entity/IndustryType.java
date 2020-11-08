package repository.entity;

import java.io.Serializable;
import java.util.ArrayList;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="INDUSTRY_TYPES")
public class IndustryType  implements Serializable{
	@Id
	@Column(name = "industry_type_id")
	private int industryTypeId;
	
	@Column(name="industry_type")
	private String industryType = "Unknown";
	
	@OneToMany(mappedBy = "industryType")
	private ArrayList<Customer> customers = new ArrayList<>();
	
	public IndustryType() {
		
	}
	
	public IndustryType(String industryType) {
		super();
		this.industryType = industryType;
	}

	

	public int getIndustryTypeId() {
		return industryTypeId;
	}

	public void setIndustryTypeId(int industryTypeId) {
		this.industryTypeId = industryTypeId;
	}

	public String getIndustryType() {
		return industryType;
	}



	public void setIndustryType(String industryType) {
		this.industryType = industryType;
	}

	public ArrayList<Customer> getCustomers() {
		return customers;
	}

	public void setCustomers(ArrayList<Customer> customers) {
		this.customers = customers;
	}

	@Override
	public String toString() {
		return industryType;
	}
}
