import java.util.Scanner;

public class Variables_Example1{
	 public static void main(String[] args) {
		 Scanner Num = new Scanner(System.in);
		  
		 System.out.println("Enter number1 :");
		 int number1 = Num.nextInt();
		 
		 System.out.println("Enter number2 :");
		 int number2 = Num.nextInt();

         System.out.println("Enter number3 :");
		 int number3 = Num.nextInt();

		 int sum = number1+number2+number3;
         int average = sum/3;
         int sub = number1-number2-number3;
         int multiplication = number1*number2*number3;


		 
		System.out.println(" sum of three numbers is : " +sum);
        System.out.println(" average of three numbers is : " +average);
        System.out.println(" subof three numbers is : " +sub);
        System.out.println(" multiplication of three numbers is : " +multiplication);
	
		    
		   
		  }
}
