package com.project2.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="User_Registration")
public class User {
	@Id
	private String username;
	private String firstname;
	private String lastname;
	private String emailid;
	private String password;
	private String mobilenumber;
	private String dob;
	@Column(name="online_status")
	private boolean online;
	

}
