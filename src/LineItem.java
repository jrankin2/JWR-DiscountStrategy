
public class LineItem {
    
    private Product product;
    private int quantity;

    public LineItem(String productId, int quantity) {
        this.product = new Product(productId);
        this.quantity = quantity;
    }
    
    public LineItem(Product product, int quantity){
        this.product = product;
        this.quantity = quantity;
    }
    
    
    
    
    
    public final double getTotalCost(){
        return (product.getUnitCost()*getQuantity()) - product.getDiscountAmount(quantity);
    }
    
    public final double getDiscountAmount(){
        return product.getDiscountAmount(quantity);
    }
    
    public final double getSubTotal(){
        return getTotalCost() - getDiscountAmount();
    }
    
    public final String getId(){
        return product.getId();
    }
    
    public final void setId(String id){
        product.setId(id);
    }
    
    public final double getUnitCost(){
        return product.getUnitCost();
    }
    
    public final void setUnitCost(double unitCost){
        product.setUnitCost(unitCost);
    }
    
    public final int getQuantity() {
        return quantity;
    }

    public final void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    
    public final String getName(){
        return product.getName();
    }
    
    public final void setName(String name){
        product.setName(name);
    }
    
    public final String getDescription(){
        return product.getDescription();
    }
    
    public final void setDescription(String description){
        product.setDescription(description);
    }
    
    public final void setDiscount(DiscountStrategy discount){
        product.setDiscount(discount);
    }
    
}

