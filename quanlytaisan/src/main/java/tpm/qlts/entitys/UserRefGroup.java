package tpm.qlts.entitys;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The persistent class for the User_Group database table.
 * 
 */
@Entity
@Table(name = "User_Group")
@NamedQuery(name = "UserRefGroup.findAll", query = "SELECT u FROM UserRefGroup u")
public class UserRefGroup implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private UserRefGroupPK id;

	// bi-directional many-to-one association to Group
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "GroupID", updatable = false, insertable = false)
	private Group group;

	// bi-directional many-to-one association to User
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "UserID", updatable = false, insertable = false)
	private Users user;

	public UserRefGroup() {
	}

	public UserRefGroupPK getId() {
		return this.id;
	}

	public void setId(UserRefGroupPK id) {
		this.id = id;
	}

	public Group getGroup() {
		return this.group;
	}

	public void setGroup(Group group) {
		this.group = group;
	}

	public Users getUser() {
		return this.user;
	}

	public void setUser(Users user) {
		this.user = user;
	}

}