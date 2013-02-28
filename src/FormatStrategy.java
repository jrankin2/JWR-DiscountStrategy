/**
 * Strategy whose implementations provide a way to format a {@link Receipt} object's
 * data
 * @version 1.0
 * @author Joe Rankin
 */
public interface FormatStrategy {
    
    public abstract String formatReceipt(Receipt receipt);
    
}
