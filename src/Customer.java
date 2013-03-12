/**
 * Has a customer id, first name and last name, represents a customer.
 * @version 1.0
 * @author Joe Rankin
 */
public class Customer {
    private String id;
    private String firstName;
    private String lastName;
    
    public Customer(String id) {
        if(id == null){//validation
            throw new IllegalArgumentException();
        }
        this.id = id;
    }
    
    public Customer(Customer c){
        if(c == null){//validation
            throw new IllegalArgumentException();
        }
        this.id = c.getId();
        this.firstName = c.getFirstName();
        this.lastName = c.getLastName();
    }

    public Customer(String id, String firstName, String lastName) {
        if(id == null || firstName == null || lastName == null){//validation
            throw new IllegalArgumentException();
        }
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }
    
    public final String getFullName(){
        return firstName + " " + lastName;
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

    public final String getFirstName() {
        return firstName;
    }

    public final void setFirstName(String firstName) {
        if(firstName == null){//validation
            throw new IllegalArgumentException();
        }
        this.firstName = firstName;
    }

    public final String getLastName() {
        return lastName;
    }

    public final void setLastName(String lastName) {
        if(lastName == null){//validation
            throw new IllegalArgumentException();
        }
        this.lastName = lastName;
    }

}

