/**
 * MagpieRunner2.java
 * A program to carry on conversations with a human user.
 * Create a Magpie2, give it user input, and print its replies.
 */
import java.util.Scanner; // class necessary to read input from the keyboard
public class MagpieRunner2
{   
   public static void main(String[] args)
   {   
      Magpie2 maggie = new Magpie2();  // creates a Magpie2 object named maggie		
      String greeting = maggie.getGreeting();  // calls the getGreeting method 
      System.out.println(greeting);


      Scanner in = new Scanner(System.in);   // creates a Scanner object
      String statement = in.nextLine().trim(); // reads and trims input
      
      // Check for bed-time phrase first, then initial greeting-like message
      if (statement.equalsIgnoreCase("It's time to go to bed now!")) {
         int x = (int)(Math.random() * 6) + 1; // Generates random number 1-6
         if (x == 6) {



            System.out.println("I refuse to go to bed. I'm not tired... " + "(Energy " + x + ")");
            System.out.println("What else do you want to talk about?");
         } else {
            System.out.println("Okay! Good night! " + "(Energy " + x + ")");
            in.close();
            return; // Exit the program
         }
      } else if (statement.toLowerCase().contains("what do you want to ask me")) {
         System.out.println("I'm ready to chat! What's on your mind?");
      }
		
      while (true)
      {   
         statement = in.nextLine();
      if (statement.equalsIgnoreCase("It's time to go to bed now!")) {
         int x = (int)(Math.random() * 6) + 1;
         if (x == 6) {
            System.out.println("I refuse to go to bed. I'm not tired... " + x + "(Energy " + x + ")");
            System.out.println("What else do you want to talk about?");
            continue;
         } else {
            System.out.println("Okay! Good night! " + "(Energy " + x + ")");
            in.close();
            break;
         }
      } else {
         System.out.println(maggie.getResponse(statement));
      }
      }
   }
}