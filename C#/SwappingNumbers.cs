 //Write a c# program to swap two numbers using third variable.

using System;
public class SwappingNumbers
{
    static void Main()
    {
        Console.WriteLine("Enter first number : ");
        int a = int.Parse(Console.ReadLine());

        Console.WriteLine("Enter second number : ");
        int b = int.Parse(Console.ReadLine());

        Console.WriteLine("Before swapping value of a = {0}, b = {1}",a,b);

        int temp;

        temp = a;
        a = b;
        b = temp;

        Console.WriteLine("After swapping value of a = {0}, b = {1}", a, b);
    }
}


//Write a c# program to swap two numbers without using third variable.

using System;
public class SwappingNumbers
{
    static void Main()
    {
        Console.WriteLine("Enter first number : ");
        int a = int.Parse(Console.ReadLine());

        Console.WriteLine("Enter second number : ");
        int b = int.Parse(Console.ReadLine());

        Console.WriteLine("Before swapping value of a = {0}, b = {1}",a,b);

        a = a + b;
        b = a - b;
        a = a - b;

        Console.WriteLine("After swapping value of a = {0}, b = {1}", a, b);
    }
}
