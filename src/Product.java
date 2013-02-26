
public class Product {
    private String id;
    private double unitCost;
    private String name;
    private String description;
    private DiscountStrategy discount;

    public Product(String id, String name, double unitCost, DiscountStrategy discount) {
        this.id = id;
        this.unitCost = unitCost;
        this.name = name;
        this.discount = discount;
    }
    
    public Product(String id){
        this.id = id;
    }
    
    public final double getDiscountAmount(int quantity){
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
        this.id = id;
    }
    
    public final double getUnitCost() {
        return unitCost;
    }

    public final void setUnitCost(double unitCost) {
        this.unitCost = unitCost;
    }

    public final String getName() {
        return name;
    }

    public final void setName(String name) {
        this.name = name;
    }

    public final String getDescription() {
        return description;
    }

    public final void setDescription(String description) {
        this.description = description;
    }

    public final DiscountStrategy getDiscount() {
        return discount;
    }

    public final void setDiscount(DiscountStrategy discount) {
        this.discount = discount;
    }
    
    
}

