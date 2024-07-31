package app;

import java.util.Locale;
import java.util.Scanner;

import entities.Address;
import entities.Department;
import entities.Employee;

public class Main {
    public static void main(String[] args) throws Exception {

        Locale.setDefault(Locale.US);
        int employeesQuantity;
        Department department;
        String departmentEmail;
        String departmentName;
        int departamentPayDay;
        String departmentPhone;
        Scanner sc = new Scanner(System.in);

        System.out.print("Nome do departamento: ");
        departmentName = sc.nextLine();

        System.out.print("Dia do pagamento: ");
        departamentPayDay = sc.nextInt();
        sc.nextLine();

        System.out.print("Email: ");
        departmentEmail = sc.nextLine();

        System.out.print("Telefone: ");
        departmentPhone = sc.nextLine();

        department = new Department(new Address(departmentEmail, departmentPhone), departmentName, departamentPayDay);

        System.out.print("Quantos funcionários tem o departamento? ");
        employeesQuantity = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < employeesQuantity; i++) {
            String employeeName;
            double employeeSalary;

            System.out.printf("Dados do funcionário %d:\n", i+1);
            System.out.print("Nome: ");
            employeeName = sc.nextLine();

            System.out.print("Salário: ");
            employeeSalary = sc.nextDouble();
            sc.nextLine();

            department.addEmployee(new Employee(employeeName, employeeSalary));
        }

        showReport(department);

        sc.close();

    }

    public static void showReport(Department department) {

        System.out.println("\nFOLHA DE PAGAMENTO:");
        System.out.printf("Departamento %s = R$ %.2f\n", department.getName(), department.payroll());
        System.out.printf("Pagamento realizado no dia %d\n", department.getPayDay());
        System.out.println("Funcionários:");

        for (Employee employee : department.getEmployees()) {
            System.out.println(employee.getName());
        }

        System.out.printf("Para dúvidas favor entrar em contato: %s", department.getAddress().getEmail());

    }
}
