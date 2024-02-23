//Write a c# program to reverse given number

using System;

public class ReverseOfGivenNumber
{
    static void Main()
    {
        int n;
        Console.WriteLine("Enter the number : ");
        n = int.Parse(Console.ReadLine());

        int rem, result = 0;

        while(n != 0)
        {
            rem = n % 10;
            result = result*10 + rem;
            n = n / 10;
        }
        Console.WriteLine("The sum of digits is " + result);
    }
}