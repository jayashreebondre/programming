public class HotDogStand {
  public int sausagesLeft;

public HotDogStand()
{
  sausagesLeft = 2;
}


  public void HotDogStand(Person pr){
    if(sausagesLeft>0 && pr.Hungry==true){
      sausagesLeft = sausagesLeft-1;
      pr.Hungry =false;
      System.out.println("A sausage was served.");
    }
    else if(sausagesLeft<=0)
    {
      System.out.println( "No sausage was left" + pr.Firstname);
    }
  }
}
