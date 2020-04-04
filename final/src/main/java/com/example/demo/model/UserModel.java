package com.example.demo.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.Size;

import com.sun.istack.NotNull;

@Entity // faz com que essa clase represente um entidade no banco de dados
@Table (name = "users") // nome da tabela
public class UserModel implements Serializable{
	
	private long id;
	private String firstName;	
	private String lastName;	
	private Date dateOfBirth;	
    private String address;
    private String street;
    private String city;
    private String state;
    private String country;
	private String email;	
	private String password;	
	private boolean status;
	private UserProfileModel profile;
	
	public UserModel() {
		super();
		// TODO Auto-generated constructor stub
	}
	


	public UserModel(String firstName, String lastName, Date dateOfBirth, 
			String address, String email, String password) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.dateOfBirth = dateOfBirth;
		this.address = address;
		this.email = email;
		this.password = password;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}
	
	@Column (name = "street")
	public String getStreet() {
		return street;
	}



	public void setStreet(String street) {
		this.street = street;
	}


	@Column (name = "city")
	public String getCity() {
		return city;
	}


	
	public void setCity(String city) {
		this.city = city;
	}



	@Column (name = "state")
	public String getState() {
		return state;
	}



	public void setState(String state) {
		this.state = state;
	}



	@Column (name = "country")
	public String getCountry() {
		return country;
	}



	public void setCountry(String country) {
		this.country = country;
	}



	@NotNull
	@Column(name = "firstName")
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	@NotNull
	@Column(name = "lastName")
	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	@NotNull
	@Column(name = "dateOfBirth")
	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}


	@NotNull
	@Column(name = "address")
	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@NotNull
	@Column(name = "email")
	@Size(max = 100)
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@NotNull
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@NotNull
	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}


	@OneToOne (mappedBy = "user", cascade = CascadeType.ALL)
	public UserProfileModel getProfile() {
		return profile;
	}



	public void setProfile(UserProfileModel profile) {
		this.profile = profile;
	}



	@Override
	public String toString() {
		return "UserModel [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", dateOfBirth="
				+ dateOfBirth + ", address=" + address + ", street=" + street + ", city=" + city + ", state=" + state
				+ ", country=" + country + ", email=" + email + ", password=" + password + ", status=" + status
				+ ", profile=" + profile + "]";
	}
	
	
	
}
