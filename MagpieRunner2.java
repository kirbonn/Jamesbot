/**
 * MagpieRunner2.java
 * A program to carry on conversations with a human user.
 */
import java.util.Scanner;

public class MagpieRunner2 {

   public static final String RESET = "\u001B[0m";
   public static final String RED = "\u001B[31m";

    public static void main(String[] args) {
        Magpie2 maggie = new Magpie2();
        System.out.println(maggie.getGreeting());

        Scanner in = new Scanner(System.in);
        String statement = "";

        while (true) {
            statement = in.nextLine().trim();

            if (statement.toLowerCase().contains("bed")) {
                int x = (int) (Math.random() * 7);
                  //  int x = 6; FOR TESTING PURPOSES
                if (x == 6) {

                     System.out.println(RED + "i refuse to go to bed. i'm not tired... " + "(Energy " + x + ")" + RESET);
                    System.out.println("what else do you want to talk about?");
                    continue; 
                } else {
                    System.out.println("Okay! Good night! " + "(Energy " + x + ")");
                    break; 
                }
            } 
            else {
                System.out.println(maggie.getResponse(statement));
            }
        }
        in.close();
    }
}
