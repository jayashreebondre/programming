import java.util.Scanner;

public  class V35Multi
{
  public  static void main(String[]args)
  {
    System.out.println("Skriv tolet multiplikationstabell");
    Scanner input= new Scanner(System.in);
    int number = input.nextInt();

    for(int i=1;i<=10;i++)
    {
      int result = number*i;
      //System.out.println(result);
      System.out.println(number +" * "+i+ " = "+result);
    }
  }
}
