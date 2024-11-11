// Generates three integer random numbers in a given range,
// and prints them in increasing order.
public class Ascend {
	public static void main(String[] args) {

		int inputNumber = Integer.parseInt(args[0]);

		//Generating three random numbers in the range [0, inputNumber]
		int a = (int)(Math.random()*inputNumber+1);
		int b = (int)(Math.random()*inputNumber+1);
		int c = (int)(Math.random()*inputNumber+1);

 		System.out.println(a+ " "+b+ " "+c);

		//Finding the minimum value among a, b, and c
		int min = Math.min(a, Math.min(b, c));

		//Finding the maximum value among a, b, and c
		int max = Math.max(a, Math.max(b, c));

		//Calculating the middle value by subtracting min and max from the total sum of a, b, and c
		int middle = (a+b+c) - (min + max);
		
		
		System.out.println(min+ " "+middle+ " "+max);
		
	}
}
