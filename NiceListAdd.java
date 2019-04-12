//file append to an existing nice list
//method overriding of NiceListWrite()

import java.util.Scanner;
import java.io.*;

public class NiceListAdd
{  
   public void GoodAppend() throws IOException
   {
      Scanner keyboard = new Scanner(System.in);
      String fileName;
      String name;
      String gender;
      int numReceivers;
      String giftName = " ";
      int numGifts;
      String city = " ";
      String state = " ";
      String zipCode = " ";
      String country = " ";
      
      System.out.print("Enter an existing file name: ");
      fileName = keyboard.nextLine();
      
      System.out.print("How many receivers would you like to add?: ");
      numReceivers = keyboard.nextInt();
      
      FileWriter fWriter = new FileWriter(fileName, true);
      
      PrintWriter outputfile = new PrintWriter(fWriter);
      
      for(int i = 1; i <= numReceivers; i++)
      {
         System.out.print("Enter the name of the receiver: ");
         name = keyboard.nextLine();
         
         System.out.print("Enter the gender of the receiver: ");
         gender = keyboard.nextLine();
         
         for(int j = 1; j <= numReceivers; j++)
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
         
         DeliveryAddress goodAddress = new DeliveryAddress(city, state, zipCode, country);
         Receiver good = new Receiver(name, gender, goodAddress);
         
         System.out.print("How many gifts does " + name + "want?: ");
         numGifts = keyboard.nextInt();
         
            for(int k = 1; k <= numGifts; k++)
            {
               System.out.print("Enter the name of gift(s) for" + name + ": ");
               giftName = keyboard.nextLine();
            }
         
         outputfile.println(good.toString());
         outputfile.println(giftName);
      }
      
      outputfile.close();
   }
}