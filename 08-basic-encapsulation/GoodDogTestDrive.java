class GoodDogTestDrive {
	public static void main (String[] args) {
		
		// create two Dog objects and set their size
		GoodDog one = new GoodDog();
		one.setSize(70);
		GoodDog two = new GoodDog();
		two.setSize(8);

		// print (get) their size
		System.out.println("Dog one: " + one.getSize());
		System.out.println("Dog two: " + two.getSize());

		// call the bark method on each
		one.bark();
		two.bark();

	} // end of main method

} // end of GoodDogTestDrive class
