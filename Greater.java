import java. util.Scanner;

public class Greater{
  public  static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int first = input.nextInt();
    int second = input. nextInt();
    int third = input. nextInt();
    if (first>second && first> third){
      System.out.println(" The first is greater");
    }
    if (second>first && second>third){
      System.out.println ("The Second is greater");
    }
    if (third>first && third>second){
      System.out.println("The third is greater");
    }


  }
}
