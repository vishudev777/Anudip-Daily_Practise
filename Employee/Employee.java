import java.util.Scanner;

public class Employee {
	String name;
	int age;
	String department;
	double salary;

	void displayInfo() {
		System.out.println("======= CONFIRN EMPLOYEE DETAILS =====");
		System.out.println("your name is " + name);
		System.out.println("your age  is " + age);
		System.out.println("your department is " + department);
		System.out.println("your salray is  " + salary + "\n");
		System.out.println("Thank you, your data will be stored in our Database\n");

	}

	public static void main(String[] args) {
		Employee emp = new Employee(); // making Employee Class Objext
		Scanner sc = new Scanner(System.in); // using Scanner object to get input form the keyboard

		System.out.println("======= Employee Information =====\n");

		System.out.print("Enter you name: ");
		emp.name = sc.nextLine();

		System.out.print("Enter you age: ");
		emp.age = sc.nextInt();
		sc.nextLine();

		System.out.print("Enter you department: ");
		emp.department = sc.nextLine();

		System.out.print("Enter your Salary: ");
		emp.salary = sc.nextDouble();

		System.out.println("\n");

		emp.displayInfo(); // calling the display information method to display all the details.

		sc.close(); // closing the scanner class to avoid confuion for the JVM

	}
}