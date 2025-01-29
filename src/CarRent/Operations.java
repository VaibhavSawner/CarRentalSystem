
package CarRent;

import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Operations {
	
	private static Scanner scn = new Scanner(System.in);

	 public static void showAllCars() {
		 
		 System.out.println("=========These are Our Cars List============");
		 System.out.println();
		
		 Car c1 = new Car(new Random().nextInt(1000),"Maruti Swift","4 Seater", 1500.0);
			Car c2 = new Car(new Random().nextInt(1000),"Ertiga","7 Seater", 3600.0);
			Car c3 = new Car(new Random().nextInt(1000),"Maruti ECO","6 Seater", 1800.0);
			Car c4 = new Car(new Random().nextInt(1000),"Tata Punch","4 Seater", 1500.0);
			Car c5 = new Car(new Random().nextInt(1000),"Tata Nexon","4 Seater", 2100.0);
			Car c6 = new Car(new Random().nextInt(1000),"Scorpio","7 Seater", 2500.0);
			Car c7 = new Car(new Random().nextInt(1000),"Baleno","4 Seater", 1500.0);
			Car c8 = new Car(new Random().nextInt(1000),"ALto","4 Seater", 1200.0);
			Car c9 = new Car(new Random().nextInt(1000),"Safari","6 Seater", 2800.0);
			List<Car> list = List.of(c1,c2,c3,c4,c5,c6,c7,c8,c9);
			System.out.println(list);
			
			
			System.out.println();
			System.out.println("===Enter Car Id to select Or Press 3 to exist====");
			
			int id = scn.nextInt();
			list.get(id);
			
	 }
	 
	 
	 
    
}
