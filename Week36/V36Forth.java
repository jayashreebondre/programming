import java.util.Scanner;

public class V36Forth {
    public static void main(String[] args)
    {
        System.out.println("Enter any two number");

        int number1 = GetNumber();
        int number2 = GetNumber();
        double mean = CalculatedMean(number1,number2);
        System.out.println(mean);
    }
    public static int GetNumber()
    {
        Scanner input =new Scanner(System.in);
        int number = input.nextInt();
        return number;
    }
    public static double CalculatedMean(int num1,int num2)
    {
        double result = (num1+num2)/2;
        return result;
    }

}
