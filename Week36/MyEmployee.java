
public class MyEmployee {
  public static void main (String [] args){
    Employee e1 = new Employee ();
    Employee e2 = new Employee ();
    e1.name = "Jayashree";
    e1.age =32;
    e2.name = "Santosh";
    e2.age = 45;
    e1.address = "Akkas gata";
   System.out.println(e1.name);
   System.out.println(e2.age);

   e1.sayHello();
   e2.sayHello();
  }

}
