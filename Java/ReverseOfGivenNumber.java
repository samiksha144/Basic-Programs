//Write a java program to reverse given number

import java.util.Scanner;

public class ReverseOfGivenNumber 
{
    public static void main(String[] args) 
    {
        int n;
        System.out.println("Enter the number : ");
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();

        int rem, result = 0;

        while (n != 0) 
        {
            rem = n % 10;
            result = result * 10 + rem;
            n = n / 10;
        }
        System.out.println("The reverse of given number is " + result);
    }
}
