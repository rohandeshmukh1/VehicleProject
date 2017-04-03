// boat file
package VehiclePackage;

public class Boat extends Vehicle{
	String captainname;
	Captain captain;
	public Boat(String color, int speed, String captainname){
		super("boat", color, speed);
		captain = new Captain(captainname);
		
	}

}
