//Write a C# program to print fibonacci series without using recursion.

using System;

class fibonacciSeries
{
    static void Main()
    {
        int n = 10;

        PrintFibonacciSeries(n);

    }

    static void PrintFibonacciSeries(int count)
    {
        int first = 0, second = 1;

        for(int i = 0; i<count; i++)
        {
            Console.Write(first + " ");

            int next = first + second;
            first = second;
            second = next;
        }
    }
}


//Write a C# program to print fibonacci series with using recursion.

class Program
{
    static void Main(string[] args)
    {
        Console.WriteLine("Enter number which you want to print in terms of fibonacci series");
        int n = int.Parse(Console.ReadLine());

        Console.WriteLine("Fibonacci series :");

        for(int i=0; i<n; i++)
        {
            Console.Write(fibonacci(i)+" ");
        }
    }

    static int fibonacci(int n)
    {
        if(n<=1)
        {
            return n;
        }

        else
        {
            return fibonacci(n-1) + fibonacci(n-2);
        }
    }
}

