//Write a java program to convert number in characters.

import java.util.Scanner;

public class NumberToCharacters 
{
    private static final String[] ones = 
    {
        "Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"
    };

    private static final String[] teens = 
    {
        "Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen",
        "Seventeen", "Eighteen", "Nineteen"
    };

    private static final String[] tens = 
    {
        "", "", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"
    };

    private static final String[] thousands = 
    {
        "", "Thousand", "Million", "Billion"
    };

    public static String convertNumberToWords(int number) 
    {
        if (number == 0)
            return ones[0];

        if (number < 0)
            return "Minus " + convertNumberToWords(Math.abs(number));

        String words = "";

        for (int i = 0; number > 0; i++) 
        {
            if (number % 1000 != 0) 
            {
                words = convertHundreds(number % 1000) + thousands[i] + " " + words;
            }
            number /= 1000;
        }

        return words.trim();
    }

    private static String convertHundreds(int number) 
    {
        String current;

        if (number % 100 < 10) 
        {
            current = ones[number % 100];
            number /= 100;
        } 
        else if (number % 100 < 20) 
        {
            current = teens[number % 10];
            number /= 100;
        } 
        else 
        {
            current = ones[number % 10];
            number /= 10;

            current = tens[number % 10] + current;
            number /= 10;
        }
        if (number == 0)
            return current;
        return ones[number] + " Hundred" + current;
    }

    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = scanner.nextInt();
        System.out.println(convertNumberToWords(number));
        scanner.close();
    }
}
