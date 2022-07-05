package com.example.pruebanobeluno.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="personajes")
public class PruebaUno {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	private String Name;
	private String Status;
	private String Gender;
	private String Image;
	
	
	public PruebaUno() {
		super();
	}
	
	public PruebaUno(Integer id, String name, String status, String gender, String image) {
		super();
		this.id = id;
		this.Name = name;
		this.Status = status;
		this.Gender = gender;
		this.Image = image;
	}
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		this.Name = name;
	}
	
	public String getStatus() {
		return Status;
	}
	
	public void setStatus(String status) {
		this.Status = status;
	}
	public String getGender() {
		return Gender;
	}
	public void setGender(String gender) {
		this.Gender = gender;
	}

	public String getImage() {
		return Image;
	}

	public void setEmail(String email) {
		this.Image = email;
	}


}
