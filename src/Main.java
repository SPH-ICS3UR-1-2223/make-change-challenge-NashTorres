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
			
			int num10 = (int)(change/10);
			System.out.println(num10+" x $20");
			change = change - (num10*10);
			
			int num5 = (int)(change/5);
			System.out.println(num5+" x $5");
			change = change - (num5*5);
			
			int num2 = (int)(change/2);
			System.out.println(num2+" x $2");
			change = change - (num2*2);
			
			int num1 = (int)(change/1);
			System.out.println(num1+" x $1");
			change = change - (num1*1);
			
			double num05 = (double)(change/0.5);
			System.out.println(num05+" x $0.5");
			change = change - (num05*0.5);
			
			double num025 = (double)(change/0.25);
			System.out.println(num025+" x $0.25");
			change = change - (num025*0.25);
			
			double num01 = (double)(change/0.1);
			System.out.println(num01+" x $0.1");
			change = change - (num01*0.1);
			
			double num005 = (double)(change/0.05);
			System.out.println(num005+" x $0.05");
			change = change - (num005*0.05);
			
			
			
		//$100,$50,$20,$10,$5,$2,$1,$0.25,$0.10,$0.05
			
		//As a bonus, make your project round to the nearest $0.05 like actual stores.
		
	}

}
