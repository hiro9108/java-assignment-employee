package ca.java.exercise;

import java.time.LocalDate;

public abstract class Employee {
	
	private String firstName;
	private String lastName;
	private String email;
	private String phoneNumber;
	private LocalDate startDate;
	
	
	public Employee(String firstName, String lastName, String email, String phoneNumber) {
		setFirstName(firstName);
		setLastName(lastName);
		setEmail(email);
		setPhoneNumber(phoneNumber);
		this.startDate = LocalDate.now();
	}
	
	public abstract double calculateIncome();
	
	
	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}
	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		if (firstName.isEmpty() || firstName.equalsIgnoreCase(null)) {
			this.firstName = "Unknown";
		} else {
			this.firstName = firstName;
		}
	}
	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}
	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		if (lastName.isEmpty() || lastName.equalsIgnoreCase(null)) {
			this.lastName = "Unknown";
		} else {
			this.lastName = lastName;
		}
	}
	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}
	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		if (email.isEmpty() || email.equalsIgnoreCase(null)) {
			this.email = "Unknown";
		} else {
			this.email = email;
		}
	}
	/**
	 * @return the phoneNumber
	 */
	public String getPhoneNumber() {
		return phoneNumber;
	}
	/**
	 * @param phoneNumber the phoneNumber to set
	 */
	public void setPhoneNumber(String phoneNumber) {
		if (phoneNumber.isEmpty() || phoneNumber.equalsIgnoreCase(null)) {
			this.phoneNumber = "Unknown";
		} else {
			this.phoneNumber = phoneNumber;
		}
	}
	/**
	 * @return the startDate
	 */
	public LocalDate getStartDate() {
		return startDate;
	}

	
	@Override
	public String toString() {
		return "\nEmployee name is " + firstName + " " + lastName + 
				"\nEmail: " + email +
				"\nPhone: " + phoneNumber +
				"\nWorking start date: " + startDate;
	}
	
}
