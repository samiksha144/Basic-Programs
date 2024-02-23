//Write a c# program to check palindrome number.

using System;
public class PalindromeNumber
{
    public static void Main(string[] args)
    {
        int n, rem;
        int result = 0;
        
        Console.Write("Enter the Number: ");
        n = int.Parse(Console.ReadLine());
        int temp = n;

        while (n != 0)
        {
            rem = n % 10;
            result = result * 10 + rem;
            n = n / 10;
        }

        n = temp;

        if(result == n)
        {
            Console.WriteLine("{0} is a palindrome number", n);
        }

        else
        {
            Console.WriteLine("{0} is not a palindrome number", n);
        }
    }
}
        

//Write a c# program to check palindrome string.
public class PalindromeString
{
    public static void Main(string[] args)
    {
        string input = " ";
        Console.Write("Please provide input string : ");
        input = Console.ReadLine();

        string reverse = string.Empty;

        int end = input.Length - 1;

        while(end>=0)
        {
            reverse = reverse + input[end];
            end--;
        }

        if(input==reverse)
        {
            Console.WriteLine("{0} is a palindrome string", input);
        }

        else
        {
            Console.WriteLine("{0} is not a palindrome string", input);
        }
    }
}
        
