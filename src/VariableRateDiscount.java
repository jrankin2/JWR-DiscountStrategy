/**
 * Class that returns the discount amount when passed a unitCost and quantity.
 * Also stores a discount rate which is used to calculate discount amount.
 * @version 1.0
 * @author Joe Rankin
 */
public class VariableRateDiscount implements DiscountStrategy {

    private double discountRate;

    public VariableRateDiscount(double discountRate) {
        this.discountRate = discountRate;
    }
    
    public final double getDiscountAmount(double unitCost, int quantity) {
        if(unitCost < 0 || quantity < 0){//validation
            throw new IllegalArgumentException();
        }
        
        return unitCost*quantity*discountRate;
    }

    public final double getDiscountRate() {
        return discountRate;
    }

    public final void setDiscountRate(double discountRate) {
        if(discountRate < 0){
            throw new IllegalArgumentException();
        }
        this.discountRate = discountRate;
    }
    
}

