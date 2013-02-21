
public class CashRegister {
    private Receipt receipt;
    
    public CashRegister () {
        //I feel like this should also be composed of a sale object...
    }
    
    public void startNewSale(String customerId){
        receipt = new Receipt(customerId);
    }
    
    public void addItemToSale(String productId, int quantity){
        receipt.addItem(productId, quantity);
    }
    
    public void finalizeSale(){
        System.out.println(getReceipt().getOutputString());
    }
    
    public Receipt getReceipt(){
        return receipt;
    }

}

