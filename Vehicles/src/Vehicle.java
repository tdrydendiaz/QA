public abstract class Vehicle {

	private int noOfWheels;
	private int sizeOfEngine;
	private int noOfLights;
	private String registrationNo;

	public Vehicle(int noOfWheels, int sizeOfEngine, int noOfLights, String registrationNo) {
		this.noOfWheels = noOfWheels;
		this.sizeOfEngine = sizeOfEngine;
		this.noOfLights = noOfLights;
		this.registrationNo = registrationNo;
	}

	public Vehicle() {
	}

	public int getNoOfWheels() {
		return noOfWheels;
	}

	public void setNoOfWheels(int noOfWheels) {
		this.noOfWheels = noOfWheels;
	}

	public int getSizeOfEngine() {
		return sizeOfEngine;
	}

	public void setSizeOfEngine(int sizeOfEngine) {
		this.sizeOfEngine = sizeOfEngine;
	}

	public int getNoOfLights() {
		return noOfLights;
	}

	public void setNoOfLights(int noOfLights) {
		this.noOfLights = noOfLights;
	}

	public String getRegistrationNo() {
		return registrationNo;
	}

	public void setRegistrationNo(String registrationNo) {
		this.registrationNo = registrationNo;
	}

	public String toString() {
		String result = String.valueOf(noOfLights);
		return noOfLights + "";

	}

}
