//Write a c# program to print factorial of a number.

using System;
public class factorialNumber
{
    static void Main()
    {
        int n;
        Console.WriteLine("Enter the number : ");
        n = int.Parse(Console.ReadLine());

        int fact = 1;

        for (int i = 1; i <= n; i++)
        {
            fact = fact * i;
        }

        Console.WriteLine("The factorial of {0} is " + fact, n);
        Console.ReadLine();
    }
}