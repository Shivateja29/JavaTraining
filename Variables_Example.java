import java.util.Scanner;

public class Variables_Example{
	 public static void main(String[] args) {
		 Scanner Num = new Scanner(System.in);
		  
		 System.out.println("Enter number1 :");
		 int number1 = Num.nextInt();
		 
		 System.out.println("Enter number2 :");
		 int number2 = Num.nextInt();
		 
		 if (number1 == number2)
		 {
			 System.out.println(" number1 and number2 values are  equal ");
		 }
			 else
			 {
				 System.out.println(" number1 and number2 values are not  equal ");
		    }
		   
		  }
}
