//class that holds the requesters' information
//superclass, polymorphism

public class Requester
{
   protected String name;
   protected String gender;
   protected DeliveryAddress home;
   
   public Requester(String name, String gender, DeliveryAddress home)
   {
      this.name = name;
      this. gender = gender;
      this.home = home;
   }
   
   public void setName(String name)
   {  this.name = name;}
   
   public void setGender(String gender)
   {  this.gender = gender;}
   
   public String getName()
   {  return name;}
   
   public String getGender()
   {  return gender;}
   
   public String toString()
   {
      return name + " | " + gender + " | " + home.toString();
   }
}