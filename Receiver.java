//class that holds receiver's information
//subclass, polymorphism

public class Receiver extends Requester
{
   public Receiver(String name, String gender, DeliveryAddress home)
   {  super(name, gender, home);}
   
   public String toString()
   {
      String str = name + " | " + gender + " | " + home.toString();
                  
      return str;
   }
}