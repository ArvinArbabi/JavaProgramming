// this project uses class overloading in order 
// to find the area of a circle, cylander, and rectangle
public class AreaDemoArbabi {
   public static void main(String[] args) {

      // Area of a circle
      System.out.println("arewa of circle: " 
      + AreaArbabi.getArea(20.0));
  
      // Area of a rectangle
      System.out.println("area of rectangle: " 
      + AreaArbabi.getArea(10, 20));
  
      // Area of cylinder
      System.out.println("area of cylander: "
      + AreaArbabi.getArea(10.0, 15.0));
  }
}
//=============================[test run]=====================================
// PS C:\work\javaprogramming\lab5>  c:; cd 'c:\work\javaprogramming\lab5'; & 'C:\Users\arvin_5blwkdx\AppData\Local\Programs\Eclipse Foundation\jdk-11.0.12.7-hotspot\bin\java.exe' '-agentlib:jdwp=transport=dt_socket,server=n,suspend=y,address=localhost:52608' '-cp' 'C:\Users\arvin_5blwkdx\AppData\Roaming\Code\User\workspaceStorage\9f2017631467cc28a37759a3c7cd52ad\redhat.java\jdt_ws\lab5_45c05266\bin' 'AreaDemoArbabi' 
// arewa of circle: 1256.6370614359173
// area of rectangle: 200.0
// area of cylander: 4712.38898038469
// PS C:\work\javaprogramming\lab5> 