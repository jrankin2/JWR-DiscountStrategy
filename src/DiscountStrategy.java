
public interface DiscountStrategy {

    public double getDiscountAmount(double unitCost, int quantity);
    
    public double getDiscountRate();

    public void setDiscountRate(double discountRate);
}

