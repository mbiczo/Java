import java.util.Scanner;

public class UserInput {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter a number: ");
		String input = sc.nextLine();
		System.out.println("You entered: " + input);
	}
}
