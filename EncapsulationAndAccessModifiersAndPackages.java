//packages,access modifiers and encapsulation
//when data/properties and functions/methods are enclosed within a class it's known as encapsulation using access modifiers
//data hiding is a process of protecting members of class from unintended changes whereas, abstraction is hiding the implementation details
//and showing only important and useful parts to the users
package bank;
//we create package to write code and define properly for security, readability
public class Bank {

  public static class Account{
    //if nothing is mentioned in java then its type is default which mmeans that it can be accessible in same package but not in different package
    public String name;
    //can be accessed in different packages but only in subclasses and in current package anyone can access
    protected String email;
    //private can be only accessed in it's own class
    private String passwrd;

    //getters and setters
//    this is getter
    public String getPasswrd(){
      return this.passwrd;
    }
    public void setPasswrd(String pass){
      this.passwrd=pass;
    }
  }

  public static void main(String args[]) {
      Account acount1 = new Account();
      acount1.name="Sarah";
      acount1.email="sarah@gmail.com";
      acount1.setPasswrd("pass");
    System.out.println(acount1.getPasswrd());
  }
}

