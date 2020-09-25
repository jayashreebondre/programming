public class Person{
  public String Firstname;
  public String Lastname;
  public int age;
  public boolean Hungry;
  private String name;


  public Person(){
    age = 35;
    name= Firstname+ " "+ Lastname;
  }
     public Person (String f, String l,int a, boolean h){
        Firstname = f;
        Lastname = l;
        age = a;
        Hungry = h ;
    // System.out.println("Hello my name is"+ Firstname +Lastname "and my age is"+age)
    }
    public static void GetPerson()
    {

    }

    private void AddPerson()
    {

    }
    public void DeletPerson()
    {

    }
}
