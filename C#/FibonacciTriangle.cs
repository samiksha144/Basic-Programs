//Write a c# program to generate fibonacci triangle

using System;

class FibonacciTriangle
{
    static void Main()
    {
        Console.Write("Enter the number of rows for the Fibonacci triangle: ");
        int rows = Convert.ToInt32(Console.ReadLine());

        GenerateFibonacciTriangle(rows);
    }

    static void GenerateFibonacciTriangle(int rows)
    {
        int a = 0, b = 1, c;

        for (int i = 0; i < rows; i++)
        {
            for (int j = 0; j <= i; j++)
            {
                c = a + b;
                Console.Write($"{c} ");
                a = b;
                b = c;
            }
            Console.WriteLine();
        }
    }
}
