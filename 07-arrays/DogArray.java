class Dog {
	String name;
	public static void main (String[] args) {
		
		// make a Dog object and access it
		Dog dog1 = new Dog();
		dog1.bark();
		dog1.name = "Bella";

		// make a Dog arra
		Dog[] myDogs = new Dog[3];

		// put some dogs in it
		myDogs[0] = new Dog();
		myDogs[1] = new Dog();
		myDogs[2] = dog1;

		// set Dog names
		myDogs[0].name = "Bristol";
		myDogs[1].name = "Max";

		// loop through array
		int x = 0;
		while (x < myDogs.length) {
			myDogs[x].bark();
			x = x + 1;
		} // end of loop
	
	} // end of main

	public void bark() {
		System.out.println(name + " says woof!");
	}// end of bark

} // end of class Dog
