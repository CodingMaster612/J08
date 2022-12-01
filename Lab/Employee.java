package Lab;

public class Employee extends Person implements Bills {

    public double taxes(double amount){
        
        return amount * .20;
        }
        
        public double calculateTelePhoneBill(double amount){

            return this.taxes(amount) + amount;
        }
        public double gasBill(double amount){

            return this.taxes(amount)+ amount;
        }
        public double carInsurance(double amount){

            return this.taxes(amount)+ amount;
        }



        public Employee(String firstName, String lastName, String userName) {
            super(firstName, lastName, userName);
        }

        @Override
        public String toString() {
            return "Employee []";
        }
}
