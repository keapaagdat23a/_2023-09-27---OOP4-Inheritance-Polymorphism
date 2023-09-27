package demo.inheritancedemo;

public class Student extends Person {
  private int studentNumber;

  public Student(String name) {
    super(name);
  }

  public void doHomework() {
    System.out.println("Doing homework.");
  }

  @Override
  public void talk() {
    System.out.println("Student talking ...");
  }
}
