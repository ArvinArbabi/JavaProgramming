public class AreaArbabi {
   /**
    * finds area of circle
    * @param radius radius of circle
    * @return returns the area of the circle
    */
   public static double getArea(double radius) {
      return Math.PI * radius * radius;
   }

   /**
    * overloads circle class, finds area of rectangle
    * @param length length of rectangle
    * @param width width of rectangle
    * @return returns the area of rectangle
    */
   public static double getArea(int length, int width) {
      return length * width;
   }

   /**
    * overloads rectangle class, finds area of cylander
    * @param radius radius of cylander
    * @param height height of cylander
    * @return returns the area of cylander
    */
   public static double getArea(double radius, double height) {
      return Math.PI * radius * radius * height;
  }
}
