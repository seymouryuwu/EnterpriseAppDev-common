package repository.entity;

import java.io.Serializable;
import java.util.ArrayList;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@NamedQueries({ 
	@NamedQuery(name = User.GET_BY_USERNAME, query = "SELECT u FROM User u WHERE u.username = :username"),
	@NamedQuery(name = User.GET_ALL, query = "SELECT u FROM User u"),
	@NamedQuery(name = User.GET_GROUP, query = "SELECT g.groupname FROM Group g WHERE g.username = :username")
})
@Table(name = "USERS")
public class User implements Serializable {
	public static final String GET_BY_USERNAME = "User.getByUsername";
	public static final String GET_ALL = "User.getAll";
	public static final String GET_GROUP = "User.getUserGroup";

	@Id
	@Column(name = "username", nullable = false)
	private String username;

	@Column(name = "password", nullable = false)
	private String password;
	
	@OneToMany(mappedBy = "connectUser")
	private ArrayList<Customer> customers = new ArrayList<>();

	public User() {

	}

	public User(String username, String password, ArrayList<Customer> customers) {
		this.password = password;
		this.username = username;
		this.customers = customers;
	}
	
	public User(String username, String password) {
		this.password = password;
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}
}
