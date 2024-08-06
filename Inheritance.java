//inheritance
//4 types
//1.single level inheriatance
//2. mutilevel inheritance
//3.heirarchical inheritance
//4. multiple inheritance which isn't directly in java but is implemented using interfaces
public class Solution {
  // Base class
  static class Shape {
    String color;
    // Method to display the area (generic method to be overridden in subclasses)
    public void area() {
      System.out.println("Displays area");
    }
  }
  // Single Level Inheritance
  // Triangle class inherits from Shape using EXTENDS keyword
  // `Triangle` is a subclass of `Shape`
  static class Triangle extends Shape {
    int length;
    int height;
    // Overloaded method
    public void area(int length, int height) {
      System.out.println(0.5 * length * height);
    }
  }

  // Multilevel Inheritance
  // `EquilateralTriangle` inherits from `Triangle`
  // `EquilateralTriangle` is a subclass of `Triangle`, which is itself a subclass of `Shape`
  static class EquilateralTriangle extends Triangle {
    // Overloaded method
    public void area(int length, int height) {
      System.out.println(0.5 * length * height);
    }
  }

  // Hierarchical Inheritance
  // `Circle` class inherits from `Shape`
  // `Circle` is another subclass of `Shape`
  static class Circle extends Shape {
    // Overloaded method
    public void area(int r) {
      System.out.println(3.14 * r * r);
    }
  }

  public static void main(String args[]) {
    Triangle t1 = new Triangle();
    t1.length = 10;
    t1.height = 20;
    t1.area(t1.length, t1.height);
  }
}
