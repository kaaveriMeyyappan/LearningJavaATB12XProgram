package Codingchallenge;

public class mainemployee {
        public static void main(String[] args) {
            // Create an instance of Employee
            Employee employee = new Employee();

            // Set values using setter methods
            employee.setEmployeeId(1);
            employee.setEmployeeName("John Doe");
            employee.setEmployeeSalary(50000);

            // Get values using getter methods
            int employeeId = employee.getEmployeeId();
            String employeeName = employee.getEmployeeName();
            String formattedSalary = employee.getFormattedSalary();

            // Print the values
            System.out.println("Employee Details:");
            System.out.println("ID: " + employeeId);
            System.out.println("Name: " + employeeName);
            System.out.println("Salary: " + formattedSalary);
        }
    }

