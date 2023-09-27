package demo.animalsactingspecifically;

public class Shelter {
  public static void main(String[] args) {
    new Shelter().run();
  }

  private void run() {
    Animal a = new Animal();
    // a.play();

    Dog d = new Dog();
    d.setName("Doggy");
    d.play();
    Cat c = new Cat();
    c.setName("Kitty");
    c.play();

    System.out.println("Dog: " + d.getName());
    System.out.println("Cat: " + c.getName());
  }
}
