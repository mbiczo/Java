public class Player {
	int number = 0;  // holds guess

	//Method for Player to guess a number
	public void guess() {
		number = (int) (Math.random() * 10);
		System.out.println("I'm guessing " + number);
	}
}
