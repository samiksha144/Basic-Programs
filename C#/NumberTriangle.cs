//Write a c# program to print number triangle.


using System;

class NumberTriangle
{
    static void Main(string[] args)
    {
        int numberOfRows = 5; // You can change this to adjust the size of the triangle

        for (int i = 1; i <= numberOfRows; i++)
        {
            // Print spaces to align the numbers
            for (int j = 1; j <= numberOfRows - i; j++)
            {
                Console.Write(" ");
            }

            // Print numbers in ascending order
            for (int j = 1; j <= i; j++)
            {
                Console.Write(j);
            }

            // Print numbers in descending order
            for (int j = i - 1; j >= 1; j--)
            {
                Console.Write(j);
            }

            Console.WriteLine();
        }

        Console.ReadLine(); 
    }
}
