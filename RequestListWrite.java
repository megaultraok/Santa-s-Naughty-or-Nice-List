//file input for the request list
//file input

import java.util.Scanner;
import java.io.*;

public class RequestListWrite
{
   public void Write() throws IOException
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
      
      System.out.print("How many people are on the request list?: ");
      numRequesters = keyboard.nextInt();
      
      keyboard.nextLine();
      
      System.out.print("Enter the file name: ");
      fileName = keyboard.nextLine();
      
      PrintWriter outputfile = new PrintWriter(fileName);
      
      for(int i = 1; i <= numRequesters; i++)
      {
         System.out.print("Enter the name of requester #" + i + ": ");
         name = keyboard.nextLine();
         
         System.out.print("Enter the gender of requester #: " + i + ": ");
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
      
      System.out.println("Data has been written to the file.");
   }
}