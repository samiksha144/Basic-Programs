//Write a java program to generate fibonacci triangle

import java.util.Scanner;

public class FibonacciTriangle 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rows for the Fibonacci triangle: ");
        int rows = scanner.nextInt();
        scanner.close();

        generateFibonacciTriangle(rows);
    }

    static void generateFibonacciTriangle(int rows) 
    {
        int a = 0, b = 1, c;

        for (int i = 0; i < rows; i++) 
        {
            for (int j = 0; j <= i; j++) 
            {
                c = a + b;
                System.out.print(c + " ");
                a = b;
                b = c;
            }
            System.out.println();
        }
    }
}
