
public class ValidateInput {
	
	//validating strings...
	public boolean validateString(String str) {
		
		// if given string is empty...
		if(str.equals("") || str.equals(" ")) {
			System.out.print("\nEmpty values not allowed...\n");
			return false;
		}
		return true;
	}
	
	//validating double values...
	public boolean validateDouble(String str) {
			try {
				Double.parseDouble(str);
			}
			catch(NumberFormatException e) {
				System.out.print("\nPrice of item can only be a number...\n");
				return false;
			}
			return true;
		}
	
	// validating integers...
	public boolean validateInt(String str) {
		try {
			Integer.parseInt(str);
		}
		catch(NumberFormatException e) {
			System.out.print("\nQuantity of item can only be a number...\n");
			return false;
		}
		return true;
	}
	
	//validating the type of item...
	public boolean validateType(String str) {
		
		// if itemType is not of raw, manufactured or imported type...
		if(!str.equalsIgnoreCase("raw") && !str.equalsIgnoreCase("manufactured") && !str.equalsIgnoreCase("imported")) {
			System.out.print("\nType of item can only be raw, manufactured or imported\n");
			return false;
		}
		return true;
	}
}
