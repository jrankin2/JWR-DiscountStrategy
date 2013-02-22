import java.util.Arrays;

public class Receipt {

    private Customer customer;
    private LineItem lineItems[];

    public Receipt(String customerId) {
        setCustomer(new Customer(customerId));
        setLineItems(new LineItem[0]);//pass in an empty array as default... viable solution?
    }

    public String getOutput() {
        String output = "";
        output = customer.getFullName() + "\n";
        output += LineItem.getOutputHeader();
        for (LineItem li : lineItems) {
            output += li.getLineOutput();
        }

        return output;
    }

    public void addItem(String productId, int quantity) {
        this.addItem(new LineItem(productId, quantity));
    }

    public void addItem(LineItem lineItem) {
        lineItems = Arrays.copyOf(lineItems, lineItems.length+1);
        lineItems[lineItems.length - 1] = lineItem;
        
    }

    public void addItems(LineItem lineItems[]) {
        
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public String getCustomerFullName() {
        Customer customer = getCustomer();
        return customer.getFirstName() + " " + customer.getLastName();
    }

    public LineItem[] getLineItems() {
        return lineItems;
    }

    public void setLineItems(LineItem[] lineItems) {
        this.lineItems = lineItems;
    }
}
