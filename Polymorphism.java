//compile time polymorphism , function overloading
//two functions with same name but different parameters
//same name functions in same class either return type different or parameters different or number of parameters different
//that;s why its compile time parametes that it identifies the problem during compile time whichh is acceptable than runtime
public class Solution {
  static class Student {
    String name;
    int age;
    //same name printInfo objects but different paramenters gives advantage that we can call printInfo method and do multiple jobs ,
    //don't need to remember multiple methods names
    public void printInfo(int age) {
      System.out.println(this.age);
    }
    public void printInfo(String name) {
      System.out.println(this.name);
    }
    public void printInfo(String name, int age) {
      System.out.println(this.name);
      System.out.println(this.age);
    }
  }

  public static void main(String args[]) {
    Student s1 = new Student();
    s1.name="Sarah";
    s1.age=22;
    //calling method overloaded method
    s1.printInfo(s1.name,s1.age);
  }
}
