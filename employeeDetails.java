import java.util.Scanner;

public class employeeDetails {

	public static void main(String[] args) {
		 Scanner sc =new Scanner(System.in);
		 
		 System.out.println("Enter Employee ID :");
		int employee_id = sc.nextInt();
		 System.out.println("Enter Employee Name :");
		String employee_name = sc.nextLine();
		 System.out.println("Enter Employee Salary :");
		int employee_salary= sc.nextInt();
		 System.out.println("Enter Employee Address :");
		String employee_address = sc.nextLine();
		 System.out.println("Enter Employee Contact :");
		char employee_contact = sc.next().charAt(0);
		 System.out.println("Enter Employee Gender :");
		char employee_gender = sc.next().charAt(0);
		
		 System.out.println("Employee ID :" +employee_id );
		
		 System.out.println("Employee Name :" +employee_name);
		
		 System.out.println("Employee Salary :" +employee_salary);
			
		 System.out.println("Employee Address :" +employee_address);
			
		 System.out.println("Employee Contact :" +employee_contact);
			
		 System.out.println("Employee Gender :" +employee_gender);

			

	}

}
