package demo.inheritancedemo;

public class Teacher extends Person {
  private int officeNumber;

  public Teacher(String name) {
    super(name);
  }

  public void giveLecture() {
    System.out.println("Giving lecture.");
  }
}
