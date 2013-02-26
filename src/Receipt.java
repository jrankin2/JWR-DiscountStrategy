import java.util.Arrays;
import java.util.Date;

public class Receipt {

    private Customer customer;
    private LineItem lineItems[];

    public Receipt(String customerId) {
        setCustomer(new Customer(customerId));
        setLineItems(new LineItem[0]);//pass in an empty LineItem array as default...
    }
    
    public Receipt(Customer customer){
        setCustomer(customer);
        setLineItems(new LineItem[0]);
    }

    public String getOutput() {
        double savings = 0, 
                subtotal = 0,
                total = 0;
        
        String output = "Thank you for shopping at Kohl's!\n\n";
        output += "Sold to: " + customer.getFullName() + "\n";
        output += "Date: " + new Date().toString() + "\n\n";
        output += LineItem.getOutputHeader();
        for (LineItem li : lineItems) {
            output += li.getLineOutput();//output each line
            //get totals
            subtotal += li.getSubTotal();
            savings += li.getDiscountAmount();
            total += li.getTotalCost();
        }
        
        output += String.format("%51s", "") + String.format("%10s\n", "").replace(' ', '-');
        output += String.format("%52s %-10.02f\n", "SubTotal:", subtotal);
        output += String.format("%52s %-10.02f\n", "Total Savings:", savings);
        output += String.format("%52s %-10.02f\n", "Amount Due:", total);
        return output;
    }

    public void addItem(String productId, int quantity) {
        this.addItem(new LineItem(productId, quantity));
    }

    public void addItem(LineItem lineItem) {
        lineItems = Arrays.copyOf(lineItems, lineItems.length+1);
        lineItems[lineItems.length - 1] = lineItem;
        
    }

    public void addItems(LineItem newLineItems[]) {
        int len = lineItems.length;
        System.out.println("len = " + len);
        System.out.println("ll+nl=" + (lineItems.length + newLineItems.length));
        lineItems = Arrays.copyOf(lineItems, lineItems.length+newLineItems.length);
        
        for (int i = 0; i < newLineItems.length; i++) {
            lineItems[len+i] = newLineItems[i];
        }
//        System.out.println("len = " + len);
    }

    public Customer getCustomer() {
        return customer;
    }

    public final void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public String getCustomerFullName() {
        return customer.getFirstName() + " " + customer.getLastName();
    }

    public LineItem[] getLineItems() {
        return lineItems;
    }

    public final void setLineItems(LineItem[] lineItems) {
        this.lineItems = lineItems;
    }
}
