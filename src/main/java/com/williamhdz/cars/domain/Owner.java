package com.williamhdz.cars.domain;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@Table(name = "owners")
public class Owner {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "OWNER_ID")
	private Long ownerid;
	
	@Column(name = "OWNER_FIRSTNAME")
	private String firstname;
	
	@Column(name = "OWNER_LASTNAME")
	private String lastname;

	public Owner() {
		
	}

	public Owner(String firstname, String lastname) {
		this.firstname = firstname;
		this.lastname = lastname;
	}
	
	@JsonIgnore
	@OneToMany(cascade=CascadeType.ALL, mappedBy="owner")
	private List<Car> cars;
	
	public List<Car> getCars()  {
		return cars;
	}
	
	public void setCars(List<Car> cars)  {
		this.cars = cars;
	}

	public Long getOwnerid() {
		return ownerid;
	}

	public void setOwnerid(Long ownerid) {
		this.ownerid = ownerid;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

}
