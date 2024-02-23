//Write a java program to print alphabet triangle.

public class AlphabetTriangle 
{
    public static void main(String[] args) 
    {
        char startChar = 'A';
        char endChar = 'Z';
        int numberOfRows = endChar - startChar + 1;

        for (int i = 0; i < numberOfRows; i++) 
        {
            for (int j = 0; j < numberOfRows - i - 1; j++) 
            {
                System.out.print(" ");
            }

            for (int j = 0; j <= i; j++) 
            {
                System.out.print((char) (startChar + j));
            }

            for (int j = i - 1; j >= 0; j--) 
            {
                System.out.print((char) (startChar + j));
            }

            System.out.println();
        }
    }
}
