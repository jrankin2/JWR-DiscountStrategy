/**
 * Contains a product id, its cost, name, description, and a discount that is
 * to be applied to this product.
 * @version 1.0
 * @author Joe Rankin
 */
public class Product {
    private String id;
    private double unitCost;
    private String name;
    private String description;
    private DiscountStrategy discount;

    public Product(String id, String name, double unitCost, DiscountStrategy discount) {
        if(id == null || name == null || unitCost < 0 || discount == null){//validation
            throw new IllegalArgumentException();
        }
        this.id = id;
        this.unitCost = unitCost;
        this.name = name;
        this.discount = discount;
    }
    
    public Product(String id){
        if(id == null){//validation
            throw new IllegalArgumentException();
        }
        this.id = id;
    }
    
    public final double getDiscountAmount(int quantity){
        if(quantity < 0){//validation
            throw new IllegalArgumentException();
        }
        
        if(discount != null){
            return discount.getDiscountAmount(unitCost, quantity);
        } else{
            return 0;
        }
    }

    public final String getId() {
        return id;
    }

    public final void setId(String id) {
        if(id == null){//validation
            throw new IllegalArgumentException();
        }
        
        this.id = id;
    }
    
    public final double getUnitCost() {
        return unitCost;
    }

    public final void setUnitCost(double unitCost) {
        if(unitCost < 0){//validation
            throw new IllegalArgumentException();
        }
        
        this.unitCost = unitCost;
    }

    public final String getName() {
        return name;
    }

    public final void setName(String name) {
        if(name == null){//validation
            throw new IllegalArgumentException();
        }
        
        this.name = name;
    }

    public final String getDescription() {
        return description;
    }

    public final void setDescription(String description) {
        if(description == null){//validation
            throw new IllegalArgumentException();
        }
        
        this.description = description;
    }

    public final DiscountStrategy getDiscount() {
        return discount;
    }

    public final void setDiscount(DiscountStrategy discount) {
        if(discount == null){//validation
            throw new IllegalArgumentException();
        }
        
        this.discount = discount;
    }

    @Override
    public String toString() {
        return "Product{" + "id=" + id + ", unitCost=" + unitCost + ", name=" + name + ", description=" + description + ", discount=" + discount + '}';
    }
    
    
}

