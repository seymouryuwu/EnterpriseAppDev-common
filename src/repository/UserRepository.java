package repository;

import java.util.List;

import javax.ejb.Remote;

import repository.entity.Customer;
import repository.entity.User;

@Remote
public interface UserRepository {
	
	public User createUser(User user);
	
	public User findUserByUsername(String username);
	
	public User findUserByCustomer(Customer customer);
	
	public User changePassword(User user);
	
	public List<User> findAllUsers();
	
	public String findUserGroup(String username);

	void changeUserGroup(User user);

	void removeUserGroup(User user);

	void removeUser(String username);
}
