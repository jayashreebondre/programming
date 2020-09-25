import java.util.Scanner;

public class V35Alphabets
{
  public static void main(String[] args)
  {
    System.out.println("Enter any swedish alphabet");
    Scanner input = new Scanner (System.in,"utf-8");
    char alphabet = input.next().charAt(0);

    //char[] vowels = {'å', 'ä','ö','u','e','y'};
    char[] vowels = {'a','e','i','o','u'};
    boolean isvowel = false;

    /*
    if(alphabet == 'a' || alphabet == 'i' ||alphabet == 'e' ||alphabet == 'o' ||alphabet == 'u')
    {
      System.out.println("Alphabet is vowel");
    }
    else
    {
      System.out.println("Alphabet is consonant");
    }
    */

    for(char ch : vowels)
    {
      if (ch==alphabet)
      {
        isvowel=true;
      }
    }
      if (isvowel==true){
        System.out.println("Alphabet is vowel");
      }else {
        System.out.println("Alphabet is consonant");
      }

  }
}
