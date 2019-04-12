//file append to an existing naughty list
//method overriding of NaughtyListWrite()

import java.util.Scanner;
import java.io.*;

public class NaughtyListAdd
{  
   public void BadAppend() throws IOException
   {
      Scanner keyboard = new Scanner(System.in);
      String fileName;
      String name;
      String gender;
      int numRejected;
      String city = " ";
      String state = " ";
      String zipCode = " ";
      String country = " ";
      
      System.out.print("Enter an existing file name: ");
      fileName = keyboard.nextLine();
      
      System.out.print("How many naughty people would you like to add?: ");
      numRejected = keyboard.nextInt();
      
      FileWriter fWriter = new FileWriter(fileName, true);
      
      PrintWriter outputfile = new PrintWriter(fWriter);
      
      for(int i = 1; i <= numRejected; i++)
      {
         System.out.print("Enter the name of the naughty person: ");
         name = keyboard.nextLine();
         
         System.out.print("Enter the gender of the naughty person: ");
         gender = keyboard.nextLine();
         
         for(int j = 1; j <= numRejected; j++)
         {
            System.out.print("Enter " + name + "'s city: ");
            city = keyboard.nextLine();
            
            System.out.print("Enter " + name + "'s state: ");
            state = keyboard.nextLine();
            
            System.out.print("Enter " + name + "'s county: ");
            country = keyboard.nextLine();
            
            System.out.print("Enter " + name + "'s zip code: ");
            zipCode = keyboard.nextLine();
         }
         
         DeliveryAddress badAddress = new DeliveryAddress(city, state, zipCode, country);
         Receiver bad = new Receiver(name, gender, badAddress);
         
         outputfile.println(bad.toString());
      }
      outputfile.close();
   }
}