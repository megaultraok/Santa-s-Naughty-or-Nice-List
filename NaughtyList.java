//file i/o and overriding for the naughty list

import java.util.Scanner;
import java.io.*;

public class NaughtyList
{
   public static void BadWrite() throws IOException      //file input, exception handling, static method
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
         System.out.print("Enter the naughty person #" + i + "'s city: ");
         city = keyboard.nextLine();
            
         System.out.print("Enter the naughty person #" + i + "'s state: ");
         state = keyboard.nextLine();
            
         System.out.print("Enter the naughty person #" + i + "'s country: ");
         country = keyboard.nextLine();
            
         System.out.print("Enter the naughty person #" + i + "'s zip code: ");
         zipCode = keyboard.nextLine();
         
         DeliveryAddress badAddress = new DeliveryAddress(city, state, country, zipCode);    //aggregation
         
         System.out.print("Enter the name of the naughty person: ");
         name = keyboard.nextLine();
         
         System.out.print("Enter the gender of the naughty person: ");
         gender = keyboard.nextLine();
         
         Rejected bad = new Rejected(name, gender, badAddress);  //aggregation of badAddress, use of subclass Rejected
         
         outputfile.println(bad.toString());
      }
      
      outputfile.close();
      
      System.out.println("Data has been written to the file.");
   }
   
   public static void BadRead() throws IOException    //file output, exception handling, static method
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
   
   public static void BadAppend() throws IOException     //file overriding, exception handling, static method
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
      
      keyboard.nextLine();
      
      FileWriter fWriter = new FileWriter(fileName, true);
      
      PrintWriter outputfile = new PrintWriter(fWriter);
      
      for(int i = 1; i <= numRejected; i++)
      {
         System.out.print("Enter the naughty person #" + i + "'s city: ");
         city = keyboard.nextLine();
            
         System.out.print("Enter the naughty person #" + i + "'s state: ");
         state = keyboard.nextLine();
            
         System.out.print("Enter the naughty person #" + i + "'s country: ");
         country = keyboard.nextLine();
            
         System.out.print("Enter the naughty person #" + i + "'s zip code: ");
         zipCode = keyboard.nextLine();
         
         DeliveryAddress badAddress = new DeliveryAddress(city, state, country, zipCode);    //aggregation
         
         System.out.print("Enter the name of the naughty person: ");
         name = keyboard.nextLine();
         
         System.out.print("Enter the gender of the naughty person: ");
         gender = keyboard.nextLine();
         
         Rejected bad = new Rejected(name, gender, badAddress);      //aggregation of badAddress, use of subclass Rejected
         
         outputfile.println(bad.toString());
      }
      outputfile.close();
      
      System.out.println("New data has been written to the file.");
   }
}