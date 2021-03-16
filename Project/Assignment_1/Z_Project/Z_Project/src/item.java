
public class item {
	
	// data associated with the items...
	String itemName;
	String itemType;
	Double itemPrice;
	int itemQuantity;
	
	Double itemTax;
	
	// constructor...
	public item(String itemName, String itemType, double itemPrice, int itemQuantity) {

    	//assigning values...
    	this.itemName= itemName;
        this.itemType= itemType;
        this.itemPrice= itemPrice;
        this.itemQuantity= itemQuantity;      
    }
	
	// getters...
	public String getItemName() {
		return itemName;
	}
	
	public String getItemType() {
		return itemType;
	}
	
	public Integer getItemQuantity() {
		return itemQuantity;
	}
	
	public Double getItemPrice() {
		return itemPrice;
	}
	
	public Double getItemTax() {
		return itemTax;
	}
	
	// setter for itemTax
	public void setItemTax(double itemTax) {
		this.itemTax= itemTax;
	}
	
}
