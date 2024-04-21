```C#
using System;
using System.Collections.Generic;

class Program
{
    static void Main(string[] args)
    {
        Console.Write("Enter a number: ");
        int number = Convert.ToInt32(Console.ReadLine());

        if (IsHappyNumber(number))
        {
            Console.WriteLine(number + " is a happy number");
        }
        else
        {
            Console.WriteLine(number + " is not a happy number");
        }
    }

    static bool IsHappyNumber(int number)
    {
        var seen = new HashSet<int>();
        while (number != 1 && seen.Add(number))
        {
            int current = number;
            number = 0;
            while (current > 0)
            {
                int digit = current % 10;
                number += digit * digit;
                current /= 10;
            }
        }
        return number == 1;
    }
}
```