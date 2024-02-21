//Write a c# program to check prime number.

using System;
   class PrimeNumber 
   {
      public static void Main() 
      {
         int n = 5, a = 0;
         for (int i = 1; i <= n; i++) 
         {
            if (n % i == 0) 
            {
               a++;
            }
         }
         if (a == 2) 
         {
            Console.WriteLine("{0} is a Prime Number", n);
         } 
         else 
         {
            Console.WriteLine("{0} Not a Prime Number", n);
         }
         Console.ReadLine();
      }
   }
