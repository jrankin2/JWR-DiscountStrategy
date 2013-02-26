/**
 * @author Joe
 */
public class NoDiscount implements DiscountStrategy{
    private double discountRate;
    
    public final double getDiscountAmount(double unitCost, int quantity) {
        return 0;
    }
    
    public final double getDiscountRate() {
        return discountRate;
    }

    public final void setDiscountRate(double discountRate) {
        this.discountRate = discountRate;
    }

}
