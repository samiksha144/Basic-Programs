//Write a c# program to convert number in characters.

using System;

class NumberToCharacters
{
    private static string[] ones =
    {
        "Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"
    };

    private static string[] teens =
    {
        "Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen",
        "Seventeen", "Eighteen", "Nineteen"
    };

    private static string[] tens =
    {
        "", "", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"
    };

    private static string[] thousands =
    {
        "", "Thousand", "Million", "Billion"
    };

    public static string ConvertNumberToWords(int number)
    {
        if (number == 0)
            return ones[0];

        if (number < 0)
            return "Minus " + ConvertNumberToWords(Math.Abs(number));

        string words = "";

        for (int i = 0; number > 0; i++)
        {
            if (number % 1000 != 0)
            {
                words = ConvertHundreds(number % 1000) + thousands[i] + " " + words;
            }
            number /= 1000;
        }

        return words.Trim();
    }

    private static string ConvertHundreds(int number)
    {
        string current;

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

    static void Main(string[] args)
    {
        Console.WriteLine("Enter a number: ");
        int number = int.Parse(Console.ReadLine());

        Console.WriteLine(ConvertNumberToWords(number));
    }
}
