//file append to an existing request list
//method overriding of RequestListWrite()

import java.util.Scanner;
import java.io.*;

public class RequestListAdd
{  
   public void Append() throws IOException
   {
      Scanner keyboard = new Scanner(System.in);
      String fileName;
      String name;
      String gender;
      int numRequesters;
      String giftName = " ";
      int numGifts;
      String city = " ";
      String state = " ";
      String zipCode = " ";
      String country = " ";
      
      System.out.print("Enter an existing file name: ");
      fileName = keyboard.nextLine();
      
      System.out.print("How many receivers would you like to add?: ");
      numRequesters = keyboard.nextInt();
      
      FileWriter fWriter = new FileWriter(fileName, true);
      
      PrintWriter outputfile = new PrintWriter(fWriter);
      
      for(int i = 1; i <= numRequesters; i++)
      {
         System.out.print("Enter the name of the receiver: ");
         name = keyboard.nextLine();
         
         System.out.print("Enter the gender of the receiver: ");
         gender = keyboard.nextLine();
         
         for(int j = 1; j <= numRequesters; j++)
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
         
         DeliveryAddress Address = new DeliveryAddress(city, state, zipCode, country);
         Requester request = new Requester(name, gender, Address);
         
         System.out.print("How many gifts does " + name + "want?: ");
         numGifts = keyboard.nextInt();
         
            for(int k = 1; k <= numGifts; k++)
            {
               System.out.print("Enter the name of gift(s) for" + name + ": ");
               giftName = keyboard.nextLine();
            }
         
         outputfile.println(request.toString());
         outputfile.println(giftName);
      }
      
      outputfile.close();
   }
}