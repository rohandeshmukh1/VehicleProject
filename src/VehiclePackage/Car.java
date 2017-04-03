package VehiclePackage;
public class Car extends Vehicle{
	String drivername;
	Driver driver;
	public Car(String model, String make, String color, int speed, String drivername){
		super(model, make, color, speed);
		driver = new Driver(drivername);
		
	}

}
