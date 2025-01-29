package System;



public class RentCar {
	
	private Car car;
	private Customer cust;
	private int days;
	
	public RentCar(Car car,Customer cust,int days) {
		this.car=car;
		this.cust=cust;
		this.days=days;
	}
	
	public Car getCar() {
		return this.car;
	}
	
	public Customer cust() {
		return this.cust;
	}
	
	public int getdays() {
		return this.days;
	}

}
