//file input for the naughty list
//file input

import java.util.Scanner;
import java.io.*;

public class NaughtyListWrite
{
   public void BadWrite() throws IOException
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
      
      System.out.print("How many people are on Santa's naughty list?: ");
      numRejected = keyboard.nextInt();
      
      keyboard.nextLine();
      
      System.out.print("Enter the file name: ");
      fileName = keyboard.nextLine();
      
      FileWriter fWriter = new FileWriter(fileName, true);
      
      PrintWriter outputfile = new PrintWriter(fWriter);
      
      for(int i = 1; i <= numRejected; i++)
      {
         System.out.print("Enter the name of naughty person #" + i + ": ");
         name = keyboard.nextLine();
         
         System.out.print("Enter the name of naughty person #" + i + ": ");
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
         Rejected bad = new Rejected(name, gender, badAddress);
         
         outputfile.println(bad.toString());
      }
      
      outputfile.close();
      
      System.out.println("Data has been written to the file.");
   }
}