package demo.inheritancedemo;

public abstract class Person {
  private String name;

  public String getName() {
    return name;
  }

  Person(String name) {
    this.name = name;
  }

  public void talk() {
    System.out.println("Person talking ...");
  }
}
