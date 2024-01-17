import java.util.*;
class Check
{
    public static boolean checkNumber(int n)
    {
        if(n == 0)
        {
            return false;
        }
        while(n != 1)
        {
            if(n%2 != 0)
              return false;
            n=n/2;
        }
        return true;
    }
    public static void main(String[] args)
    {
        Scanner number = new Scanner(System.in);
        int n;
        System.out.println("Enter number: ");
        n = number.nextInt();
        if(checkNumber(n))
        {
            System.out.println("The number is power of 2");
        }
        else
        {
            System.out.println("The number is not power of 2");
        }
    }
}