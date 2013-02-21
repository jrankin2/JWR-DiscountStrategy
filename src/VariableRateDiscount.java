
public class VariableRateDiscount implements DiscountStrategy {

    private double discountRate;

    public VariableRateDiscount(double discountRate) {
        this.discountRate = discountRate;
    }
    
    public double getDiscountAmount(double unitCost, int quantity) {
        return unitCost*quantity*discountRate;
    }

    public double getDiscountRate() {
        return discountRate;
    }

    public void setDiscountRate(double discountRate) {
        this.discountRate = discountRate;
    }
    
}

