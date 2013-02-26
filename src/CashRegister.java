
public class CashRegister {
    private Receipt receipt;
    private InformationStrategy db;
    
    public CashRegister (InformationStrategy db) {
        this.db = db;
    }
    
    public CashRegister(InformationStrategy db, FormatStrategy format){
        this.db = db;
    }
    
    public final void startNewSale(String customerId){
        Customer customer = db.findCustomer(customerId);
        if(customer != null){
            receipt = new Receipt(customer);
        } else{
            receipt = new Receipt(customerId);
        }
    }
    
    public final void startNewSale(String customerId, FormatStrategy format){
        Customer customer = db.findCustomer(customerId);
        if(customer != null){
            receipt = new Receipt(customer, format);
        } else{
            receipt = new Receipt(customerId);
        }
    }
    
    public final void addItemToSale(String productId, int quantity){
        Product product = db.findProduct(productId);
        if(product != null){
            receipt.addItem(new LineItem(product, quantity));//so receipt doesn't have to know about product
        }
    }
    
    public final void finalizeSale(){
        outputToConsole();
    }
    
    public final Receipt getReceipt(){
        return receipt;
    }
    
    public final void outputToConsole(){
        
        System.out.println(getReceipt().getOutput());
    }

}

