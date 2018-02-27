package model;

public class AccountBean {
	@SuppressWarnings("unused")
	private int accountId;
	private String username;
	private String password;
	private String lastName;
	private String middleName;
	private String firstName;
	private int roleId;
	
	
	public AccountBean() {
		super();
	}


	public AccountBean(String username, String lastName, String middleName, String firstName, int roleId) {
		this.username = username;
		this.lastName = lastName;
		this.middleName = middleName;
		this.firstName = firstName;
		this.roleId = roleId;
	}
	
	
	public AccountBean(int accountId, String username, String lastName, String middleName,
			String firstName, int roleId) {
		this.accountId = accountId;
		this.username = username;
		this.lastName = lastName;
		this.middleName = middleName;
		this.firstName = firstName;
		this.roleId = roleId;
	}


	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getMiddleName() {
		return middleName;
	}
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public int getRoleId() {
		return roleId;
	}
	public void setRoleId(int roleId) {
		this.roleId = roleId;
	}
}
