import java.util.*;
 

public class Battleship {
   //fin
   final private static int ARRAY_SIZE = 50;
   final private static int NUM_SHIPS = 3;
   final  private static int MAX_MISSES = 10;

   private static int shipLocation[] = new int[ARRAY_SIZE];

   private static int numberOfMisses = 0;
   private static int shipsRemaining = NUM_SHIPS;


   // method that starts the game and places the ships
   private static void startGame(){

      Arrays.fill(shipLocation, 0);

      shipsRemaining = NUM_SHIPS;
      numberOfMisses = 0;

      Random rand = new Random();

      for(int i = 0; i < NUM_SHIPS; i++){

         int shipSize = rand.nextInt(3)+3;
         int start = rand.nextInt(ARRAY_SIZE - shipSize);

         for (int j = start; j < start + shipSize; j++){
            shipLocation[j] = 1;
         }
      }
   }

   //method that determines whether you hit the battleship or not
   private static boolean checkGuess(int guess) {
      if (shipLocation[guess] == 1){
         shipLocation[guess] = -1; //ship is removed
         
         return true;
      }

      return false;
   }
   
   

   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      startGame();
      for (int x = 0; x < ARRAY_SIZE; x++){
         System.out.print(shipLocation[x] + " ");
      }

      while(shipsRemaining > 0 && numberOfMisses < MAX_MISSES) { 
         System.out.println("enter a guess from 0 - " + (ARRAY_SIZE - 1));
         int userGuess = sc.nextInt();

         if (userGuess >= ARRAY_SIZE){
            System.out.println("please enter a number between 0 and " + ARRAY_SIZE);
            continue;
         }
         

         boolean isHit = checkGuess(userGuess);

         if(isHit == true){
            System.out.println("Hit!");

            if (shipsRemaining == 0){
               System.out.println("you sunk all my ships!");
            }
         }

         else{ 
            System.out.println("Miss!");
            System.out.println("you have " + (MAX_MISSES - (numberOfMisses + 1)) + " lives remaining!");
            numberOfMisses++;

            if (numberOfMisses == MAX_MISSES) {
               System.out.println("Game over!");
            }
         }
           
   }   

   sc.close();
   }
}
