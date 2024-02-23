//Write a java program to print number triangle.


public class NumberTriangle 
{
    public static void main(String[] args) 
    {
        int numberOfRows = 5; // You can change this to adjust the size of the triangle

        for (int i = 1; i <= numberOfRows; i++) 
        {
            // Print spaces to align the numbers
            for (int j = 1; j <= numberOfRows - i; j++) 
            {
                System.out.print(" ");
            }

            // Print numbers in ascending order
            for (int j = 1; j <= i; j++) 
            {
                System.out.print(j);
            }

            // Print numbers in descending order
            for (int j = i - 1; j >= 1; j--) 
            {
                System.out.print(j);
            }

            System.out.println();
        }
    }
}
