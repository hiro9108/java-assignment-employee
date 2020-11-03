package ca.java.exercise;

public class HourlyEmployee extends Employee {
	
	private double payRate;
	private double hoursWorking;
	
	public HourlyEmployee(String firstName, String lastName, String email, String phoneNumber, double payRate, double hoursWorking) {
		super(firstName, lastName, email, phoneNumber);
		setPayRate(payRate);
		setHoursWorking(hoursWorking);
	}
	
	
	/**
	 * @return the payRate
	 */
	public double getPayRate() {
		return payRate;
	}
	/**
	 * @param payRate the payRate to set
	 */
	public void setPayRate(double payRate) {
		if (payRate > 0) {
			this.payRate = payRate;
		} else {
			this.payRate = -1;
		}
	}
	/**
	 * @return the hoursWorking
	 */
	public double getHoursWorking() {
		return hoursWorking;
	}
	/**
	 * @param hoursWorking the hoursWorking to set
	 */
	public void setHoursWorking(double hoursWorking) {
		if (hoursWorking >= 0 && hoursWorking <= 40) {
			this.hoursWorking = hoursWorking;
		} else {
			this.hoursWorking = -1;
		}
		
	}


	@Override
	public double calculateIncome() {
		return payRate * hoursWorking;
	}
	
	@Override
	public String toString() {
		return super.toString() +
				"\nPay Rate($/h): " + payRate + 
				"\nHours Working: " + hoursWorking +
				"\nTotal Income: $" + calculateIncome();
	}
	
}
