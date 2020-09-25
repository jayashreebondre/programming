import java.util.Scanner;

public class DoubleNumber{

  public static void main(String args[]){
System.out.println("Enter any two number");
  Scanner input = new Scanner(System.in);
  double number1 = input.nextDouble();
  double number2 = input.nextDouble();

boolean result = BetweenOneAndZero(number1,number2);

  }

  public static boolean BetweenOneAndZero(double num1, double num2){
    if (num1>0 && num1 <1) {
    }
      if (num2>0 && num2<1){
      return  true;
      }
    else {
      {
        return false;
      }
    }
    }
  }
