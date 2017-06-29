public class BeerSong {
	public static void main (String[] args) {
		int numBottles = 99;
		String word = " bottles ";
		
		while (numBottles > 0) {

			System.out.println(numBottles + word + "of beer on the wall... ");
			System.out.println(numBottles + word + "of beeeerrr...");
			System.out.println("take one down, pass it around");
			
			numBottles = numBottles - 1;

			if(numBottles == 1) {
				word = " bottle ";
			} else if (numBottles == 0) {
				word = " bottles ";
			}

			System.out.println(numBottles + word + "of beer on the walllll!");
		}
		System.out.println("Nowww weere druunnkk....<falls to the floor>");
	}
}
