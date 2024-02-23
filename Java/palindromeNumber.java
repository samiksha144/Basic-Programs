//Write a java program to check palindrome number.

import java.util.Scanner;

 class PalindromeNumber 
 {
    public static void main(String[] args) 
    {
        int n, rem;
        int result = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        n = scanner.nextInt();

        int temp = n;

        while (n != 0) 
        {
            rem = n % 10;
            result = result * 10 + rem;
            n = n / 10;
        }

        n = temp;

        if (result == n) 
        {
            System.out.println(n + " is a palindrome number");
        } 
        else 
        {
            System.out.println(n + " is not a palindrome number");
        }
        scanner.close();
    }
}

        

//Write a java program to check palindrome string.

class PalindromeString 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Please provide input string : ");
        String input = scanner.nextLine();
        
        String reverse = "";

        int end = input.length() - 1;

        while (end >= 0) 
        {
            reverse = reverse + input.charAt(end);
            end--;
        }

        if (input.equals(reverse)) 
        {
            System.out.println(input + " is a palindrome string");
        } 
        else 
        {
            System.out.println(input + " is not a palindrome string");
        }
        
        scanner.close();
    }
}
