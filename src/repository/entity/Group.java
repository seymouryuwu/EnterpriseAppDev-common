package repository.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name = "GROUPS")
@NamedQueries({ 
	@NamedQuery(name = Group.GET_BY_USERNAME, query = "SELECT g FROM Group g WHERE g.username = :username"),
})
public class Group implements Serializable {
	public static final String NORMAL_USER = "normal";
	public static final String GET_BY_USERNAME = "Group.getByUsername";
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@Column(name = "id")
	private long id;

	@Column(name = "username", nullable = false)
	private String username;

	@Column(name = "groupname", nullable = false)
	private String groupname;

	public Group() {

	}

	public Group(String username, String groupname) {
		this.username = username;
		this.groupname = groupname;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getGroupname() {
		return groupname;
	}

	public void setGroupname(String groupname) {
		this.groupname = groupname;
	}
}
