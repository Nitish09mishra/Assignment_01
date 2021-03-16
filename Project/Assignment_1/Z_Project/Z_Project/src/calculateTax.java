
public class calculateTax {
	
	public static void getTax(item Item) {

		// getting item type and price for tax calculation...
		String type= Item.getItemType();
		double price= Item.getItemPrice();
		
		double tax_price= 12.5 * price / 100;
        
        //if the item is of manufactured or imported category then it must go through this tax...
        if(type.equals("manufactured") || type.equals("imported")) {           
            tax_price= tax_price + 2 * (price + tax_price) / 100;           
        }
        
        //if the item is of imported Category...
        if(type.equals("imported")) {
            
            double import_duty= 10*price/100;
            
            double final_cost= price + tax_price + import_duty;
            
            //applying surcharge to imported item...
            if(final_cost<=100) {
                tax_price= 5+ final_cost-price;
            }
            else if(final_cost>100 && final_cost<=200) {
                tax_price= 10+ final_cost-price;
            }
            else {
                tax_price= 5*final_cost/100 + final_cost-price;
            }
            
        }
        
        Item.setItemTax(tax_price);
	}
	
}
