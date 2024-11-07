// Splits a restaurant bill evenly among three diners.
public class Bill3 {
	public static void main(String[] args) {
		//Names 
	    String name1 = args[0];
		String name2 = args[1];
		String name3 = args[2];
		
		//The total price for all the 3
        int totalPrice= Integer.parseInt(args[3]);
		
		// The price for each
        double priceForEach;
		priceForEach = Math.ceil((double)totalPrice/3);

       System.out.println("Dear " +name3+ ", "+name2+ ", and " +name1+ ": please pay "  +priceForEach+ " shekels each");

	}
}
