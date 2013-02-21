
public class StartUp {

    public static void main(String[] args) {
        String customerId = "c101";
        String productId = "p101";
        int quantity = 2;
        
        
        CashRegister cashRegister = new CashRegister();
        cashRegister.startNewSale(customerId);
        cashRegister.addItemToSale(productId, quantity);
        cashRegister.addItemToSale("p102", 1);
        
        
        Receipt receipt = cashRegister.getReceipt();
        
        //set the customer's name...
        receipt.getCustomer().setFirstName("John");
        receipt.getCustomer().setLastName("Smith");
        
        //add product info...
        receipt.getLineItems()[0].setName("Hat");
        receipt.getLineItems()[0].setUnitCost(9.99);
        receipt.getLineItems()[0].setDiscount(new QuantityDiscount(.50, 2));
        
        
        receipt.getLineItems()[1].setName("Shoes");
        receipt.getLineItems()[1].setUnitCost(59.99);
        receipt.getLineItems()[1].setDiscount(new VariableRateDiscount(.10));
        
        cashRegister.finalizeSale();
        //System.out.println(receipt.getOutputString());
        
    }

}
