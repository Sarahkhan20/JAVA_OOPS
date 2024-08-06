//abstraction and constructor chaining
public class Solution {
  static abstract class Animal {
    abstract public void walk();
    //contructor
    Animal(){
      System.out.println("You are creating a new animal");
    }
    public void eat(){
      System.out.println("Animal eats..");
    }
  }
  static class Horse extends Animal {
    //constructor chaining
    Horse(){
      System.out.println("Horse animal created...");
    }
    public void walk() {
      System.out.println("Walks on 4 legs");
    }
  }
  static class Chicken extends Animal {
    public void walk() {
      System.out.println("Walks on 2 legs");
    }
  }

  public static void main(String[] args) {
    Horse horse = new Horse();
    horse.walk();

    Chicken chicken = new Chicken();
    chicken.walk();

    horse.eat();
//can't instantiate
//java: Solution.Animal is abstract; cannot be instantiated
//    Animal animal = new Animal() ;
//    animal.walk();

  }
}
