import java.util.Scanner;

public class Substract
{
  public static void main (String []args)


  //  int i;
  //  for (i=0;i<3;i++ )


  {
   System.out.println("Input first number");
    System.out.println("Input Scond Number");
   Scanner input = new Scanner (System.in);
   int number1 = input.nextInt();
   int number2= input.nextInt();
    printSubstractTen(number1, number2);
 }
  public static void printSubstractTen(int number1, int number2)

  {
    System.out.println("Output:  " +(number1-number2));
  }
}
