package interfaces;

public class HourlyEmployee extends Employee {
    private double hourlyWage;
    private double hoursWorked;

    public HourlyEmployee(String name, String id, double wage, double hours) {
        super(name, id);
        this.hourlyWage = wage;
        this.hoursWorked = hours;
    }

    @Override
    public double getPaymentAmount() {
        if (hoursWorked <= 40) {
            return hourlyWage * hoursWorked;
        } else {
            // Overtime pay for hours over 40
            return (hourlyWage * 40) + ((hoursWorked - 40) * hourlyWage * 1.5);
        }
    }
    
}
