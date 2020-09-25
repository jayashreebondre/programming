import java.util.Scanner;

public class Tax

{
  public static void main (String []args)
  {
    System.out.println("Värdet som skall betalas i skatt");
    Scanner input = new Scanner(System.in);
    double salary = input.nextDouble();
   returnTax(salary);

}
 public static void returnTax(double salary){

   if (salary >= 100000)
   {

   System.out.println("Tax is : "+ (salary*0.4));
  // return salary*0.4;
  }
  else
  {

  System.out.println ("Tax is :"+ (salary*0.3));
  //return salary*0.3;
}

}
}
