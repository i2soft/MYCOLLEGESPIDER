package com.collegespider.domain;

import java.io.Serializable;

import javax.persistence.*;



@SuppressWarnings("serial")
@Entity(name = "User")
@Table(name = "user")
public class User implements Serializable{

    @Id
    @GeneratedValue
    @Column(name = "id")
    private Long       id;

    @Column(name = "name")
    private String     name;
    
    @Column(name = "email")
    private String     email;
    
    @Column(name = "password")
    private String     password;
    
    @Column(name = "usertype")
    private String     usertype;
    
    
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUsertype() {
		return usertype;
	}

	public void setUsertype(String usertype) {
		this.usertype = usertype;
	}

	

    

	

}
