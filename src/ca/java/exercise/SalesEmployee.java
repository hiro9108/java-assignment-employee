package ca.java.exercise;

public class SalesEmployee extends Employee {
	
	private double commitionRate;
	private double totalSales;
	
	public SalesEmployee(String firstName, String lastName, String email, String phoneNumber, double commitionRate, double totalSales) {
		super(firstName, lastName, email, phoneNumber);
		setCommitionRate(commitionRate);
		setTotalSales(totalSales);
	}
	
	/**
	 * @return the commitionRate
	 */
	public double getCommitionRate() {
		return commitionRate;
	}
	/**
	 * @param commitionRate the commitionRate to set
	 */
	public void setCommitionRate(double commitionRate) {
		if (commitionRate > 0) {
			this.commitionRate = commitionRate;
		} else {
			this.commitionRate = -1;
		}
	}
	/**
	 * @return the totalSales
	 */
	public double getTotalSales() {
		return totalSales;
	}
	/**
	 * @param totalSales the totalSales to set
	 */
	public void setTotalSales(double totalSales) {
		if (totalSales > 0) {
			this.totalSales = totalSales;
		} else {
			this.totalSales = -1;
		}
	}
	
	@Override
	public double calculateIncome() {
		return commitionRate * totalSales;
	}
	
	@Override
	public String toString() {
		return super.toString() +
				"\nCommition Rate: " + commitionRate + 
				"\nTotal Sales: " + totalSales +
				"\nTotal Income: $" + calculateIncome();
	}
	
}
