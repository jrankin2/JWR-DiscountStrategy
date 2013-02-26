
public class QuantityDiscount implements DiscountStrategy {

    private double discountRate;
    private double minQuantity;

    public QuantityDiscount(double discountRate, double minimumQuantity) {
        if(discountRate < 0 || minimumQuantity < 0){//validation
            throw new IllegalArgumentException();
        }
        this.discountRate = discountRate;
        this.minQuantity = minimumQuantity;
    }
    
    public final double getDiscountAmount(double unitCost, int quantity) {
        if(unitCost < 0 || quantity < 0){//validation
            throw new IllegalArgumentException();
        }
        return (quantity >= minQuantity ? unitCost*quantity*discountRate : 0);
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

    public final double getMinQuantity() {
        return minQuantity;
    }

    public final void setMinQuantity(double minQuantity) {
        if (minQuantity < 0) {//validation
            throw new IllegalArgumentException();
        }
        this.minQuantity = minQuantity;
    }
    
}

