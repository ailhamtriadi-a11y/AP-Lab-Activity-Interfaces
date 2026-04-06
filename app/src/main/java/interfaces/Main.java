package interfaces;
// Main.java
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // We create a list of the INTERFACE type
        List<Payable> accountsPayable = new ArrayList<>();

        // Add unrelated objects to the same list
        accountsPayable.add(new SalariedEmployee("Alice Smith", "E001", 1200.00));
        accountsPayable.add(new Invoice("Widget-99", 5, 20.00));
        accountsPayable.add(new SalariedEmployee("Bob Jones", "E002", 1500.00));
        accountsPayable.add(new Invoice("Hammer-01", 2, 15.50));
        accountsPayable.add(new HourlyEmployee("Charlie Brown", "E003", 25.00, 45.00));

        System.out.println("Processing Payments:\n---------------------");

        for (Payable item : accountsPayable) {
            // Polymorphism: Java knows which version of getPaymentAmount() to call!
            System.out.printf("Payment due: $%.2f%n", item.getPaymentAmount());
        }
    }
}
