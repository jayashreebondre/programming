import java.util.Scanner;
public class weekdays
{
  public static void main(String[] args)
  {
    System.out.println("1-7");
     Scanner input = new Scanner (System.in);
     int day = input.nextInt();
    if (day==1)
    {
      System.out.println ("Monday");
    } else if (day==2){
      System.out.println ("Tuesday");
    } else if (day==3){
      System.out.println ("Wendesday");
    } else if(day==4){
      System.out.println ("Thursday");
    } else if (day==5){
      System.out.println("Friday");
    } else if (day==6){
      System.out.println("Saturday");
    } else if (day==7){
      System.out.println("Sunday");
    } else if (day<=0 || day >=8){
      System.out.println ("Please enter number between 1 to 7");
    }
  }
}
