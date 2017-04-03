package VehiclePackage;
import java.util.Scanner;

public class CarApp {
    Car car;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      String make;
      String model;
      String carcolor;
      int carspeed;
      String caroperatorname;
      String boatcolor;
      int boatspeed;
      String boatoperatorname;
      
		Scanner scan = new Scanner(System.in);
	  System.out.println("Enter car details");
      System.out.println("Enter make");
      make = scan.next();
      System.out.println("Enter model");
      model = scan.next();
      System.out.println("Enter color");
      carcolor = scan.next();
      System.out.println("Enter speed");
      carspeed = scan.nextInt();
      System.out.println("Enter operator name");
      caroperatorname = scan.next();
      
      System.out.println("Enter boat details");
      System.out.println("Enter color");
      boatcolor = scan.next();
      System.out.println("Enter speed");
      boatspeed = scan.nextInt();
      System.out.println("Enter operator name");
      boatoperatorname = scan.next();
      
      Car car = new Car(model, make, carcolor, carspeed, caroperatorname);
      Boat boat = new Boat(boatcolor, boatspeed, boatoperatorname);
      
	}

}
