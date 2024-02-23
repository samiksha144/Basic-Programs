
//Write a c# program to check armstrong number.

using System;
public class armstrongNumber
{
    static void Main()
    {
        int n;
        Console.WriteLine("Enter the number : ");
        n = int.Parse(Console.ReadLine());

        int rem, cube, result = 0;
        int temp = n;

        while(n!=0)
        {
            rem = n % 10;
            cube = rem * rem * rem;
            result = result + cube;
            n = n / 10;
        }

        n = temp;

        if(n==result)
        {
            Console.WriteLine("{0} is an Armstrong number", n);
        }
        else
        {
            Console.WriteLine("{0} is not an Armstrong number", n);
        }
    }
}