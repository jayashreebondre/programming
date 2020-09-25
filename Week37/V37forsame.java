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
            num = getNummer(4);
            result = fourSame(num);

            if(result == true)
            {
                notsame = false;
            }
        }
    }
    public static int[] getNummer(int x)
    {
        int []number = new int[x];
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter any four numbers");
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
            System.out.println("The numbers are equal. Congratulations.");
            return true;
        }
        else{
            System.out.println("The numbers are not equal. please input again.");
            return false;
        }
    }
}
