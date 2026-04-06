package interfaces;

// Employee.java
public abstract class Employee implements Payable {
    private String name;
    private String employeeId;

    public Employee(String name, String employeeId) {
        this.name = name;
        this.employeeId = employeeId;
    }

    public String getName() { return name; }
    
    // Note: We don't implement getPaymentAmount() here because
    // Employee is abstract. Subclasses will handle it!
}

