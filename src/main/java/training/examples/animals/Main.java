package training.examples.animals;

public class Main {

  public static void main(String[] args) {
    Dog dog = new Dog("Baxter");
    greet(dog);
  }


  /**
   * Says hello to the given animal.
   *
   * @param animal the animal to greet
   */
  private static void greet(Animal animal) {
    System.out.println("Hello " + animal.getName() + "!");
  }

}
