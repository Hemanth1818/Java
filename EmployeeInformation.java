import java.util.Scanner;

public class EmployeeInformation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Employee Information:");

        System.out.print("Employee ID: ");
        int employeeId = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character after nextInt()

        System.out.print("Employee Name: ");
        String employeeName = scanner.nextLine();

        System.out.print("Employee Salary: ");
        double employeeSalary = scanner.nextDouble();
        scanner.nextLine(); // Consume the newline character after nextDouble()

        System.out.print("Employee Address: ");
        String employeeAddress = scanner.nextLine();

        System.out.print("Employee Contact: ");
        String employeeContact = scanner.nextLine();

        System.out.print("Employee Gender: ");
        char employeeGender = scanner.next().charAt(0);
        
        // Displaying the entered information
        System.out.println("\nEmployee Information:");
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Employee Name: " + employeeName);
        System.out.println("Employee Salary: " + employeeSalary);
        System.out.println("Employee Address: " + employeeAddress);
        System.out.println("Employee Contact: " + employeeContact);
        System.out.println("Employee Gender: " + employeeGender);

        scanner.close();
    }
}
