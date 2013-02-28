/**
 * Startup class to demonstrate the program in action.
 * @version 1.0
 * @author Joe Rankin
 */
public class StartUp {

    public static void main(String[] args) {
        
        CashRegister cashRegister = new CashRegister(new FakeDatabase());
        cashRegister.startNewSale("C200", new ReceiptConsoleFormat());
        cashRegister.addItemToSale("A101", 2);
        cashRegister.addItemToSale("A102", 1);
        
        cashRegister.finalizeSale();
        
    }

}
