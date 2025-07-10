package training.examples.dependencies;


/**
 * A class representing a car
 */
class Car {

  private final Engine engine;

  /**
   * The car constructor
   * @param engine - the engine which the car will use
   */
  public Car(Engine engine){
    this.engine = engine;
  }


  public void runCar(){
    engine.runEngine();
  }
}
