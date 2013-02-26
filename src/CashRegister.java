
public class CashRegister {
    private Receipt receipt;
    private InformationStrategy db;
    
    public CashRegister (InformationStrategy db) {
        this.db = db;
    }
    
    public void startNewSale(String customerId){
        Customer customer = db.findCustomer(customerId);
        if(customer != null){
            receipt = new Receipt(customer);
        } else{
            receipt = new Receipt(customerId);
        }
    }
    
    public void addItemToSale(String productId, int quantity){
        Product product = db.findProduct(productId);
        if(product != null){
            receipt.addItem(new LineItem(product, quantity));//so receipt doesn't have to know about product
        }
    }
    
    public void finalizeSale(){
        outputToConsole();
    }
    
    public Receipt getReceipt(){
        return receipt;
    }
    
    public void outputToConsole(){
        System.out.println(getReceipt().getOutput());
    }

}

