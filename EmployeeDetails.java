import java.util.Scanner;

class Employee{
	Scanner sc = new Scanner(System.in);
	private int eid;
	private String name;
	float salary;
	
	void inputDetails() {
		System.out.println("Input Details:");
		
		System.out.print("Enter Employee ID : ");
		eid = sc.nextInt();
		sc.nextLine();
		System.out.print("Enter Employee Name : ");
		name = sc.nextLine();
	}
	
	
	void showDetails() {
		System.out.println("Employee Details :");
		System.out.println("Employee ID : " + eid);
		System.out.println("Employee ID : " + name);
	}
}
public class EmployeeDetails {
	public static void main(String[] args) {
		Employee emp1 = new Employee();
		emp1.inputDetails();
		emp1.showDetails();
	}
}

