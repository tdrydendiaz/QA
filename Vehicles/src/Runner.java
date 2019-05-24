public class Runner {
	public static void main(String[] args) {

		Bus b = new Bus();
		Car c = new Car();
		Motorbike m = new Motorbike();

		b.weeklyPetrol();

		m.crashing();

		Bus v1 = new Bus(4, 2, 4, "YW56FR", "Speedys", 4);
		Car v2 = new Car(3, 2, 1, 50, 3, "T45DR2");
		Motorbike v3 = new Motorbike(2, 6, 2, 8, 4, "OSD79", "Super", 2);

		System.out.println(v1.toString());

		Garage g1 = new Garage();

		g1.vehicleStats.add(v1);
		g1.vehicleStats.add(v2);
		g1.vehicleStats.add(v3);

		System.out.println(g1.getCost());

		System.out.println(g1.vehicleStats.get(0).getNoOfLights() + ", " + g1.vehicleStats.get(0).getRegistrationNo()
				+ "," + g1.vehicleStats.get(0).getNoOfWheels() + "," + g1.vehicleStats.get(0).getSizeOfEngine());

		System.out.println(g1.vehicleStats.get(0).getNoOfLights() + ", " + g1.vehicleStats.get(0).getRegistrationNo()
				+ "," + g1.vehicleStats.get(0).getNoOfWheels() + "," + g1.vehicleStats.get(0).getSizeOfEngine());

		for (Vehicle no : g1.vehicleStats) {
			String s = "";
			s = s + no.getNoOfLights() + "," + no.getNoOfWheels() + "," + no.getRegistrationNo() + ","
					+ no.getSizeOfEngine();
			System.out.println(s);
		}

	}

	// public static void mymethod() {
	// int[] a = { 1, 2, 3 };
	// String[] c = { "1", "2" };
	// List<Integer> b = new ArrayList<Integer>();
	// b.add(100);
	// b.add(200);
	// System.out.println(a);
	// System.out.println(b);
	//
	// for (int z : b) {
	// if (z == 100) {
	// System.out.println("yay");

}