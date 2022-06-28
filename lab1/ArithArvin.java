/*
 * Arvin Arbabi
 * Project 1
 * 06/27/2022
 * this code takes the amount of letters in my last name and the 
 * added amount of my school ID and undergoes several arithmatic
 * opperations
 */
public class ArithArvin {
   public static void main(String[] args) {
      int myId = 28;
      int nLet = "Arbabi".toCharArray().length;
      // printing my name and ID
      System.out.println("My family name is: Arbabi");
      System.out.println("My student ID is G01296217");
      System.out.println("myId is: " + myId);
      System.out.println("nLet is: " + nLet);

      // storing the expressions into their variables and printing them
      int Expression1 = (myId + nLet);
      System.out.println("exp1: " + Expression1);

      int Expression2 = (myId - nLet);
      System.out.println("exp2: " + Expression2);

      float Expression3 = (float)myId / 2.0f;
      System.out.printf("exp3: " + "%.1f\n", Expression3);
      
      int Expression4 = (myId % 2);
      System.out.println("exp4: " + Expression4);
      
      int Expression5 = (nLet + nLet * 2);
      System.out.println("exp5: " + Expression5);

      float Expression6 = ((float)myId / ((float)nLet + 1000));
      System.out.printf("exp6: " + "%.5f", Expression6);
   }
}