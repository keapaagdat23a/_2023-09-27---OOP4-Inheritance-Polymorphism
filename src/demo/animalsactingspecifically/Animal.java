package demo.animalsactingspecifically;

public abstract class Animal {
  private String name;

  public void setName(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public void play() {
    System.out.println("Animal playing.");
  }
}
