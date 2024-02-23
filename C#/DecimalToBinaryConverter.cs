//Write a c# program to convert decimal number to binary.

using System;

class DecimalToBinaryConverter
{
    static void Main(string[] args)
    {
        Console.Write("Enter a decimal number: ");
        int decimalNumber = Convert.ToInt32(Console.ReadLine());

        Console.WriteLine($"Binary representation: {DecimalToBinary(decimalNumber)}");
    }

    static string DecimalToBinary(int decimalNumber)
    {
        if (decimalNumber < 0)
        {
            decimalNumber = Math.Abs(decimalNumber);
            return DecimalToBinaryPositive(decimalNumber);
        }
        else if (decimalNumber == 0)
        {
            return "0";
        }
        else
        {
            return DecimalToBinaryPositive(decimalNumber);
        }
    }

    static string DecimalToBinaryPositive(int decimalNumber)
    {
        string binary = "";

        while (decimalNumber > 0)
        {
            int remainder = decimalNumber % 2;
            binary = remainder + binary;
            decimalNumber /= 2;
        }

        return binary;
    }
}



//Write a c# program to convert binary number to decimal.

using System;

class Program
{
    static void Main(string[] args)
    {
        Console.Write("Enter a binary number: ");
        string binaryString = Console.ReadLine();

        // Validation check
        if (!IsBinary(binaryString))
        {
            Console.WriteLine("Invalid input. Please enter a binary number containing only 0s and 1s.");
            return;
        }

        int decimalValue = 0;
        int power = 0;

        for (int i = binaryString.Length - 1; i >= 0; i--)
        {
            int digit = binaryString[i] - '0'; // Convert char to int
            decimalValue += digit * (int)Math.Pow(2, power);
            power++;
        }

        Console.WriteLine("Binary: " + binaryString);
        Console.WriteLine("Decimal: " + decimalValue);
    }

    static bool IsBinary(string binaryString)
    {
        foreach (char c in binaryString)
        {
            if (c != '0' && c != '1')
            {
                return false;
            }
        }
        return true;
    }
}
