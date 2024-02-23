//Write a java program to print sum of digits.

import java.util.Scanner;

public class sumOfDigits
{
    public static void main(Strings[] args)
    {
        int n;
        System.out.println("Enter the number : ");
        Scanner scanner = new Scanner(System.in);
        n=scanner.nextInt();

        int rem, sum = 0;

        while(n != 0)
        {
            rem = n % 10;
            sum = sum + rem;
            n = n / 10;
        }
        System.out.println("The sum of digits is " + sum);

        scanner.close();
    }

}