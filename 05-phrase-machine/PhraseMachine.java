public class PhraseMachine {
	public static void main (String[] args) {
		
		//Create three word lists
		String[] wordListOne = {"24/7", "win-win", "frong-end", "web-based", "smart", "critical-path", "dynamic", "funny", "like-minded"};

		String[] wordListTwo = {"empowered", "sticky", "clustered", "networded", "branded", "focused", "aligned", "shared", "distributed"};

		String[] wordListThree = {"process", "paradigm", "mindshare", "space", "vision", "mission", "space-ship", "solution"};

		//Get length of each word list
		int oneLength = wordListOne.length;
		int twoLength = wordListTwo.length;
		int threeLength = wordListThree.length;

		//Generate random numbers
		int rand1 = (int) (Math.random() * oneLength);
		int rand2 = (int) (Math.random() * twoLength);
		int rand3 = (int) (Math.random() * threeLength);

		//Build phrase
		String phrase = wordListOne[rand1] + " " + wordListTwo[rand2] +  " " + wordListThree[rand3];
 
		System.out.println("What we need is a " + phrase);

	}
}
