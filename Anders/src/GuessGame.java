import java.util.Scanner;

public class GuessGame {
	public static String correctWord = "Java";
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while(true) {
			System.out.println("Guess a new word!");
			String guess = scanner.next();
			if(guess.equals(correctWord)) {
				System.out.println("You got the right word!");
				break;
			} else {
				System.out.println("keep guessing");
			}
		}
		scanner.close();
	}
}
