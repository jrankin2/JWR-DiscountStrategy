
public class VariableRateDiscount implements DiscountStrategy {

    private double discountRate;

    public VariableRateDiscount(double discountRate) {
        this.discountRate = discountRate;
    }
    
    public final double getDiscountAmount(double unitCost, int quantity) {
        if(unitCost < 0){
            throw new IllegalArgumentException("Unit Cost cannot be negative.");
        } else if(quantity < 0){
            throw new IllegalArgumentException("Quantity cannot be negative.");
        }
        
        return unitCost*quantity*discountRate;
    }

    public final double getDiscountRate() {
        return discountRate;
    }

    public final void setDiscountRate(double discountRate) {
        if(discountRate < 0){
            throw new IllegalArgumentException("Discount Rate cannot be negative.");
        }
        this.discountRate = discountRate;
    }
    
}

