/**
 * Strategy that provides a way to find products by product id.
 * @version 1.0
 * @author Joe Rankin
 */
public interface ProductInformationStrategy {
    
    public abstract Product findProduct(String productId);
    
}
