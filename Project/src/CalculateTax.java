import constants.ConstClass;

public class CalculateTax {
	
	public static void getTax(Item item) {

		// getting item type and price for tax calculation...
		String type= item.getItemType();
		double price= item.getItemPrice();
		
		double taxPrice= ConstClass.TAX_ON_BASIC * price;
        
        //if the item is of manufactured or imported category then it must go through this tax...
        if(type.equals("manufactured") || type.equals("imported")) {           
            taxPrice= taxPrice + ConstClass.TAX_ON_MANUFACTURED * (price + taxPrice);           
        }
        
        //if the item is of imported Category...
        if(type.equals("imported")) {
            
            double importDuty= ConstClass.TAX_ON_IMPORTED * price;
            taxPrice= taxPrice+ importDuty;
            
            double finalCost= price + taxPrice;
            
            //applying surCharge to imported item...
            
            double surCharges;
            
            if(finalCost<=100) {
                surCharges= ConstClass.SURCHANGE_ON_LESSTHAN_100;
            }
            
            else if(finalCost>100 && finalCost<=200) {
                surCharges= ConstClass.SURCHANGE_ON_100_TO_200;
            }
            
            else {
                surCharges= ConstClass.SURCHANGE_ON_ABOVE_200 * finalCost;
            }
            
            taxPrice= taxPrice + surCharges;
            		
        }
        
        item.setItemTax(taxPrice);
	}
	
}
