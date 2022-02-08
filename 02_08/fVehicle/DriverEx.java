package fVehicle;

public class DriverEx {

	public static void main(String[] args) {
		
		running(new Bus());
		running(new Taxi());
		
	}
	
	static void running(Vehicle v) {
		v.run();
	}

}
