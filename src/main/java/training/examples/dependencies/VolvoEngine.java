package training.examples.dependencies;

/**
 * This is a specific implementation of the Engine interface.
 */
class VolvoEngine implements Engine {


  @Override
  public void runEngine() {
    System.out.println("Running with a Volvo engine");
  }
}
