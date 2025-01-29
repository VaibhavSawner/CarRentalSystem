
package CarRent;

public class Car {

	private Integer car_id;
	private String car_model;
	private String car_type;
	private Double rent;
	
   Car(int car_id,String car_model,String car_type,Double rent){
	 
	    this.car_id=car_id;
	    this.car_model=car_model;
	    this.car_type=car_type;
	    this.rent=rent;
	}
   
   @Override
public String toString() {
	// TODO Auto-generated method stub
	return "____________\n"+"Car_id:\s"+car_id+"\nCar_Name:\s"+car_model+"\nCar_Type:\s"+car_type+"\nRent Per Day:\s"+rent+"\n";
}
	
	

	}
    
    
    
  
