/* Arvin Arbabi
 * CIS 257
 * This code takes the amount of points you have 
 * from purchasing pretzels and offers a discount
 * depending on how many you have purchased
 */

import java.util.Scanner;
   
public class RewardArbabi {
   public static void main(String[] args) {
     // declaring final int for the number of stamps
     final int STAMP_DISCOUNT = 5;

     // initializing variables
     int stampTotal = 0;

     Scanner sc = new Scanner(System.in);

     do {
       // printing out menu
       System.out.println("Menu: ");
       System.out.println("P (process Purchase)");
       System.out.println("S (Shut down)");
       String input = sc.next();

       if (input == null || input.length() == 0) {
         System.out.println("*** Use P or S, please. ***");
         continue;
       }

       // taking first letter of input and making it lowercase
       char firstLetter = input.toLowerCase().charAt(0);

       // if the first letter is s, the loop breaks
       if (firstLetter == 's') {
         break;
       }

       // if the first letter is anything other than p or s, code repeats the prompt
       else if (firstLetter != 'p') {
         System.out.println("*** Use P or S, please. ***");
         continue;
       }

       // if the stamp total is greater than the discount, it prompts you if you want
       // to buy a free pretzel
       if (stampTotal >= STAMP_DISCOUNT) {
         System.out.println("You qualify for a free pretzel."
              + " Would you like to use your credits? (Y or N)");
         String response = sc.next();

         if (response.toLowerCase().equals("y")) {
            stampTotal -= STAMP_DISCOUNT;
            System.out.println("You have just used " + STAMP_DISCOUNT
                + " credits and have " + stampTotal + " left.");
            continue;
         } else if (!response.toLowerCase().equals("n")) {
            System.out.println("*** Invalid response ***");
            continue;
         }

       }

       // asks user how many pretzels they would like to buy,
       // then takes the input and adds it to the stamp total
       System.out.println("How many pretzels "
            + "would you like to buy?");

       int pretzel = sc.nextInt();
       stampTotal += pretzel;

       System.out.println("You just earned " + pretzel
            + " stamps and have a total of " + stampTotal + " to use.");
            
     } while (true);
     // conditions for the do-while loop

     // closing scanner
     sc.close();
   }
}
// =====================================[sample run]=======================
// [this is the third runthrough of the code.]
// Menu:
// P (process Purchase)
// S (Shut down)
// h
// *** Use P or S, please. ***
// Menu:
// P (process Purchase)
// S (Shut down)
// p
// You qualify for a free pretzel. Would you like to use your credits? (Y or N)
// y
// You have just used 5 credits and have 6 left.
// Menu:
// P (process Purchase)
// S (Shut down)
// p
// You qualify for a free pretzel. Would you like to use your credits? (Y or N)
// n
// How many pretzels would you like to buy?
// 12
// You just earned 12 stamps and have a total of 18 to use.
// Menu:
// P (process Purchase)
// S (Shut down)
// Singapore
// PS C:\work\javaprogramming\lab3>