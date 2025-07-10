package training.examples.animals;

/**
 * Man's best friend.
 */
public class Dog implements Animal {

  /**
   * The name of this dog.
   */
  String name;


  /**
   * Creates a new {@link Dog} instance with the given name.
   *
   * @param name the name of the dog
   */
  Dog(String name) {
    this.name = name;
  }


  /**
   * @return the name of this dog
   */
  public String getName() {
    return name;
  }

}
