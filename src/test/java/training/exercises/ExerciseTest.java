package training.exercises;

import static org.junit.Assert.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.After;
import org.junit.Before;

import training.exercises.exercise1.TestExercise1;

/**
 * ===================================
 * Trainees: do not change this class.
 * ===================================
 * <p>
 * Parent class for the exercise tests to allow us to check what was printed to System.out.
 * <p>
 * Do not run this class directly. Look at one of the subclasses
 * e.g. {@link TestExercise1}.
 */
public class ExerciseTest {

  private final ByteArrayOutputStream output = new ByteArrayOutputStream();
  private final PrintStream systemOut = System.out;


  @Before
  public void setUp() {
    System.setOut(new PrintStream(output));
  }


  @After
  public void tearDown() {
    System.setOut(systemOut);
    System.out.print(output);
  }


  protected void checkPrintedOutput(String expectedOutput) {
    assertEquals("Output was not correct", expectedOutput, output.toString());
  }

}
