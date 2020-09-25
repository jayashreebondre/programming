import java.util.Scanner;

public class Congratulations
{
  public static void main(String[]args)
{
    boolean notfound = true;
    System .out.print("Enter a Number: ");

    while(notfound == true)
    {
      Scanner input = new Scanner(System.in);
      int number = input.nextInt();

      if(0 <= number && number < 10)
      {
        System.out.println("congratulations !!! This is lucky number ");
        notfound = false;
      }
      else
      {
          System.out.println("Try new number... ");
      }
    }

  }
}
