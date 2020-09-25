import java.util.Scanner;

public class ChatBot
{
  public static void main (String []args)
  {
    System.out.println("Input number");
    Scanner input = new Scanner(System.in);
    int number = input.nextInt();
    printSubstractTen(number);

  }

    public static void printSubstractTen(int number)


  {
    System.out.println("Output:  " + (number-10));
  }
}
