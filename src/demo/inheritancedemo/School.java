package demo.inheritancedemo;

public class School {
  public static void main(String[] args) {
    new School().run();
  }

  private void run() {
    // Person p = new Person(); - It's abstract!
    Teacher t = new Teacher("Pat");
    Student s1 = new Student("Brianna");
    Student s2 = new Student("Anna");
    // Person p = new Person("The Person");

    System.out.println(t.getName());
    System.out.println(s1.getName());
    System.out.println(s2.getName());

    t.giveLecture();
    s1.doHomework();
    s2.doHomework();
  }
}
