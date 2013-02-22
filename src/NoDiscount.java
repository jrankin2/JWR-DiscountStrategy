/**
 * @author Joe
 */
public class NoDiscount implements DiscountStrategy{
    private double discountRate;
    
    public double getDiscountAmount(double unitCost, int quantity) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    public double getDiscountRate() {
        return discountRate;
    }

    public void setDiscountRate(double discountRate) {
        this.discountRate = discountRate;
    }

}
