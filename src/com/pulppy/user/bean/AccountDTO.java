package com.pulppy.user.bean;

public class AccountDTO {
	private String username;
	private String password;
	private String id;
	private String email;

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
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

	public AccountDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public AccountDTO(String username, String password, String id, String email) {
		super();
		this.username = username;
		this.password = password;
		this.id = id;
		this.email = email;
	}

}
