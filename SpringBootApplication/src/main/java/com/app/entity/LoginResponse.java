package com.app.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="USER_LOGIN_DETAILS")
public class LoginResponse implements Serializable {

	/**
	 * 
	 */
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	public LoginResponse(long id, String userName, String password) {
		super();
		this.id = id;
		this.userName = userName;
		this.password = password;
	}

	private String userName;
	
	private String password;

	public String getUserName() {
		return userName;
	}

	@Override
	public String toString() {
		return "LoginResponse [id=" + id + ", userName=" + userName + ", password=" + password + "]";
	}
	public LoginResponse() {
		super();
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}
