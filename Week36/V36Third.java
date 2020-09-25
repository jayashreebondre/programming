import java.util.Scanner;

public class V36Third
{

  public static void main(String []args)
  {
        Scanner input =new Scanner(System.in);
        boolean loop = true;
        String oldText="";

        while(loop)
        {
          System.out.println("write something else");
          String newText = input.nextLine();
          if(newText.equals(oldText))
          {
            loop = false;
          }
          else
          {
            oldText=newText;
          }
        }
  }
}
