//class that holds naughty person's information
//subclass, polymorphism

public class Rejected extends Requester
{
   public Rejected(String name, String gender, DeliveryAddress home)
   {  super(name, gender, home);}
   
   public String toString()
   {
      String str = name + " | " + gender + " | " + home.toString();
                  
      return str;
   }
}