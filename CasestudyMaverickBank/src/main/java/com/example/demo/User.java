package com.example.demo;
import jakarta.persistence.*;
import java.util.Date;

@Entity
@Table(name = "users") 

public class User {
	
	    @Column(name = "firstname")
	    private String firstname;

	    @Column(name = "lastname")
	    private String lastname;

	    @Temporal(TemporalType.DATE)
	    @Column(name = "dateofbirth")
	    private Date dateOfBirth;

	    @Column(name = "gender")
	    private char gender;

	    @Column(name = "contact_number")
	    private String contactNumber;

	    @Column(name = "address")
	    private String address;

	    @Column(name = "city")
	    private String city;

	    @Column(name = "state")
	    private String state;

	    @Column(name = "aadhar_num", nullable = true, unique = true)  
	    private String aadharNum;

	    @Column(name = "pan_num", nullable = true, unique = true)  
	    private String panNum;

	    @Column(name = "status", nullable = false)
	    private String status;

	    @Id
	    @Column(name = "username", nullable = false, unique = true)
	    private String username;

	    @Column(name = "emailid", nullable = false, unique = true)
	    private String emailid;

	    public User() {
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

	    public Date getDateOfBirth() {
	        return dateOfBirth;
	    }

	    public void setDateOfBirth(Date dateOfBirth) {
	        this.dateOfBirth = dateOfBirth;
	    }

	    public char getGender() {
	        return gender;
	    }

	    public void setGender(char gender) {
	        this.gender = gender;
	    }

	    public String getContactNumber() {
	        return contactNumber;
	    }

	    public void setContactNumber(String contactNumber) {
	        this.contactNumber = contactNumber;
	    }

	    public String getAddress() {
	        return address;
	    }

	    public void setAddress(String address) {
	        this.address = address;
	    }

	    public String getCity() {
	        return city;
	    }

	    public void setCity(String city) {
	        this.city = city;
	    }

	    public String getState() {
	        return state;
	    }

	    public void setState(String state) {
	        this.state = state;
	    }

	    public String getAadharNum() {
	        return aadharNum;
	    }

	    public void setAadharNum(String aadharNum) {
	        this.aadharNum = aadharNum;
	    }

	    public String getPanNum() {
	        return panNum;
	    }

	    public void setPanNum(String panNum) {
	        this.panNum = panNum;
	    }

	    public String getStatus() {
	        return status;
	    }

	    public void setStatus(String status) {
	        this.status = status;
	    }

	    public String getUsername() {
	        return username;
	    }

	    public void setUsername(String username) {
	        this.username = username;
	    }

	    public String getEmailid() {
	        return emailid;
	    }

	    public void setEmailid(String emailid) {
	        this.emailid = emailid;
	    }

		@Override
		public String toString() {
			return "User [firstname=" + firstname + ", lastname=" + lastname + ", dateOfBirth=" + dateOfBirth
					+ ", gender=" + gender + ", contactNumber=" + contactNumber + ", address=" + address + ", city="
					+ city + ", state=" + state + ", aadharNum=" + aadharNum + ", panNum=" + panNum + ", status="
					+ status + ", username=" + username + ", emailid=" + emailid + "]";
		}
	    
}
	


