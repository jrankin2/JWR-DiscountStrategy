
public class LineItem {
    
    private Product product;

    public LineItem(String productId, int quantity) {
        this.product = new Product(productId, quantity);
    }
    
    @Override
    public String toString(){
        return "";
    }
    
    public static String getOutputHeaders(){
        String output = String.format("%-8s %-16s %-8s %-8s %-8s %-8s\n", 
                "PID",
                "Name",
                "Qty",
                "Price",
                "Savings",
                "Total");
        return output;
    }
    
    public String getOutputString(){
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
        return (product.getUnitCost()*product.getQuantity()) - product.getDiscountAmount();
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
    
    public int getQuantity(){
        return product.getQuantity();
    }
    
    public void setQuantity(int quantity){
        product.setQuantity(quantity);
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
        return product.getDiscountAmount();
    }
    
    public void setDiscount(DiscountStrategy discount){
        product.setDiscount(discount);
    }
    
    

}

