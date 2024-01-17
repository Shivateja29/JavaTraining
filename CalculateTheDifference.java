import java.util.Scanner;

public class CalculateTheDifference {
	public static int calculateDifference(int n) {
        int sumOfSquares = 0;
        int sum = 0;
 
        for (int i = 1; i <= n; i++) {
            sumOfSquares += Math.pow(i, 2);
            sum += i;
        }
 
        int squareOfSum = (int) Math.pow(sum, 2);
        int absDifference = Math.abs(sumOfSquares - squareOfSum);
        return absDifference;
    }
 
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number N :"); 
		int N=sc.nextInt();
		
	    System.out.print("The Difference is" +calculateDifference(N)); 
	}

}
