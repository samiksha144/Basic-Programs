
//Write a java program to convert decimal number to binary.

import java.util.Scanner;

class DecimalToBinaryConverter 
{
    public static void main(String[] args) 
    {
        System.out.println("Enter a decimal number: ");
        Scanner scanner = new Scanner(System.in);
        int decimalNumber = scanner.nextInt();

        System.out.println("Binary representation: " + DecimalToBinary(decimalNumber));
    }

    static String DecimalToBinary(int decimalNumber) 
    {
        if (decimalNumber < 0) 
        {
            decimalNumber = Math.abs(decimalNumber);
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

    static String DecimalToBinaryPositive(int decimalNumber) 
    {
        String binary = "";

        while (decimalNumber > 0) 
        {
            int remainder = decimalNumber % 2;
            binary = remainder + binary;
            decimalNumber /= 2;
        }

        return binary;
    }
}


//Write a java program to convert binary number to decimal.


public class Program 
{
    public static void main(String[] args) 
    {
        System.out.println("Enter a binary string: ");
        Scanner scanner = new Scanner(System.in);
        String binaryString = scanner.nextLine();

        if (!isBinary(binaryString)) 
        {
            System.out.println("Invalid input. Please enter a binary number containing only 0s and 1s.");
            return;
        }

        int decimalValue = 0;
        int power = 0;

        for (int i = binaryString.length() - 1; i >= 0; i--) 
        {
            int digit = binaryString.charAt(i) - '0';
            decimalValue += digit * Math.pow(2, power);
            power++;
        }

        System.out.println("Binary: " + binaryString);
        System.out.println("Decimal: " + decimalValue);
    }

    static boolean isBinary(String binaryString) 
    {
        for (char c : binaryString.toCharArray()) 
        {
            if (c != '0' && c != '1') 
            {
                return false;
            }
        }
        return true;
    }
}
