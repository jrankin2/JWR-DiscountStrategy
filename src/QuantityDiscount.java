
public class QuantityDiscount implements DiscountStrategy {

    private double discountRate;
    private double minQuantity;

    public QuantityDiscount(double discountRate, double minimumQuantity) {
        this.discountRate = discountRate;
        this.minQuantity = minimumQuantity;
    }
    
    public final double getDiscountAmount(double unitCost, int quantity) {
        return (quantity >= minQuantity ? unitCost*quantity*discountRate : 0);
    }

    public final double getDiscountRate() {
        return discountRate;
    }

    public final void setDiscountRate(double discountRate) {
        this.discountRate = discountRate;
    }

    public final double getMinQuantity() {
        return minQuantity;
    }

    public final void setMinQuantity(double minQuantity) {
        this.minQuantity = minQuantity;
    }
    
}

