//class for receivers' addresses
//aggregation

public class DeliveryAddress
{
   private String city;
   private String state;
   String zipCode;
   String country;
   
   DeliveryAddress(String city, String state, String zipCode, String country)
   {
      this.city = city;
      this.state = state;
      this.zipCode = zipCode;
      this.country = country;
   }
   
   public void setCity(String city)
   {  this.city = city;}
   public void setState(String state)
   {  this.state = state;}
   public void setZipCode(String zipCode)
   {  this.zipCode = zipCode;}
   public void setCountry(String country)
   {  this.country = country;}
   
   public String getCity()
   {  return city;}
   public String getState()
   {  return state;}
   public String getZipCode()
   {  return zipCode;}
   public String getCountry()
   {  return country;}
   
   public String toString()
   {
      String str = getCity() + ", " + getState() + ", " + getCountry() + " "
                  + getZipCode();
                  
      return str;
   }
}