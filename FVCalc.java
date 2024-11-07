// Computes the future value of a saving investment.
public class FVCalc {
	public static void main(String[] args){
		// Replace this comment with your code

		int currentValue = Integer.parseInt(args[0]);
		int n = Integer.parseInt(args[2]);
		double rate =Double.parseDouble(args[1]);
		double rate2 = rate/100;

		
		double futureValue;

		futureValue=currentValue*(Math.pow((1+rate2),n)); 

		System.out.println("After " +n+ " years, a $" +currentValue+ " saved at "+rate+ "% will yield $" +(int)futureValue);
	}
}