/***
* Shows 4 different kinds of looping constructs:
*	-For Incrementing Loop
*	-For Each Loop
*	-While Loop
*	-Do While
***/

public class Loops {
	
	public static void main (String[] args) {
		
		// create a String array of months
		String[] months = {"January", "February", "March",
			"April", "May", "June",
			"July", "August", "September",
			"October", "November", "December"};

		// incrementing example fowrard (will increment for us)
		System.out.println("Incrementing example forward");
		for (int i = 0; i < months.length; i++) {
			System.out.println(months[i]);
		}
		
		// incrementing example  backwards (more flexible than for each ex)
		System.out.println("Incrementing example backwards");
		for (int i = months.length-1; i >= 0; i--) {
			System.out.println(months[i]);
		}
		
		// for each example	
		System.out.println("For Each Example");
		for (String month : months) {
			System.out.println("The month value is: " + month);
		}
		
		// while example
		System.out.println("While example");
		int counter = 0;
		while (counter < months.length) {
			System.out.println(months[counter]);
			counter++; //must increment manually
		}

		// do while example (less common; moves evaluation to end of logic)
		System.out.println("Do While example");
		int counter2 = 0;
		do {
			System.out.println(months[counter2]);
			counter2++;
		} while (counter2 < months.length);
		
	} // end of main method

} // end of Loops class
