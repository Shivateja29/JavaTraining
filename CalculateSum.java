import java.util.Scanner;

public class CalculateSum {

	static int calculateSum(int N) 
	{ 
	    int n1, n2, n3; 
	 
	    n1 = ((N / 3)) * (2 * 3 + (N / 3 - 1) * 3) / 2; 
	    n2 = ((N / 5)) * (2 * 5 + (N / 5 - 1) * 5) / 2; 
	    n3 = ((N / 15)) * (2 * 15 + (N / 15 - 1) * 15) / 2; 
	 
	    return n1 + n2 - n3; 
	} 
	 
	// Driver code 
	 public static void main (String[] args) {
	   
		 
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number N");
		int N=sc.nextInt();
		 
	    System.out.print("The sume is" +calculateSum(N)); 
	}
	 
	} 