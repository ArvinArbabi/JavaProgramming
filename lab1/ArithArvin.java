public class ArithArvin
{
   public static void main(String[] args)
   {
    // printing my name and ID
    System.out.println("My family name is: Arbabi");
    System.out.println("My student ID is G01296217");
    
    // storing values into float values
    float float_myId = 28; 
    float float_nLet = 6;
    
    // converting the floats to Ints
    int myId = Math.round(float_myId);
    int nLet = Math.round(float_nLet);
    
    // storing the expressions into their respective variables
    int Expression1 = (myId + nLet);
    int Expression2 = (myId - nLet );
    float Expression3 = (float_myId / 2); 
    int Expression4 = (myId % 2);
    int Expression5 = (nLet + nLet * 2);
    float Expression6 = (float_myId / (float_nLet + 1000));

    //printing out expressions
    System.out.println("1: " + Expression1);
    System.out.println("2: " + Expression2);
    System.out.printf("3: " + "%.1f", Expression3);
    System.out.println("");
    System.out.println("4: " + Expression4);
    System.out.println("5: " + Expression5);
    System.out.printf("6: " + "%.5f", Expression6);

 

   }
}