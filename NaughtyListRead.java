//file output for the naughty list
//file output

import java.util.Scanner;
import java.io.*;

public class NaughtyListRead
{
   public void BadRead() throws IOException
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
}