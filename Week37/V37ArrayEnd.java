import java.util.Scanner;

public  class V37ArrayEnd{

  public static void main(String[]args){
    System.out.println("Enter length of array");
    Scanner input = new Scanner(System.in);
    int number1 = input.nextInt();
      System.out.println("Enter position of true in array");
    int number2 = input.nextInt();
    if(number1>number2){
      boolean array[] =arrayEndTrue(number1,number2);


      for (int i = 0; i<array.length;i++){
        System.out.println("Array["+i+"]="+array[i]);
    }
  }
    else
    {
      System.out.println("position of true should be less than length of array");
    }


  }

  public static boolean[] arrayEndTrue(int x ,int y){
    boolean ar[] = new boolean[x];
    ar[y-1]= true;
    return ar;
  }

}
