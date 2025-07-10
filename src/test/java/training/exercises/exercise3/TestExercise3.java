package training.exercises.exercise3;

import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import org.junit.Test;
import training.exercises.ExerciseTest;

import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import static java.lang.String.format;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * ===========================
 *  Exercise 3 - Collections
 * ===========================
 * <p>
 * Time to have a go at using the different types of Collection that we have seen:
 *  - Lists
 *  - Sets
 *  - Maps
 * <p>
 * Hopefully you're getting the hang of how to run these exercises now!
 */
public class TestExercise3 extends ExerciseTest {

  /**
   * For this first test, you will need to create a list with 4 elements in it. It doesn't matter
   * what type the elements are or what they are - we just need to have 4 of them.
   * <p>
   * There are a few different ways of creating a list. You can use a constructor directly and then
   * add some elements like this:
   * <pre>
   *   // the line below should display correctly if you view it as JavaDoc
   *   List&lt;String&gt; myList = new ArrayList&lt;&gt;();
   *   myList.add("Item One");
   *   myList.add("Item Two");
   *   etc...
   * </pre>
   *
   * Or you can use a utility class like so:
   * <pre>
   *   List&lt;String&gt; myList = Lists.newArrayList("Item One", "Item Two", etc...);
   * </pre>
   *
   * Have a go at changing the {@link ListHelper#createFourElementList()} method to pass this test.
   * <p>
   * Bonus: try changing your method to use a few different element types. Try returning a list of
   * Strings, a list of Integers, or a list of Doubles. Why do you think you can't use primitive
   * types in a list?
   */
  @Test
  public void testCreateList() {
    assertEquals("List should have 4 elements", 4, new ListHelper().createFourElementList().size());
  }


  /**
   * Each item in a list is given an 'index' denoting its position in the list. The indices start
   * at 0, so the third element in the list has index 2.
   * <p>
   * You can use the {@link List#get(int)} method to get a specific element from a list.
   * <p>
   * Let's implement the {@link ListHelper#getFifthElement(List)} method to return the fifth
   * element of the list of Strings it is given.
   * <p>
   * Bonus: what happens if you try to get the fifth element from a list without 5 items?
   */
  @Test
  public void testGetListElement() {
    // Create a list with at least 5 elements
    List<String> list = Lists.newArrayList("Hello", "world", "here", "is", "my", "list");

    // Expect to get back "my" since it is the fifth element
    assertEquals("Should return the fifth element", "my", new ListHelper().getFifthElement(list));
  }


  /**
   * You can also add elements into an existing list.
   * <p>
   * To add an element to the end, you can use {@link List#add(Object)}. But what about adding
   * an element at the start? Let's implement {@link ListHelper#addElementAtStart(List, String)}
   * to add an element to the start of a list of Strings.
   * <p>
   * Hint: have a look at the other methods available on {@link List} and {@link Collection} and
   * see which one you can use.
   */
  @Test
  public void testAddElementAtStart() {
    List<String> list = Lists.newArrayList("Paul", "George", "Ringo");
    new ListHelper().addElementAtStart(list, "John");

    assertEquals("List should be correct", list, Lists.newArrayList("John", "Paul", "George", "Ringo"));
  }


  /**
   * A common scenario in a program is to need to do the same operation to each element in a
   * collection.
   * <p>
   * We *could* use a for loop (or even a while loop) for this, but it's easier to use something
   * called the 'enhanced' for loop. It looks like this for a list of Strings:
   * <pre>
   *   for (String element : list) {
   *     // do something with each element
   *   }
   * </pre>
   *
   * By using this loop we avoid having to deal with any indexes!
   * <p>
   * Try implementing the {@link ListHelper#printAllElements(List)} method to print each element
   * of the list it is given. It will need to print one element per line to pass this test.
   * <p>
   * Bonus: how is this different from if you just call System.out.println() with the list itself?
   */
  @Test
  public void testPrintingAList() {
    // Create a couple of lists with different items in
    List<Integer> listOfNumbers = Lists.newArrayList(2, 3, 5, 7, 11, 13);
    List<String> listOfNames = Lists.newArrayList("Matt", "Phil", "Tony", "Aleks");

    // Print each of them and then check the final output
    ListHelper listHelper = new ListHelper();
    listHelper.printAllElements(listOfNumbers);
    listHelper.printAllElements(listOfNames);
    checkPrintedOutput(format("2%n3%n5%n7%n11%n13%nMatt%nPhil%nTony%nAleks%n"));
  }


  /**
   * You know what we haven't done enough of yet? Maths. So let's do some maths with our lists.
   * <p>
   * We're going to implement a method that takes a list of numbers and returns the sum of all
   * the numbers in the list.
   * <p>
   * Have a go at changing the {@link ListMaths#sum(List)} method to pass the below test.
   */
  @Test
  public void testSummingAList() {
    ListMaths listMaths = new ListMaths();

    assertEquals("Sum should be correct", 40, listMaths.sum(Lists.newArrayList(3, 5, 12, 20)));
    assertEquals("Sum should be correct", -23, listMaths.sum(Lists.newArrayList(-1, 2, -40, 10, 6)));
  }


  /**
   * What about getting the average of all the numbers in a list? For this we'll need to know
   * how many things are in the list. Perhaps there is an existing method we can use for that?
   * <p>
   * The test below will check your implementation of {@link ListMaths#average(List)}.
   */
  @Test
  public void testAveragingAList() {
    ListMaths listMaths = new ListMaths();

    assertEquals("Average should be correct", 10.0, listMaths.average(Lists.newArrayList(3.0, 5.0, 12.0, 20.0)), 0.01);
    assertEquals("Average should be correct", -2.6, listMaths.average(Lists.newArrayList(-1.0, 2.0, -30.0, 10.0, 6.0)), 0.01);
  }


  /**
   * Now let's move on to looking at Sets.
   * <p>
   * As with lists, there are a few different ways of creating a set. Here are a couple of examples:
   * <pre>
   *   Set&lt;String&gt; mySet = new HashSet&lt;&gt;();
   *   mySet.add("Item");
   *   mySet.add("Another Item");
   *   etc...
   * </pre>
   *
   * <pre>
   *   Set&lt;String&gt; mySet = Sets.newHashSet("Item", "Another Item", etc...);
   * </pre>
   *
   * Have a go at changing the {@link SetHelper#createThreeElementSet()} method to pass this test.
   * <p>
   * Bonus: what happens when you add the same element twice to a set? Try doing it in your
   *        implementation and see if the test still passes.
   */
  @Test
  public void testCreateSet() {
    assertEquals("Set should have 3 elements", 3, new SetHelper().createThreeElementSet().size());
  }


  /**
   * Something we usually need to do with sets is check whether a given element is contained
   * within them.
   * <p>
   * Let's implement {@link SetHelper#containsZero(Set)} which will tell us whether a given set
   * contains the number zero or not.
   */
  @Test
  public void testSetContains() {
    SetHelper setHelper = new SetHelper();

    Set<Integer> setWithZero = Sets.newHashSet(-3, 5, 0, 2);
    Set<Integer> setWithoutZero = Sets.newHashSet(-3, 5, 2);

    assertTrue("Should find zero in the set", setHelper.containsZero(setWithZero));
    assertFalse("Should not find zero in the set", setHelper.containsZero(setWithoutZero));
  }


  /**
   * Finally let's look at Maps.
   * <p>
   * With a map, you don't 'add' elements, you 'put' them into it in key/value pairs.
   * So to create a map we can do the following:
   * <pre>
   *   Map&lt;String, String&gt; myMap = new HashMap&lt;&gt;();
   *   myMap.put("Key One", "Value One");
   *   myMap.put("Key Two", "Value Two");
   *   etc...
   * </pre>
   *
   * Notice how we need two types inside the angle brackets now. One for the type of the keys
   * and one for the type of the values.
   * <p>
   * Like before, let's implement a method to create us a map with some elements. Have a look
   * at {@link MapHelper#createThreeEntryMap()} and change it to pass this test.
   * <p>
   * Bonus: what happens when you try to 'put' into the map again for a key that already exists?
   *        Print the contents of your map and find out.
   */
  @Test
  public void testCreateMap() {
    assertEquals("Map should have 3 elements", 3, new MapHelper().createThreeEntryMap().size());
  }


  /**
   * Maps are really useful when you know the key for the entry you are interested in. Suppose
   * we have a directory of Names->Phone numbers and we know we want to get the phone number for a
   * particular person. This is easy with a map! You can use the {@link java.util.Map#get(Object)}
   * method.
   * <p>
   * Let's implement the {@link MapHelper#getMattsPhoneNumber(Map)} method, which will take a map
   * of String names to String phone numbers and return the value of the entry with "Matt" as the
   * key. And no - it's not my real number.
   */
  @Test
  public void testGetEntryUsingKey() {
    Map<String, String> namesToNumbers = new HashMap<>();
    namesToNumbers.put("Aleks", "020 1234 5678");
    namesToNumbers.put("Phil", "020 4321 9876");
    namesToNumbers.put("Matt", "020 9753 8642");
    namesToNumbers.put("Tony", "020 2468 1357");

    assertEquals("Phone number should be correct", "020 9753 8642", new MapHelper().getMattsPhoneNumber(namesToNumbers));
  }


  /**
   * We have tried looping over Lists. We can also loop over the contents of a map.
   * <p>
   * However, because Map itself is not a 'collection', we can't iterate over it directly. We need
   * to get a set of all the entries somehow and loop over that instead. Then we'll be able to
   * print out each of the key/value pairs. Perhaps there is a method on Map that can help us with
   * the following exercise?
   * <p>
   * We need to implement {@link MapHelper#printPhoneDirectory(Map)} so that it prints all of the
   * names and phone numbers in the given map, one per line. Each line should start with the name,
   * then a colon and space, then the phone number e.g.
   * <pre>
   *   Tony: 020 2468 1357
   * </pre>
   *
   * The below test will check your output.
   */
  @Test
  public void testPrintingMapContents() {
    // LinkedHashMap here to ensure a predictable order
    Map<String, String> namesToNumbers = new LinkedHashMap<>();
    namesToNumbers.put("Aleks", "020 1234 5678");
    namesToNumbers.put("Phil", "020 4321 9876");
    namesToNumbers.put("Matt", "020 9753 8642");
    namesToNumbers.put("Tony", "020 2468 1357");

    new MapHelper().printPhoneDirectory(namesToNumbers);
    checkPrintedOutput(format("Aleks: 020 1234 5678%nPhil: 020 4321 9876%nMatt: 020 9753 8642%nTony: 020 2468 1357%n"));
  }


  /*
   * BONUS CONTENT
   *
   * - Try finding out about and using some of the different implementations of List, Set, and Map.
   *   See how they behave differently when the collections are very large (e.g. millions of
   *   elements). Is one type of list better for certain operations? For some more info go to this
   *   link: https://docs.oracle.com/javase/tutorial/collections/implementations/index.html
   *
   * - The 'com.google.common.collect.Sets' class has some useful methods for working with sets.
   *   You can do mathematical operations on them like 'union' and 'intersection'. Have a go at
   *   using some of these.
   *
   * - Can you find any other types of Collection?
   */
}
