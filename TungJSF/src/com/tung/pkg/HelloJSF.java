package com.tung.pkg;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class HelloJSF {
	public String firstName = "John";
	public String lastName = "Doe";

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String sayHello() {
		return "Welcome to JSF from "+firstName+" "+lastName;
	}
}
