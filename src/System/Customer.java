package System;


public class Customer {
	
	private int cust_id;
	private String cust_name;
	private Long cust_contact;
	
	public Customer(int id,String name,Long contact) {
		this.cust_id=id;
		this.cust_name=name;
		this.cust_contact=contact;
	}
	
	public int getCustid() {
		return this.cust_id;
	}
	public String getCustName() {
		return this.cust_name;
	}
	public Long getcustContact() {
		return this.cust_contact;
	}

}
