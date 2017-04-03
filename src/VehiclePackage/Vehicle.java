package VehiclePackage;
public class Vehicle {
   String model;
   String make;
   String color;
   int speed;
   
	public Vehicle(String model, String make, String color, int speed) {
		// TODO Auto-generated constructor stub
		this.model = model;
		this.make = make;
		this.color = color;
		this.speed = speed;
		
		System.out.println(color + " " + make + " " + model + " is running at speed "+ speed);
	}

	public Vehicle(String model, String color, int speed) {
		// TODO Auto-generated constructor stub
		this.model = model;
		 
		this.color = color;
		this.speed = speed;
		
		System.out.println(color +  " " + model + " is running at speed "+ speed);
	}
	
	
	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

}
