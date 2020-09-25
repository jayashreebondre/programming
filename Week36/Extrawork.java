import java.util.Scanner;
public class Extrawork
{
    public static void main (String []args)
    {

        //System.out.println("Enter a Number");

        //Scanner inputs = new Scanner(System.in);
        //int a = inputs.nextInt();

        int[] num = new int[4];
     boolean notsame=true;
     boolean result=false;

     while (notsame)
     {
         num = getNummer();
         result = fourSame(num);

         if(result == true)
         {
             notsame = false;
        }
     }

    }
    public static int[] getNummer ()
        {
            int []number = new int[4];
            Scanner scan = new Scanner(System.in);
            System.out.print("Enter any Number");
            number[0]=scan.nextInt();
            number[1]=scan.nextInt();
            number[2]=scan.nextInt();
            number[3]=scan.nextInt();

            return number;


        }
        public static boolean fourSame(int[] numbers)
        {
            if (numbers[0]==numbers[1] && numbers[1]==numbers[2] && numbers[2]==numbers[3])
            {
              return true;
            }
            else{
            System.out.println("the numbers are not equal. please input again.");
            return false;
            }
      }
}
