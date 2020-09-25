import java.util.Scanner;

public class Pyramid
{
  public static void main(String[] args)
  {
    System.out.println("Input: ");
    Scanner input = new Scanner (System.in);
    int number = input.nextInt();

    int repeat;
    for(int row=1;row<=number;row++)
    {
      repeat=0;
      for (int space=1;space<=number-row; space++)
      {
        System.out.print(" ");
      }
      while (repeat != row)
      {
        System.out.print(row+" ");
        repeat++;
      }
      System.out.println("");
    }
  }
}
