public class GuessGame {
	//Create three instance variables
	Player p1;
	Player p2;
	Player p3;

	public void startGame() {
		//Create three Player objects and assign to instance vars
		p1 = new Player();
		p2 = new Player();
		p3 = new Player();
		
		//Declare variabes to hold guesses
		int guessp1 = 0;
		int guessp2 = 0;
		int guessp3 = 0;
		
		//Declare variables to indicate Player 'correctness'
		boolean p1isRight = false;
		boolean p2isRight = false;
		boolean p3isRight = false;

		//Create random target number for players to guess
		int targetNumber = (int) (Math.random() * 10);
		System.out.println("I'm thinking of a number between 0 and 9...");

		while (true) {
			System.out.println("Number to guess is " + targetNumber);
			
			//Call each player's guess method
			p1.guess();
			p2.guess();
			p3.guess();
	
			//Get each player's guess number by accessing the number var of each player
			guessp1 = p1.number;
			System.out.println("Player one guessed " + guessp1);

			guessp2 = p2.number;
			System.out.println("Player one guessed " + guessp2);

			guessp3 = p3.number;
			System.out.println("Player one guessed " + guessp3);

			//Check each Player's guess and indcate if correct
			if (guessp1 == targetNumber) {
				p1isRight = true;
			}

			if (guessp2 == targetNumber) {
				p2isRight = true;
			}

			if (guessp3 == targetNumber) {
				p3isRight = true;
			}

			
			//End game if any player got it right
			if (p1isRight | p2isRight | p3isRight) {
				System.out.println("We have a winner!");
				System.out.println("Player 1 got it right?" + p1isRight);
				System.out.println("Player 2 got it right?" + p2isRight);
				System.out.println("Player 3 got it right?" + p3isRight);
				System.out.println("Game over.");
				break; //game over so break out of while loop
			} else {
				//Keep going until somebody gets it right
				System.out.println("Players will have to try again");
			} //end if/else
		} //end loop
	} //end method
} //end class
