
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
    
    public String getFullName(){
        return firstName + " " + lastName;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

}

