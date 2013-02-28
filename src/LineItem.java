/**
 * Contains a product and quantity, and provides a way to get the total cost,
 * subtotal, discount amount, unit cost, product, quantity, and name of the
 * product.
 * @version 1.0
 * @author Joe Rankin
 */
public class LineItem {
    
    private Product product;
    private int quantity;

    public LineItem(String productId, int quantity) {
        if(productId == null || quantity < 0){//validation
            throw new IllegalArgumentException();
        }
        this.product = new Product(productId);
        this.quantity = quantity;
    }
    
    public LineItem(Product product, int quantity){
        if(product == null || quantity < 0){//validation
            throw new IllegalArgumentException();
        }
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
        if(id == null){//validation
            throw new IllegalArgumentException();
        }
        product.setId(id);
    }
    
    public final double getUnitCost(){
        return product.getUnitCost();
    }
    
    public final void setUnitCost(double unitCost){
        if(unitCost < 0){//validation
            throw new IllegalArgumentException();
        }
        product.setUnitCost(unitCost);
    }
    
    public final int getQuantity() {
        return quantity;
    }

    public final void setQuantity(int quantity) {
        if(quantity < 0){//validation
            throw new IllegalArgumentException();
        }
        this.quantity = quantity;
    }
    
    public final String getName(){
        return product.getName();
    }
    
    public final void setName(String name){
        if(name == null){//validation
            throw new IllegalArgumentException();
        }
        product.setName(name);
    }
    
    public final String getDescription(){
        return product.getDescription();
    }
    
    public final void setDescription(String description){
        if(description == null){//validation
            throw new IllegalArgumentException();
        }
        product.setDescription(description);
    }
    
    public final void setDiscount(DiscountStrategy discount){
        if(discount == null){//validation
            throw new IllegalArgumentException();
        }
        product.setDiscount(discount);
    }
    
}

