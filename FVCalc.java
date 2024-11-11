// Computes the future value of a saving investment.
public class FVCalc {
	public static void main(String[] args){
		// Replace this comment with your code

		int currentValue = Integer.parseInt(args[0]);

		double interestAsPercentage =Double.parseDouble(args[1]);

		int numberOfYears = Integer.parseInt(args[2]);
		
		double interestAsDecimal = (interestAsPercentage/100);

		double futureValue;

		futureValue=currentValue*(Math.pow((1+interestAsDecimal),numberOfYears)); 

		System.out.println("After " +numberOfYears+ " years, a $" +currentValue+ " saved at "+interestAsPercentage+ "% will yield $" +(int)futureValue);
	}
}