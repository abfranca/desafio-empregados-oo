package entities;

import java.util.ArrayList;
import java.util.List;

public class Department {

    public Department() {
    }

    public Department(Address address, String name, int payDay) {
        this.address = address;
        this.employees = new ArrayList<Employee>();
        this.name = name;
        this.payDay = payDay;
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    public Address getAddress() {
        return address;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public String getName() {
        return name;
    }

    public int getPayDay() {
        return payDay;
    }

    public double payroll() {
        double payroll = 0.00;

        for (Employee employee : employees) {
            payroll += employee.getSalary();
        }

        return payroll;
    }

    public void removeEmployee(Employee employee) {
        employees.remove(employee);
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPayDay(int payDay) {
        this.payDay = payDay;
    }

    private Address address;
    private List<Employee> employees;
    private String name;
    private int payDay;

}
