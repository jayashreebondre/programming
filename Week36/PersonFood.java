public class PersonFood {
  public static void main ( String []args){

    Person pp = new Person();

    Person p1 = new Person("Shourya","Bondre",10, true);


    Person p2 =new Person("Shlok","Bondre", 5,false);
    Person p3 = new Person("Devansh", "Jamdade",3,true);
    HotDogStand H = new HotDogStand();
    H.sausagesLeft = 2;

    p1.Firstname = "Shourya";
    p1.Lastname = "Bondre";
    p1.age = 10;
    p1.Hungry =true;

    p2.Firstname = "Sholk";
    p2.Lastname = "Bondre";
    p2.age = 5;
    p2.Hungry =false;

    p3.Firstname = "Devansh";
    p3.Lastname = "Jamdade";
    p3.age = 3;
    p3.Hungry =true;

   H.HotDogStand(p1);
   H.HotDogStand(p2);
   H.HotDogStand(p3);


  }

}
