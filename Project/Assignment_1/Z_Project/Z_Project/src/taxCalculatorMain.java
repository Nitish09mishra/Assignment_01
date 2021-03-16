import java.util.Scanner;

public class taxCalculatorMain {
	
	public static void main(String []args) {
		
		// initializing scanner's object...
		Scanner scn= new Scanner(System.in);
		
		// new object of type getInput where all the inputs form user will be taken...
		getInput obj = new getInput();
		
		// flag to check if user wants to enter more data...
		String flag="y"; 
		
		// asking user for inputs...
		System.out.print("Please enter your product details-");
		
		// while loop for calculating tax for multiple items...
		while(flag.equalsIgnoreCase("y")) {
			
			// initializing newItem of item class with the help of takeInputs method 
			// of getInput class...
			item newItem= obj.takeInputs();
			
			// calling static method getTax of class calculateTax for tax calculations...
			calculateTax.getTax(newItem);
			
			// calling displayData from displayResult class for showing output of the data...
			displayResult.displayData(newItem);
			
			// asking the user if he/she wants to calculate tax for more items of not
			// taking input for the flag to know what user wants...
			System.out.print("\n\nDo you want to enter details of any other item (y/n): ");
            flag= scn.next();     
		}
		
		// closing scanner...
		scn.close();
	}
	
}
