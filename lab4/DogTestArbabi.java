/*
 * This program tests the DogArbabi class
 */

public class DogTestArbabi {
   public static void main(String[] args) {
      
      // creating 3 different parts of the DogArbabi.java class
      DogArbabi dog0 = new DogArbabi();
      DogArbabi dog1 = new DogArbabi("Arvin", "Finn", 1, 85.7);
      DogArbabi dog2 = new DogArbabi("Jeff", "Oscar", 2, 90.4);
        
      // printing out the final values
      System.out.println("FIRST DISPLAY after instantiation...");
      dog0.Print();
      dog1.Print();
      dog2.Print();
      
      // changing values of dogs
      dog0.setDogName("Rick");
      dog0.setOwnerName("Joe");
      dog1.setOwnerName("Roham");
      dog2.setDogAge(0);
      dog2.setDogWeight(12.5);

      System.out.println("SECOND DISPLAY after mutations...");
      dog0.Print();
      dog1.Print();
      dog2.Print();

      // mutator tests
      System.out.println("\nMutator Tests...");
      if (!dog0.setDogName("A very very long dog name...")) {
         System.out.println("invalid input, the dog's name stays the same: "
         + dog0.getDogName());
      }
      
      if (dog0.setOwnerName("Jord")) {
         System.out.println("The owner name successfully changed to: "
         + dog0.getOwnerName());
      }
      // accessor tests
      System.out.println("\nAccessor Tests...");

      System.out.println(dog1.getDogName() + " is owned by "
      + dog1.getOwnerName());

   }
   
}
// ===========================[test run]===========================================
// PS C:\work\javaprogramming\lab4>  c:; cd 'c:\work\javaprogramming\lab4'; & 'C:\Users\arvin_5blwkdx\AppData\Local\Programs\Eclipse Foundation\jdk-11.0.12.7-hotspot\bin\java.exe' '-agentlib:jdwp=transport=dt_socket,server=n,suspend=y,address=localhost:55222' '-cp' 'C:\Users\arvin_5blwkdx\AppData\Roaming\Code\User\workspaceStorage\e0e93a258e3426fdfbf14ac25ec94690\redhat.java\jdt_ws\lab4_45c05265\bin' 'DogTestArbabi' 
// FIRST DISPLAY after instantiation...
// Owner name: (undefined)
// Dog name: (undefined)
// Dog age: 0
// Dog weight: 0.0

// Owner name: Arvin
// Dog name: Finn
// Dog age: 1
// Dog weight: 85.7

// Owner name: Jeff
// Dog name: Oscar
// Dog age: 2
// Dog weight: 90.4

// SECOND DISPLAY after mutations...
// Owner name: Joe
// Dog name: Rick
// Dog age: 0
// Dog weight: 0.0

// Owner name: Roham
// Dog name: Finn
// Dog age: 1
// Dog weight: 85.7

// Owner name: Jeff
// Dog name: Oscar
// Dog age: 0
// Dog weight: 12.5


// Mutator Tests...
// invalid input, the dog's name stays the same: Rick
// The owner name successfully changed to: Jord

// Accessor Tests...
// Finn is owned by Roham
