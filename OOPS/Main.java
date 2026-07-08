
public class Main {
    static int x = 5;
     static void myStaticMethod() {
    System.out.println("Static methods can be called without creating objects");
  }
    public static void main(String[] args){
      myStaticMethod(); 
      System.out.println(x);
    Main myObj = new Main();
    System.out.println(myObj.x);
    System.out.println(Main.x);
    Main.myStaticMethod();
     
    }
}