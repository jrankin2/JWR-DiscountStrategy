
public class QuantityDiscount implements DiscountStrategy {

    private double discountRate;
    private double minQuantity;

    public QuantityDiscount(double discountRate, double minimumQuantity) {
        this.discountRate = discountRate;
        this.minQuantity = minimumQuantity;
    }
    
    public double getDiscountAmount(double unitCost, int quantity) {
        return (quantity >= minQuantity ? unitCost*quantity*discountRate : 0);
    }

    public double getDiscountRate() {
        return discountRate;
    }

    public void setDiscountRate(double discountRate) {
        this.discountRate = discountRate;
    }

    public double getMinQuantity() {
        return minQuantity;
    }

    public void setMinQuantity(double minQuantity) {
        this.minQuantity = minQuantity;
    }
    
}

