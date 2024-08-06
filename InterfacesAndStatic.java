//Interfaces in java
public class Solution {
//interfaces have pure abstraction
  interface Animal{
    //public,static and fixed by default
    int eye=2;
   void walk();//public and abstract by default
  }
  interface Herbivore{

  }
  //in interfaces we use IMPLEMENTS keyword
  //multiple inheritance which is imlemented by only interafces in java
  static class Horse implements Animal,Herbivore{
    //static means same all over, static variable are publically accessible
    //we make thing static when we want it to remain same  overall
    //static stuffs are allocated memory just once
    static String grass;
    static String school;
     String name;
    public void walk() {
      System.out.println("walks on 4 legs");
    }
    //even functions can be declared static
    public static void changeHorse(){
        school="newschool";
    }
  }

  public static void main(String[] args) {
//static variables can be directly called
    Horse.grass="green";
//    Horse.name isn't valid
    //this is how by creating object we need to call non-static variables
    Horse horse=new Horse();
    horse.name="badal";
    System.out.println(Horse.grass);
  }
}
