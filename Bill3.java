		// This program splits a restaurant bill evenly among three diners.
public class Bill3 {
	public static void main(String[] args) {

	 	// Assumes that args[0], args[1], and args[2] contain the names in order.
	    String name1 = args[0];
		String name2 = args[1];
		String name3 = args[2];
		
        // Declaration of a variable, to store the total price of the meal.
        int totalPrice= Integer.parseInt(args[3]);
		
		// Declaration of a variable to store the price each diner should pay.
        double priceForEach;

		// Calculate the amount each diner should pay by dividing the total price by the number of diners
		priceForEach = Math.ceil((double)totalPrice/3);


		// Output a formatted message to inform each diner of their share of the bill.
       System.out.println("Dear " +name3+ ", "+name2+ ", and " +name1+ ": pay "  +priceForEach+ " Shekels each");

	}
}
