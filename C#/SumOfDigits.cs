//Write a c# program to print sum of digits.


using System;

public class sumOfDigits
{
    static void Main()
    {
        int n;
        Console.WriteLine("Enter the number : ");
        n = int.Parse(Console.ReadLine());

        int rem, sum = 0;

        while(n != 0)
        {
            rem = n % 10;
            sum = sum + rem;
            n = n / 10;
        }
        Console.WriteLine("The sum of given digits is " + sum);
    }
}