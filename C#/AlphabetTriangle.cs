//Write a c# program to print alphabet triangle.

using System;

class AlphabetTriangle
{
    static void Main(string[] args)
    {
        char startChar = 'A';
        char endChar = 'Z';
        int numberOfRows = endChar - startChar + 1;

        for (int i = 0; i < numberOfRows; i++)
        {
            // Print spaces before the characters
            for (int j = 0; j < numberOfRows - i - 1; j++)
            {
                Console.Write(" ");
            }

            // Print characters in increasing order
            for (int j = 0; j <= i; j++)
            {
                Console.Write((char)(startChar + j));
            }

            // Print characters in decreasing order
            for (int j = i - 1; j >= 0; j--)
            {
                Console.Write((char)(startChar + j));
            }

            Console.WriteLine();
        }

        Console.ReadLine(); 
    }
}
