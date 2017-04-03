package VehiclePackage;

public class Captain extends Person {
	   // String role;    
		public Captain(String name) {
			// TODO Auto-generated constructor stub
		
		super(name);
		role();
		System.out.println(roleinfo());
		}

		public void role(){
			this.role = "Captain";
		}
		
		public String roleinfo(){
			return "It is operated by "+ role + " named " + this.getName();
		}
		
	}
