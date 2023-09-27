package demo.animalsactingspecifically;

public class Cat extends Animal {
  public void scratch() {
    System.out.println("Scratching ...");
  }

  @Override
  public void play() {
    System.out.println("Cat playing");
  }
}
