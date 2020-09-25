import java.util.Scanner;

public class V35Numbers
{
  public static void main(String[] args)
  {
    System.out.println("Enter any decimal Number");
    Scanner input = new Scanner (System.in);
    float number = input.nextFloat();

    if (number > 0)
    {
      if (number > 1000000)
      { System.out.println("Large");  }
      System.out.println(" Positive");
    }
    else if (number < 1)
    {
     System.out.println("Small");

     if (number == 0)
     {  System.out.println("zero");   }
     else if (number < 0)
     {  System.out.println("Negative");  }

    }
  }
}
