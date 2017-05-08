import java.util.Scanner;
	
	public class Exercise2_5 {
		public static void main(String[] args) {
		
			Scanner input = new Scanner(System.in);
			
			System.out.println("Enter the subtotal and a gratuity rate: ");
			double subTotal = input.nextDouble();
			double gratuityRate = input.nextDouble();
			double gratuityAmount = gratuityRate / subTotal;
			double total = gratuityAmount + subTotal;
			System.out.println("The gratuity is $" + gratuityAmount + " and the total is $" + total);
			
			
			
			
			
			
			
			
			
			
	}

}
