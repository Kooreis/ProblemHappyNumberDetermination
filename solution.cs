using System;

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
}