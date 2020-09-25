import java.util.Scanner;

public class Taxcalculations
{
  public static void main (String []args)
  {
    System.out.println("Värdet som skall betalas i skatt");
    Scanner input = new Scanner(System.in);
    double salary = input.nextDouble();
    System.out.println("Calculated Tax is "+returnTax(salary));
  }

  public static double returnTax(double salary)
  {
    System.out.println("Salary is :   "+ salary);
    if (salary >= 100000){
        return salary*0.4;
    }
    else{
      return salary*0.3;
    }
  }
}
