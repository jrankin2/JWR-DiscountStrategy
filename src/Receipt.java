import java.util.Arrays;
import java.util.Date;

public class Receipt {

    private Customer customer;
    private LineItem lineItems[];
    private FormatStrategy format;

    public Receipt(String customerId) {
        setCustomer(new Customer(customerId));
        setLineItems(new LineItem[0]);//pass in an empty LineItem array as default...
    }
    
    public Receipt(Customer customer){
        if(customer == null){
            throw new IllegalArgumentException();
        }
        setCustomer(customer);
        setLineItems(new LineItem[0]);
    }
    
    public Receipt(Customer customer, FormatStrategy format){
        if(customer == null || format == null){
            throw new IllegalArgumentException();
        }
        setCustomer(customer);
        setFormat(format);
        setLineItems(new LineItem[0]);
    }
    
    public String getOutput(){
        return format.formatReceipt(this);
    }
    
    public final void addItem(String productId, int quantity) {
        if(productId == null || quantity < 0){//validation
            throw new IllegalArgumentException();
        }
        this.addItem(new LineItem(productId, quantity));
    }

    public final void addItem(LineItem lineItem) {
        if(lineItem == null){//validation
            throw new IllegalArgumentException();
        }
        lineItems = Arrays.copyOf(lineItems, lineItems.length+1);
        lineItems[lineItems.length - 1] = lineItem;
    }

    public final void addItems(LineItem newLineItems[]) {
        if(newLineItems == null || newLineItems.length == 0){//validation
            throw new IllegalArgumentException();
        }
        int len = lineItems.length;
        //System.out.println("len = " + len);
        //System.out.println("ll+nl=" + (lineItems.length + newLineItems.length));
        lineItems = Arrays.copyOf(lineItems, lineItems.length+newLineItems.length);
        
        //copy the newLineItems to LineItems
        System.arraycopy(newLineItems, 0, lineItems, len, newLineItems.length);
    }

    public final Customer getCustomer() {
        return customer;
    }

    public final void setCustomer(Customer customer) {
        if(customer == null){//validation
            throw new IllegalArgumentException();
        }
        this.customer = customer;
    }
    
    public final FormatStrategy getFormat(){
        return format;
    }
    
    public final void setFormat(FormatStrategy format){
        if(format == null){//validation
            throw new IllegalArgumentException();
        }
        this.format = format;
    }

    public final String getCustomerFullName() {
        return customer.getFirstName() + " " + customer.getLastName();
    }

    public final LineItem[] getLineItems() {
        return lineItems;
    }

    public final void setLineItems(LineItem[] lineItems) {
        if(lineItems == null){//validation
            throw new IllegalArgumentException();
        }
        this.lineItems = lineItems;
    }
}