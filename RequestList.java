//file i/o and overriding for the request list

import java.util.Scanner;
import java.io.*;

public class RequestList
{
   public static void RequestWrite() throws IOException     //file input, exception handling, static method
   {
      Scanner keyboard = new Scanner(System.in);
      String fileName;
      String name;
      String gender;
      int numRequesters;
      String giftName = " ";
      String city = " ";
      String state = " ";
      String zipCode = " ";
      String country = " ";
      
      System.out.println("How many people are on the request list?: ");
      numRequesters = keyboard.nextInt();
      
      keyboard.nextLine();
      
      System.out.print("Enter the file name: ");
      fileName = keyboard.nextLine();
      
      PrintWriter outputfile = new PrintWriter(fileName);
      
      for(int i = 1; i <= numRequesters; i++)
      {
         System.out.print("Enter the requester #" + i + "'s city: ");
         city = keyboard.nextLine();
            
         System.out.print("Enter the requester #" + i + "'s state: ");
         state = keyboard.nextLine();
            
         System.out.print("Enter the requester #" + i + "'s country: ");
         country = keyboard.nextLine();
            
         System.out.print("Enter the requester #" + i + "'s zip code: ");
         zipCode = keyboard.nextLine();
         
         DeliveryAddress Address = new DeliveryAddress(city, state, country, zipCode);    //aggregation
         
         System.out.print("Enter the name of requester #" + i + ": ");
         name = keyboard.nextLine();
         
         System.out.print("Enter the gender of requester # " + i + ": ");
         gender = keyboard.nextLine();
         
         Requester request = new Requester(name, gender, Address);      //aggregation of Address, use of superclass Requester
         
         outputfile.println(request.toString());
            
         System.out.print("Enter the name of " + name + "'s gift: ");
         giftName = keyboard.nextLine();
         
         outputfile.println(giftName);
      }

      outputfile.close();
      
      System.out.println("Data has been written to the file.");
   }

   public static void RequestRead() throws IOException      //file output, exception handling, static method
   {
      Scanner keyboard = new Scanner(System.in);
      String fileName;
      
      System.out.print("Enter a file name: ");
      fileName = keyboard.nextLine();
      
      File SantasFile = new File(fileName);
      
      Scanner inputfile = new Scanner(SantasFile);
      
      while(inputfile.hasNext())
      {
         String line = inputfile.nextLine();
         
         System.out.println(line);
      }
      
      inputfile.close();
   }

   public static void RequestAppend() throws IOException    //file overriding, exception handling, static method
   {
      Scanner keyboard = new Scanner(System.in);
      String fileName;
      String name;
      String gender;
      int numRequesters;
      String giftName = " ";
      String city = " ";
      String state = " ";
      String zipCode = " ";
      String country = " ";
      
      System.out.print("Enter an existing file name: ");
      fileName = keyboard.nextLine();
      
      System.out.print("How many receivers would you like to add?: ");
      numRequesters = keyboard.nextInt();
      
      keyboard.nextLine();
      
      FileWriter fWriter = new FileWriter(fileName, true);
      
      PrintWriter outputfile = new PrintWriter(fWriter);
      
      for(int i = 1; i <= numRequesters; i++)
      {
         System.out.print("Enter the requester #" + i + "'s city: ");
         city = keyboard.nextLine();
            
         System.out.print("Enter the requester #" + i + "'s state: ");
         state = keyboard.nextLine();
            
         System.out.print("Enter the requester #" + i + "'s country: ");
         country = keyboard.nextLine();
            
         System.out.print("Enter the requester #" + i + "'s zip code: ");
         zipCode = keyboard.nextLine();
         
         DeliveryAddress Address = new DeliveryAddress(city, state, country, zipCode);    //aggregation
         
         System.out.print("Enter the name of requester #" + i + ": ");
         name = keyboard.nextLine();
         
         System.out.print("Enter the gender of requester # " + i + ": ");
         gender = keyboard.nextLine();
         
         Requester request = new Requester(name, gender, Address);  //aggregation of Address, use of superclass Requester
         
         outputfile.println(request.toString());
            
         System.out.print("Enter the name of " + name + "'s gift: ");
         giftName = keyboard.nextLine();
         
         outputfile.println(giftName);
      }
            
      outputfile.close();
   }
}