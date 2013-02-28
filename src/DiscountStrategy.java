/**
 * Strategy whose implementations provide a way to get the discount amount
 * for a product by passing in its unit cost and quantity.
 * @version 1.0
 * @author Joe Rankin
 */
public interface DiscountStrategy {

    public double getDiscountAmount(double unitCost, int quantity);
    
    public double getDiscountRate();

    public void setDiscountRate(double discountRate);
}

