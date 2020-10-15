package com.capgemini.csvandjson;

import com.opencsv.bean.CsvBindByName;

public class CSVUser {
	@CsvBindByName
	private String name;

	@CsvBindByName
	private String email;

	@CsvBindByName
	private String phoneNo;

	@CsvBindByName
	private String country;

	public CSVUser() {

	}

	public CSVUser(String name, String email, String phoneNo, String country) {
		super();
		this.name = name;
		this.email = email;
		this.phoneNo = phoneNo;
		this.country = country;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhoneNo() {
		return this.phoneNo;
	}

	public void setPhno(String phoneNo) {
		this.phoneNo = phoneNo;
	}

	public String getCountry() {
		return this.country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	@Override
	public String toString() {
		return "CSVUser{name='" + name + '\'' + ", email='" + email + ", phnoeNo='" + phoneNo + '\'' + ", country='"
				+ country + '\'' + "}";
	}
}