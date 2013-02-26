
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
    
    public double getDiscountAmount(int quantity){
        if(discount != null){
            return discount.getDiscountAmount(unitCost, quantity);
        } else{
            return 0;
        }
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    
    public double getUnitCost() {
        return unitCost;
    }

    public void setUnitCost(double unitCost) {
        this.unitCost = unitCost;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public DiscountStrategy getDiscount() {
        return discount;
    }

    public void setDiscount(DiscountStrategy discount) {
        this.discount = discount;
    }
    
    
}

