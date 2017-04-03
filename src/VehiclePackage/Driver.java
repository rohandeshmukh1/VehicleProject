package VehiclePackage;
public class Driver extends Person {
   // String role;    
	public Driver(String name) {
		// TODO Auto-generated constructor stub
	
	super(name);
	role();
	System.out.println(roleinfo());
	}

	public void role(){
		this.role = "Driver";
	}
	
	 
	public String roleinfo(){
		return "It is operated by "+ role + " named " + this.getName();
	}
	
}
