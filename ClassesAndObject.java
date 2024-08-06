//classes,objects,methods,constructors , destructors, garbage collectors ,copy constructors
public class Solution {
  // Class name always begins with a capital letter
  // The class defines the structure and behavior of objects
  static class Pen {
    // Fields of the class to store state
    String color;
    String type;

    // Method names typically start with a lowercase letter
    public void write() {
      System.out.println("Writing something");
    }

    public void showColor() {
      System.out.println(this.color);
    }
  }

  static class Student {
    // Fields of the class to store state
    String name;
    int age;
    public void printInfo() {
      System.out.println(this.name);
      System.out.println(this.age);
    }

    // Constructor: A special method used to initialize objects
    // The constructor's name must be the same as the class name
    // In Java, if no constructor is defined, a default no-argument constructor is created automatically.
    // Copy constructor in Java needs to be explicitly defined.
    // Java does not have destructors as it has a garbage collector to manage memory.
    Student(Student s2) {
      //initialize in the construtor itself
      //this.name is the object name and name is the parameter passed to the construcotr
      this.name=name;
      this.age=age;
    }
    //you need to define a constructor
    Student(){

    }
  }

  public static void main(String args[]) {
    // Creates a new Student object and assigns it to s1
    Student s1 = new Student();
    // Calls the printInfo method on student object s1 to print name and age
    s1.name="Sarah";
    s1.age=22;
     //copying the properties of s1
    Student s2 = new Student(s1);
    s1.printInfo();
  }
}
