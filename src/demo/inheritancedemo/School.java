package demo.inheritancedemo;

import java.util.ArrayList;

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

    System.out.println("TALK");
    t.talk();
    s1.talk();
    s2.talk();

    Person p = new Student("Sarah"); // Hmm ...
    p.talk();


    // Delopgave 3
    System.out.println("\nDELOPGAVE 3\n");

    ArrayList<Person> persons = new ArrayList<>();
    persons.add(s1);
    persons.add(t);
    persons.add(s2);

    for (int i = 0; i < persons.size(); i++) {
      System.out.println(persons.get(i).getName() + ": ");
      persons.get(i).talk();
      if (persons.get(i) instanceof Student)
        ((Student) persons.get(i)).doHomework();
      if (persons.get(i) instanceof Teacher)
        ((Teacher) persons.get(i)).giveLecture();
    }
  }
}
