import java.util.Scanner;

public class ArmstrongNumber 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n = scanner.nextInt();

        int rem, cube, result = 0;
        int temp = n;

        while (n != 0) 
        {
            rem = n % 10;
            cube = rem * rem * rem;
            result = result + cube;
            n = n / 10;
        }

        if (temp == result) 
        {
            System.out.println(temp + " is an Armstrong number");
        } 
        else 
        {
            System.out.println(temp + " is not an Armstrong number");
        }
    }
}
