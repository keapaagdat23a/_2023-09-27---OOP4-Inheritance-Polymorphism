package demo.animalsactingspecifically;

public class Dog extends Animal {
  public void beg() {
    System.out.print("Begging ...");
  }

  @Override
  public void play() {
    System.out.println("Dog playing");
  }
}
