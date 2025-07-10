package training.examples.dependencies;

import static java.lang.String.format;

import org.junit.Assert;
import org.junit.Test;

import training.exercises.ExerciseTest;

/**
 * ===============================
 * Dependencies
 * ===============================
 * <p>
 * These exercises will get you writing some more code from scratch,
 * and using and getting comfortable with different classes and types depending on each other.
 * <p>
 * The tests will not all pass at the same time, as you will be swapping out dependencies at various points in the test.
 * Just run them one by one!
 */
public class TestDependencies extends ExerciseTest {

  /**
   * Have a look at all of the types within the dependencies package.
   * There are two types to be completed in later tests, however there is an existing class {@link Car},
   * an interface {@link Engine}, and an existing implementation of that interface {@link VolvoEngine}.
   * See if you can understand the dependencies between them, and how they all tie together.
   * <p>
   * Then, have a look at the {@link DependenciesApp}, which will be what we run in the tests.
   * You'll see that a Car has been created, but something is missing.
   * See if you can get this test passing, you'll only need to write code in the {@link DependenciesApp} for this test.
   */
  @Test
  public void testRunningCarWithVolvoEngine() {
    DependenciesApp app = new DependenciesApp();
    app.run();
    checkPrintedOutput(format("Running with a Volvo engine%n"));
  }

  /**
   * Now it's time to write your own engine!
   *  N.B. Due to the way the test assertions work, this test will throw some odd errors to begin with that won't make much sense to you right now,
   *  Just follow all the steps below first, and then run the test to see how you've done.
   * <p>
   * 1. Create your own engine in the MyEngine file. Have it print "Running with a custom engine" when it runs
   * 2. Write the FuelType enum, including at least a PETROL and an ELECTRICITY value
   * 3. Have your new engine depend on a FuelType
   * 4. Print another line in the runEngine method, which prints "Running with a fuel type of" + the fuel type
   * 5. Use your custom engine in the {@link DependenciesApp}
   */
  @Test
  public void testEnhancingCustomEngineToIncludeFuelType() throws ClassNotFoundException {
    DependenciesApp app = new DependenciesApp();
    app.run();
    // Don't worry about the syntax of these assertions too much, it's a bit of a hacky way to confirm you're probably doing the right thing.
    Assert.assertEquals("The Engine Class should have its dependency in the constructor", 1, Class.forName("training.examples.dependencies.MyEngine").getDeclaredConstructors()[0].getParameterTypes().length);
    Assert.assertEquals("The constructor dependency should be the FuelType", "training.examples.dependencies.FuelType", Class.forName("training.examples.dependencies.MyEngine").getDeclaredConstructors()[0].getParameterTypes()[0].getName());
    checkPrintedOutput(format("Running with a custom engine%nRunning with a fuel type of PETROL%n"));
  }

  /**
   * Now let's switch out a dependency:
   * Modify just the DependenciesApp to now have your new custom engine run with ELECTRICITY
   * Nothing should change in either of the FuelType or Car classes to get this test passing after the previous one!
   */
  @Test
  public void testEnhancingCustomEngineToIncludeADifferentFuelType() throws ClassNotFoundException {
    DependenciesApp app = new DependenciesApp();
    app.run();
    Assert.assertEquals("The Engine Class should have its dependency in the constructor", 1, Class.forName("training.examples.dependencies.MyEngine").getDeclaredConstructors()[0].getParameterTypes().length);
    Assert.assertEquals("The constructor dependency should be the FuelType", "training.examples.dependencies.FuelType", Class.forName("training.examples.dependencies.MyEngine").getDeclaredConstructors()[0].getParameterTypes()[0].getName());
    checkPrintedOutput(format("Running with a custom engine%nRunning with a fuel type of ELECTRICITY%n"));
  }

  /**
   * Let's enhance the Car now.
   * Add a new dependency to the Car, this can be a new class, or anything you want.
   * And use it in whatever way you can think of! Print something out to the terminal to confirm you're using it in the way you expect.
   */
  @Test
  public void testEnhancingCarWithCustomNewDependency() throws ClassNotFoundException {
    Assert.assertEquals("The Car should now have 2 dependencies in its constructor", 2, Class.forName("training.examples.dependencies.Car").getDeclaredConstructors()[0].getParameterTypes().length);
  }

  /*
  BONUS CONTENT - That's it for the tests! But have a further play around with the types here, and make your own new ones.
  Tie everything together, and see how things build up in the DependenciesApp. Make sure you understand the graph of the dependencies you're building up.

  Once you're happy, speak to the trainer, as you can move onto Codewars exercises if you're happy with everything covered thus far.
   */
}
