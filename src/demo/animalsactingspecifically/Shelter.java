package demo.animalsactingspecifically;

public class Shelter {
  public static void main(String[] args) {
    new Shelter().run();
  }

  private void run() {
    Dog d = new Dog();
    d.setName("Doggy");
    Cat c = new Cat();
    c.setName("Kitty");

    System.out.println("Dog: " + d.getName());
    System.out.println("Cat: " + c.getName());
  }
}
