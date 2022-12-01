package Lab;

public abstract class Employee  extends Person implements Bills{

    @Override
    double taxes(double amount) {
        
        return amount * 0.2;
    }
    
}
