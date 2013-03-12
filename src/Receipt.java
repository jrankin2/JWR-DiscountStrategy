import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Contains Customer, LineItems, and Formatting information used to create a
 * receipt.
 * @version 1.0
 * @author Joe Rankin
 */
public class Receipt {

    private Customer customer;
    //private LineItem lineItems[];
    private List<LineItem> lineItems = new ArrayList<LineItem>();
    private FormatStrategy format;
    private Date receiptDate;

    public Receipt(String customerId) {
        if(customerId == null){
            throw new IllegalArgumentException();
        }
        
        setCustomer(new Customer(customerId));
        setLineItems(new ArrayList<LineItem>());//pass in an empty LineItem list as default...
        this.receiptDate = new Date();
    }
    
    public Receipt(Customer customer){
        if(customer == null){
            throw new IllegalArgumentException();
        }
        setCustomer(customer);
        setLineItems(new ArrayList<LineItem>());//pass in an empty LineItem list as default...
        this.receiptDate = new Date();
    }
    
    public Receipt(Customer customer, FormatStrategy format){
        if(customer == null || format == null){
            throw new IllegalArgumentException();
        }
        setCustomer(customer);
        setFormat(format);
        setLineItems(new ArrayList<LineItem>());//pass in an empty LineItem list as default...
        this.receiptDate = new Date();
    }
    
    public String getDateString(){
        SimpleDateFormat sdf = new SimpleDateFormat("M/d/yyyy h:mm a");
        return sdf.format(receiptDate);
    }
    
    public String getOutput(){
        return format.formatReceipt(this);
    }
    
    

    public final void addItem(LineItem lineItem) {
        if(lineItem == null){//validation
            throw new IllegalArgumentException();
        }
        System.out.println(lineItem);
        lineItems.add(lineItem);
        /*
        lineItems = Arrays.copyOf(lineItems, lineItems.length+1);
        lineItems[lineItems.length - 1] = lineItem;
        */
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

    public final List<LineItem> getLineItems() {
        return lineItems;
    }

    public final void setLineItems(List<LineItem> lineItems) {
        if(lineItems == null){//validation
            throw new IllegalArgumentException();
        }
        this.lineItems = lineItems;
    }
}