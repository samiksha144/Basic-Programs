import java.util.Scanner;

public class FactorialNumber 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n = scanner.nextInt();

        int fact = 1;

        for (int i = 1; i <= n; i++) 
        {
            fact = fact * i;
        }

        System.out.println("The factorial of " + n + " is " + fact);
        scanner.close();
    }
}
