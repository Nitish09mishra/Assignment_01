
public class displayResult {
	public static void displayData(item Item) {
		System.out.print("\nItem Name: "+ Item.getItemName());
		System.out.print("\nItem Price: "+ Item.getItemPrice());
		System.out.print("\nTax per Item: "+ Item.getItemTax());
		System.out.print("\nFinal Price: "+ Item.getItemQuantity()*(Item.getItemPrice() + Item.getItemTax()));
	}
}
