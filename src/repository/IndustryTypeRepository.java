package repository;

import java.util.List;

import javax.ejb.Remote;

import repository.entity.IndustryType;

@Remote
public interface IndustryTypeRepository {
	public List<IndustryType> findAllInsdustryTypes();
	
	public void addIndustryType(IndustryType industryType);
	
	public void removeIndustryType(String industryTypeName);
	
	public void updateIndustryType(IndustryType industryType);
	
	public IndustryType findIndustryTypeByName(String industryTypeName);
	
	public IndustryType findIndustryTypeById(int industryTypeId);
}
