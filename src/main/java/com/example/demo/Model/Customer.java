package com.example.demo.Model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
//model class to put dtable values
@Entity
public class Customer {
	@Id
	private Long Id;
	private String name;
	private Date doj;
	private String city;
	private int cno;

	public Long getId() {
		return Id;
	}

	public void setId(Long id) {
		Id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getDoj() {
		return doj;
	}

	public void setDoj(Date doj) {
		this.doj = doj;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getCno() {
		return cno;
	}

	public void setCno(int cno) {
		this.cno = cno;
	}

}
