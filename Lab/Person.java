package Lab;

public abstract class Person {
   private String firstName;
   private String lastName;
   private String userName;
   
   
   
   
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

public String getUserName() {
    return userName;
}

public void setUserName(String userName) {
    this.userName = userName;
}

    abstract double taxes(double taxes);

    public double calculateTelePhoneBill(double amount){
        return this.taxes(amount) + amount;
    }

    @Override
    public String toString() {
        return "Person [firstName=" + firstName + ", lastName=" + lastName + "]";
    }

    
}
