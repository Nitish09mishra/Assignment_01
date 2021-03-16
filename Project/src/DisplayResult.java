
public class DisplayResult {
	
	public static void displayData(Item item) {
		System.out.print("\nItem Name: "+ item.getItemName());
		System.out.print("\nItem Price: "+ item.getItemPrice());
		System.out.print("\nTax per Item: "+ item.getItemTax());
		System.out.print("\nFinal Price: "+ item.getItemQuantity()*(item.getItemPrice() + item.getItemTax()));
	}
	
}
