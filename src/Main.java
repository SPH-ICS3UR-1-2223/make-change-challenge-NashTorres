import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		//Your challenge is to read in a price
		//Read in the amount paid
			System.out.println("Enter the price");
			double price=in.nextDouble();
			System.out.println("How much money did you use to pay for it?");
			double paid = in.nextDouble();
		//Print out the amount of change
			double change = paid-price;
			System.out.println(change); 
		//Break the change into all denominations: 
			int num100 = (int)(change/100);
			System.out.println(num100+" x $100");
			change = change - (num100*100);
			
			int num50 = (int)(change/50);
			System.out.println(num50+" x $50");
			change = change - (num50*50);
			
			int num20 = (int)(change/20);
			System.out.println(num20+" x $20");
			change = change - (num20*20);
			
			
		//$100,$50,$20,$10,$5,$2,$1,$0.25,$0.10,$0.05
			
		//As a bonus, make your project round to the nearest $0.05 like actual stores.
		
	}

}
