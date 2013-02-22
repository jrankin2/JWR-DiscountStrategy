
public class LineItem {
    
    private Product product;
    private int quantity;

    public LineItem(String productId, int quantity) {
        this.product = new Product(productId);
        this.quantity = quantity;
    }
    
    @Override
    public String toString(){
        return "";
    }
    
    public static String getOutputHeader(){
        String output = String.format("%-8s %-16s %-8s %-8s %-8s %-8s\n", 
                "PID",
                "Name",
                "Qty",
                "Price",
                "Savings",
                "Total");
        output += String.format("%60s\n", "").replace(' ', '-');
        return output;
    }
    
    public String getLineOutput(){
        String output = String.format("%1$-8s %2$-16s %3$-8d %4$-8.02f %5$-8.02f %6$-8.02f\n", 
                getId(), 
                getName(), 
                getQuantity(), 
                getUnitCost(), 
                getDiscountAmount(),
                getLineTotalCost()
                );
        return output;
    }
    
    public double getLineTotalCost(){
        return (product.getUnitCost()*getQuantity()) - product.getDiscountAmount(quantity);
    }
    
    public String getId(){
        return product.getId();
    }
    
    public void setId(String id){
        product.setId(id);
    }
    
    public double getUnitCost(){
        return product.getUnitCost();
    }
    
    public void setUnitCost(double unitCost){
        product.setUnitCost(unitCost);
    }
    
    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    
    public String getName(){
        return product.getName();
    }
    
    public void setName(String name){
        product.setName(name);
    }
    
    public String getDescription(){
        return product.getDescription();
    }
    
    public void setDescription(String description){
        product.setDescription(description);
    }
    
    public double getDiscountAmount(){
        return product.getDiscountAmount(quantity);
    }
    
    public void setDiscount(DiscountStrategy discount){
        product.setDiscount(discount);
    }
    
    

}

