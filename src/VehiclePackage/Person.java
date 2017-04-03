package VehiclePackage;
public abstract class Person {
String name;
String role;
 public String getRole() {
	return role;
}

public void setRole(String role) {
	this.role = role;
}

// constructor
 public Person(String pname){
  	this.name = pname;
	
 }
 
 public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

abstract void role();
 
}
