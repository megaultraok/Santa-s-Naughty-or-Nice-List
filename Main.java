//Main application

import java.util.Scanner;
import java.io.*;

public class Main
{
   public static void main(String[] args)    //static method
   {
      Scanner keyboard = new Scanner(System.in);
      String choice;
      
      System.out.print("Welcome to Santa Claus's Lists!"
                        + "\nHere is what you can do:"
                        + "\nType: write (nice, naughty) list, read (nice, naughty) list,"
                        + " or add to (nice, naughty) list");
      System.out.print("\nWhat would you like to do?: ");
      choice = keyboard.nextLine();

      UseMessages message = new UseMessages();

      switch(choice)
      {
         case "write nice list":
               message.niceWriteMessage();      //use of interface
               try                              //exception handling
               {  NiceList.GoodWrite();}     //file input for nice list
               catch(IOException e)          //exception handling
               { System.out.print(e.getMessage());}
               break;
         case "read nice list":
               message.niceReadMessage();    //use of interface
               try                           //exception handling
               {  NiceList.GoodRead();}      //file output for nice list
               catch(IOException e)          //exception handling
               {  System.out.print(e.getMessage());}
               break;
         case "add to nice list":
               message.niceAddMessage();     //use of interface
               try                           //exception handling
               {  NiceList.GoodAppend();}    //file overriding for nice list
               catch(IOException e)          //exception handling
               {  System.out.print(e.getMessage());}
               break;
         case "write naughty list":
               message.naughtyWriteMessage();      //use of interface
               try                                 //exception handling
               {  NaughtyList.BadWrite();}      //file input for naughty list
               catch(IOException e)             //exception handling
               {  System.out.print(e.getMessage());}
               break;
         case "read naughty list":
               message.naughtyReadMessage();    //use of interface
               try                              //exception handling
               {  NaughtyList.BadRead();}    //file output for naughty list
               catch(IOException e)          //exception handling
               {  System.out.print(e.getMessage());}
               break;
         case "add to naughty list":
               message.naughtyAddMessage();     //use of interface
               try                              //exception handling
               {  NaughtyList.BadAppend();}     //file overriding for naughty list
               catch(IOException e)             //exception handling
               {  System.out.print(e.getMessage());}
               break;
      }
   }
}

