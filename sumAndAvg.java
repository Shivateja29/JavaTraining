import java.util.Scanner;

public class sumAndAvg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc =new Scanner(System.in);
		 System.out.println("Enter number1 :");
		 int num1 = sc.nextInt();
		 System.out.println("Enter number2 :");
		 int num2 = sc.nextInt();
		 System.out.println("Enter number3 :");
		 int num3 = sc.nextInt();
		 System.out.println("Enter number4 :");
		 int num4 = sc.nextInt();
		 System.out.println("Enter number5 :");
		 int num5 = sc.nextInt();
		 int sum;
		 float avg;
		 sum = num1+num2+num3+num4+num5;
		 System.out.println("Sum of 5 numbers is :" +sum);
		 avg = sum/5;
		 System.out.println("Avg of 5 numbers is :" +avg);
	}

}
