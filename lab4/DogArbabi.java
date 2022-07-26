/**
 * and abstract class that is a representation of a dog object
 */
public class DogArbabi {

   // constants 
   private final static int MIN_LEN = 1;
   private final static int MAX_LEN = 20;
   private final static String DEFAULT_STRING = "(undefined)";
   private final static double DEFAULT_WEIGHT = 0.0;
   private final static int DEFAULT_AGE = 0;
   private final static double MAX_WEIGHT = 200.0;
   private final static int MAX_AGE = 20;
   
   // class member variables 
   private String ownerName;
   private String dogName;
   private int dogAge;
   private double dogWeight;

   /**
    * Default constructor
    */
   public DogArbabi() {
      ownerName = DEFAULT_STRING;
      dogName = DEFAULT_STRING;
      dogAge = DEFAULT_AGE;
      dogWeight = DEFAULT_WEIGHT;
   }

   /**
    * parameterized constructor
    * @param ownerName the name of the owner
    * @param dogName the name of the dog
    * @param dogAge the age of the dog
    * @param dogWeight the weight of the dog
    */
   public DogArbabi(String ownerName, String dogName,
      int dogAge, double dogWeight) {
      setOwnerName(ownerName);
      setDogName(dogName);
      setDogAge(dogAge);
      setDogWeight(dogWeight);
   }
   
   /**
    * Owner name accessor
    * @return owner name
    */
   public String getOwnerName() {
      return ownerName;
   }

   /**
    * owner name mutator 
    * @param ownerName name of the owner
    * @return true of the name is valid otherwise false
    */
   public boolean setOwnerName(String ownerName) {
      if(validString(ownerName)) {
         this.ownerName = ownerName;
         return true;
      }
      return false;
   }
   /**
    * dog name accessor
    * @return dog name
    */
   public String getDogName() {
      return dogName;
   }
   /**
    * dog name mutator
    * @param dogName name of the dog
    * @return true if the name is valid otherwise false
    */
   public boolean setDogName(String dogName){
      if (validString(dogName)) {
         this.dogName = dogName;
         return true;
      } 
      return false;
   }

   /**
    * dog age accessor
    * @return dog age
    */
   public int getDogAge() {
      return dogAge;
   }

   /**
    * dog age mutator
    * @param dogAge age of the dog
    * @return true if the age is valid otherwise false
    */
   public boolean setDogAge(int dogAge){
      if (dogAge > MAX_AGE || dogAge < 0) {
         return false;
      } 
      this.dogAge = dogAge;
      return true;
   }

   /**
    * dog weight accessor
    * @return dog weight
    */
   public double getDogWeight() {
      return dogWeight;
   }

   /**
    * dog weight mutator
    * @param dogWeight weight of dog
    * @return true if weight is valid otherwise false
    */
   public boolean setDogWeight(double dogWeight) {
      if (dogWeight > MAX_WEIGHT || dogWeight < 0) {
         return false;
      } 
      this.dogWeight = dogWeight;
      return true;
   }

   /**
    * Printing the content of the dog object
    */
   public void Print() {
      System.out.printf("Owner name: " + getOwnerName() + "\n");
      System.out.printf("Dog name: " + getDogName() + "\n");
      System.out.printf("Dog age: " + getDogAge() + "\n");
      System.out.printf("Dog weight: " + getDogWeight() + "\n\n");
   } 

   /**
    * checking if string value is valid
    * @param value string entered
    * @return false if string is invalid, true if it is
    */
   private boolean validString(String value) {
      if (value.length() > MAX_LEN || value.length() < MIN_LEN) {
         return false;
      }
      return true;
   }
}
