/**
 * @author Joe
 */
public class NoDiscount implements DiscountStrategy{
    private double discountRate;
    
    public final double getDiscountAmount(double unitCost, int quantity) {
        if(unitCost < 0 || quantity < 0){//validation
            throw new IllegalArgumentException();
        }
        return 0;
    }
    
    public final double getDiscountRate() {
        return discountRate;
    }

    public final void setDiscountRate(double discountRate) {
        if(discountRate < 0){//validation
            throw new IllegalArgumentException();
        }
        this.discountRate = discountRate;
    }

}
