
public class Product {
    private String id;
    private int quantity;
    private double unitCost;
    private String name;
    private String description;
    private DiscountStrategy discount;

    public Product(String id, int quantity, double unitCost, String name, String description, DiscountStrategy discount) {
        this.id = id;
        this.quantity = quantity;
        this.unitCost = unitCost;
        this.name = name;
        this.description = description;
        this.discount = discount;
    }
    
    public Product(String id, int quantity){
        this.id = id;
        this.quantity = quantity;
    }
    
    public double getDiscountAmount(){
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

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
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

