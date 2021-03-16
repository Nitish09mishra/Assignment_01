import java.util.*;

public class getInput {
	// initializing the variables for taking user inputs to create an object of item type...
	String itemName;
	String itemType;
	Double itemPrice;
	int itemQuantity;
	
	// temp variable for taking inputs in string format so that it can be 
	// easily validated according to the type 
	// after that we will assign it to the respected variables...
	String temp;
	
	// initializing new scanner's object...
	Scanner scn= new Scanner(System.in);
	
	// taking inputs from the user for all the fields...
	public item takeInputs() {
			
		    // validate here is to verify if entered value is valid or not
			// if not then user will again asked to give the corrected value...
			boolean validate= false;
			
			// creating new object of type validateInput
			// it will do exception handling for wrong inputs...
			validateInput newInput= new validateInput();
			
			// taking input for itemName...
			do {		
				System.out.print("\nName: ");
				temp= scn.nextLine();
				validate= newInput.validateString(temp);
			} while(!validate) ;
			
			itemName= temp;
			
			
			// taking input for itemType...
			do {		
				System.out.print("Type: ");
				temp= scn.nextLine();
				validate= newInput.validateString(temp) && newInput.validateType(temp);		
			} while(!validate) ;
			
			itemType= temp;
			
			
			// taking input for itemPrice...
			do {		
				System.out.print("Price: ");
				temp= scn.nextLine();
				validate= newInput.validateDouble(temp);		
			} while(!validate) ;
			
			itemPrice= Double.parseDouble(temp);
			
			
			// taking input for itemQuantity...
			do {		
				System.out.print("Quantity: ");
				temp= scn.nextLine();
				validate= newInput.validateInt(temp);		
			} while(!validate) ;
			
			itemQuantity= Integer.parseInt(temp);
			
			// creating newItem of type item...
			item newItem= new item(itemName, itemType, itemPrice, itemQuantity);
			
			// returning newItem...
			return newItem;
	}
	
}