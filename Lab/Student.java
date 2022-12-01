package Lab;

public class Student extends Person implements Bills {
    
    public double taxes(double amount){

        return amount * .02;
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
        
        public Student(String firstName, String lastName, String userName) {
            super(firstName, lastName, userName);
        }

        @Override
        public String toString() {
            return "Student []";
        }
        
}
