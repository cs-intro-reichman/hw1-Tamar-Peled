// Prints a given number using a hundreds, tens, and units notation.
public class NumWords {
	public static void main(String args[]) {
		// Replace this comment with your code

		int inputNumber = Integer.parseInt(args[0]);

		int hundredsDigit = inputNumber / 100;
		int tensDigit = (inputNumber / 10) % 10;
		int onesDigit = inputNumber % 10;

		System.out.println(hundredsDigit + " hundreds, " + tensDigit + " tens, and " + onesDigit + " ones.");
	}
}