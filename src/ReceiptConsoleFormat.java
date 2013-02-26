
import java.util.Date;

public class ReceiptConsoleFormat implements FormatStrategy {
    Receipt receipt;
    
    public ReceiptConsoleFormat(Receipt receipt){
        this.receipt = receipt;
    }
    
    public ReceiptConsoleFormat(){
        
    }
    
    
    
    public String formatReceipt(Receipt receipt) {
        return getOutput(receipt);
    }
    
    public final String getOutput(Receipt receipt) {
        double savings = 0, 
                subtotal = 0,
                total = 0;
        
        String output = "Thank you for shopping at Kohl's!\n\n";
        output += "Sold to: " + receipt.getCustomer().getFullName() + "\n";
        output += "Date: " + new Date().toString() + "\n\n";
        output += getLineItemsHeader();
        for (LineItem li : receipt.getLineItems()) {
            output += getLineOutput(li);//output each line
            //get totals
            subtotal += li.getSubTotal();
            savings += li.getDiscountAmount();
            total += li.getTotalCost();
        }
        
        output += String.format("%55s", "") + String.format("%10s\n", "").replace(' ', '-');
        output += String.format("%56s %-10.02f\n", "SubTotal:", subtotal);
        output += String.format("%56s %-10.02f\n", "Total Savings:", savings);
        output += String.format("%56s %-10.02f\n", "Amount Due:", total);
        return output;
    }
    
    public final String getLineOutput(LineItem li){
        String output = String.format("%1$-8s %2$-20s %3$-8d %4$-8.02f %5$-8.02f %6$-8.02f\n", 
                li.getId(), 
                li.getName(), 
                li.getQuantity(), 
                li.getUnitCost(), 
                li.getDiscountAmount(),
                li.getTotalCost()
                );
        return output;
    }
    
    public static String getLineItemsHeader(){
        String output = String.format("%-8s %-20s %-8s %-8s %-8s %-8s\n", 
                "PID",
                "Name",
                "Qty",
                "Price",
                "Savings",
                "Total");
        output += String.format("%65s\n", "").replace(' ', '-');
        return output;
    }
    
}
