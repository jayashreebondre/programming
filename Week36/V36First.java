import java.util.Scanner;

public class V36First
{
  public static void main (String[] args)
  {
  System.out.println("Enter a Number:");
  Scanner input = new Scanner(System.in);
  int number = input.nextInt();


//  boolean result = isEven(number);
//  System.out.println(result);

  System.out.println(isEven(number));
  }

  public static boolean isEven(int number)
  {
    if (number%2==0)
    {
      return true;
    }
    else
    {
      return false;
    }
  }

  public static float sum(int x, float y)
  {
    float total = 0;
    total = x + y;
    return total;
  }




}
