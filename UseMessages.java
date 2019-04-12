/*
interface to let the user know what the program
is doing

interface
*/

interface Messages
{
   public void niceWriteMessage();
   public void niceReadMessage();
   public void niceAddMessage();
   public void naughtyWriteMessage();
   public void naughtyReadMessage();
   public void naughtyAddMessage();
   
}

public class UseMessages implements Messages
{
   public void niceWriteMessage()
   {  System.out.println("Writing the information to the Nice List...");}
   
   public void niceReadMessage()
   {  System.out.println("Reading the information from the Nice List...");}
   
   public void niceAddMessage()
   {  System.out.println("Adding the information to the Nice List...");}
   
   public void naughtyWriteMessage()
   {  System.out.println("Writing the information to the Naughty List...");}
   
   public void naughtyReadMessage()
   {  System.out.println("Reading the information from the Naughty List...");}
   
   public void naughtyAddMessage()
   {  System.out.print("Adding the information to the Naughty List...");}
}