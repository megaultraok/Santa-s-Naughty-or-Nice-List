//file i/o and overriding for the nice list

import java.util.Scanner;
import java.io.*;

public class NiceList
{   
   public static void GoodWrite() throws IOException     //file input, exception handling, static method
   {
      Scanner keyboard = new Scanner(System.in);
      String fileName;
      String name;
      String gender;
      int numReceivers;
      String giftName = " ";
      String city = " ";
      String state = " ";
      String zipCode = " ";
      String country = " ";
      
      System.out.println("How many people are on Santa's nice list?: ");
      numReceivers = keyboard.nextInt();
      
      keyboard.nextLine();
      
      System.out.print("Enter the file name: ");
      fileName = keyboard.nextLine();
      
      PrintWriter outputfile = new PrintWriter(fileName);
      
      for(int i = 1; i <= numReceivers; i++)
      {
         System.out.print("Enter the receiver #" + i + "'s city: ");
         city = keyboard.nextLine();
            
         System.out.print("Enter the receiver #" + i + "'s state: ");
         state = keyboard.nextLine();
            
         System.out.print("Enter the receiver #" + i + "'s country: ");
         country = keyboard.nextLine();
            
         System.out.print("Enter the receiver #" + i + "'s zip code: ");
         zipCode = keyboard.nextLine();
         
         DeliveryAddress goodAddress = new DeliveryAddress(city, state, country, zipCode);    //aggregation
         
         System.out.print("Enter the name of receiver #" + i + ": ");
         name = keyboard.nextLine();
         
         System.out.print("Enter the gender of receiver # " + i + ": ");
         gender = keyboard.nextLine();
         
         Requester request = new Requester(name, gender, goodAddress);      //aggregation of goodAddress, use of subclass Receiver
         
         outputfile.println(request.toString());
            
         System.out.print("Enter the name of " + name + "'s gift: ");
         giftName = keyboard.nextLine();
         
         outputfile.println(giftName);
      }
      outputfile.close();
      
      System.out.println("Data has been written to the file.");
   }
   
   public static void GoodRead() throws IOException      //file output, exception handling, static method
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
      
   public static void GoodAppend() throws IOException    //file overriding, exception handling, static method
   {
      Scanner keyboard = new Scanner(System.in);
      String fileName;
      String name;
      String gender;
      int numReceivers;
      String giftName = " ";
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
         System.out.print("Enter the receiver #" + i + "'s city: ");
         city = keyboard.nextLine();
            
         System.out.print("Enter the receiver #" + i + "'s state: ");
         state = keyboard.nextLine();
            
         System.out.print("Enter the recevier #" + i + "'s country: ");
         country = keyboard.nextLine();
            
         System.out.print("Enter the receiver #" + i + "'s zip code: ");
         zipCode = keyboard.nextLine();
         
         DeliveryAddress goodAddress = new DeliveryAddress(city, state, country, zipCode);    //aggregation
         
         System.out.print("Enter the name of receiver #" + i + ": ");
         name = keyboard.nextLine();
         
         System.out.print("Enter the gender of receiver # " + i + ": ");
         gender = keyboard.nextLine();
         
         Requester request = new Requester(name, gender, goodAddress);      //aggregation of goodAddress, use of subclass Receiver
         
         outputfile.println(request.toString());
            
         System.out.print("Enter the name of " + name + "'s gift: ");
         giftName = keyboard.nextLine();
         
         outputfile.println(giftName);
      }
      
      outputfile.close();
   }

}