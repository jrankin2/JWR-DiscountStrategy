
public class Customer {
    private String id;
    private String firstName;
    private String lastName;
    
    public Customer(String id) {
        this.id = id;
    }
    
    public Customer(Customer c){
        this.id = c.getId();
        this.firstName = c.getFirstName();
        this.lastName = c.getLastName();
    }

    public Customer(String id, String firstName, String lastName) {
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
        this.id = id;
    }

    public final String getFirstName() {
        return firstName;
    }

    public final void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public final String getLastName() {
        return lastName;
    }

    public final void setLastName(String lastName) {
        this.lastName = lastName;
    }

}

