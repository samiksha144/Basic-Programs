//Write a c# program to swap two numbers using third variable.

import java.util.Scanner;

public class SwappingNumbers 
{
    public static void main(String[] args) 
    {
        System.out.println("Enter first number : ");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        
        System.out.println("Enter second number : ");
        int b = scanner.nextInt();

        System.out.println("Before swapping value of a = " + a + " and b = " + b);
        
        int temp;
        
        temp = a;
        a = b;
        b = temp;
        
        System.out.println("After swapping value of a = " + a + " and b = " + b);
        
        scanner.close();
    }
}


//Write a c# program to swap two numbers without using third variable.


public class SwappingNumbers 
{
    public static void main(String[] args) 
    {
        System.out.println("Enter first number : ");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        
        System.out.println("Enter second number : ");
        int b = scanner.nextInt();

        System.out.println("Before swapping value of a = " + a + " and b = " + b);
        
        a = a+b;
        b = a-b;
        a = a-b;
        
        System.out.println("After swapping value of a = " + a + " and b = " + b);
        
        scanner.close();
    }
}
