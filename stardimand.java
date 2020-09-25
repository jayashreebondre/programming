import java.util.Scanner;

public class stardimand
{
   public static void main (String []args)
   {
     System.out.println("Input:  ");
     Scanner input = new Scanner(System.in);
     int number = input.nextInt();

     int star = 0;
     int repeat = 0;
     boolean ismax = false;
     for(int row=1;row<=number;row++)
     {
      repeat = 0;
       for (int space=1;space<=number-row; space++)
       {
         System.out.print(" ");
       }
       while(repeat != 2*row-1)
       {
         System.out.print("*");
         repeat++;
       }
        System.out.println("");
     }
   }
}
