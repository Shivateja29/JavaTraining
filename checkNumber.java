import java.util.Scanner;

public class checkNumber {
	
	 public static boolean checkNumber(int N) {
	        boolean increasing = false;
	        while(N>0) {
	            int lastDigit = N % 10;
	            N/= 10;
	            int nextLastDigit = N % 10;
	            
	            if(nextLastDigit<=lastDigit) {
	                increasing=true;
	            }
	            else {
	                increasing=false;
	                break;
	            }
	            
	        }
	        return increasing;
	    }
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    int N;
        boolean increasingNumber=false;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number N :");
        N = input.nextInt();
        increasingNumber = checkNumber(N);
        System.out.println(increasingNumber);
	}

}
