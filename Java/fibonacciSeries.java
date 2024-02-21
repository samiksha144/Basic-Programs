//Write a Java program to print fibonacci series without using recursion.

import java.util.Scanner;

class fibonacciSeries
	{
		public static void main(String[] args)
	    {
	        int n = 10;

	        PrintFibonacciSeries(n);

	    }

	    public static void PrintFibonacciSeries(int count)
	    {
	        int first = 0, second = 1;

	        for(int i = 0; i<count; i++)
	        {
	        	System.out.println(first + " ");

	            int next = first + second;
	            first = second;
	            second = next;
	        }
	    }
	}


//Write a Java program to print fibonacci series with using recursion.


public class Program 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number which you want to print in terms of Fibonacci series:");
        int n = scanner.nextInt();

        System.out.println("Fibonacci series:");

        for (int i = 0; i < n; i++) 
        {
            System.out.print(fibonacci(i) + " ");
        }
    }

    static int fibonacci(int n) 
    {
        if (n <= 1) 
        {
            return n;
        } 
        else 
        {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }
}