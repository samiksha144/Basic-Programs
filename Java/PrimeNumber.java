import java.util.Scanner;

class Program
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number to check whether it is prime or not");

        int n = scanner.nextInt();
        int a = 0;

        for (int i = 1; i <= n; i++) 
         {
            if (n % i == 0) 
            {
               a++;
            }
         }
         if (a == 2) 
         {
            System.out.println(n + " is prime number");
         } 
         else 
         {
            System.out.println(n + " is not a prime number");
         }
         
         scanner.close();
      }

    }
