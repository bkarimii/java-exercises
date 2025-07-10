package training.examples.basics;

/**
 * In this class we will have a look at the various primitive data types that are available in Java.
 */
public class PrimitiveTypes {

  /**
   * Creates and prints a variety of variables using primitive data types. Starts with the
   * more common ones and moves on to the less-used ones.
   */
  public static void main(String[] args) {

    /*
     ****************
     * Introduction *
     ****************
     *
     * Java has two types of data type: primitive and reference.
     *
     * Without going into too much detail right now, primitive types are usually much faster
     * for the computer to deal with and should be used in situations where performance is
     * important. Moreover, the primitive types are the basic 'building blocks' of Java and all
     * reference types are ultimately made up of primitive types.
     *
     * You can identify primitive types because they are always in lowercase, unlike reference
     * types which are in UpperCamelCase.
     *
     * The primitive types are defined by the Java language itself and we cannot create any new
     * ones ourselves or change any existing ones. The types are:
     */


    /*
     * int
     *
     * Short for 'integer', this represents a whole number. It is stored using 32 bits of memory
     * and is signed (meaning that it can hold negative numbers) so it can store values between
     * -2147483648 and +2147483647
     *
     * To define an integer, just write the number.
     */
    int anInteger = 123;
    System.out.println(anInteger);

    /*
     * long
     *
     * This is similar to int in that it stores a signed whole number, but it uses 64 bits of memory
     * instead of 32 (hence the name 'long') so it can store a much larger range of values. It
     * can store values between -9223372036854775808 and +9223372036854775807.
     *
     * Make sure to use a long instead of an int if you expect to need values higher than about
     * 2 billion or lower than minus 2 billion.
     *
     * To define a long, write the number followed by a capital L.
     */
    long aLong = 456L;
    System.out.println(aLong);

    /*
     * double
     *
     * A double is a double-precision floating point number. This means that, unlike ints and longs,
     * it can represent numbers with a decimal point.
     *
     * Confusingly, double-precision floating point is actually the *default* floating-point type
     * and is much more common than the single-precision type (float) that we don't use.
     *
     * To define a double, write a number with a decimal point, or write any number followed by a D
     */
    double aDouble = 0.25;
    System.out.println(aDouble);

    double alsoADouble = 10D;
    System.out.println(alsoADouble);

    /*
     * boolean
     *
     * Named after George Bool, this is used to hold a value that can be either true or false.
     *
     * To define a boolean, use the words 'true' or 'false'.
     */
    boolean isJavaFun = true;
    System.out.println(isJavaFun);

    boolean areWeDoneYet = false;
    System.out.println(areWeDoneYet);

    /*
     * char
     *
     * Short for 'character', this represents a single character e.g. 'A' or '+'. It is actually
     * stored as an unsigned 16-bit number, meaning that it can hold values from 0 to 65535, but
     * it is rarely used to represent numbers.
     *
     * To define a character, put the character inside single quotes.
     */
    char aCharacter = 'A';
    System.out.println(aCharacter);

    /*
     * Special mention: String
     *
     * A String is a sequence of characters e.g. "Hello, world!".
     *
     * String is *not* a primitive type (hence the capital S in String) but it is very useful and
     * in some ways it does behave a little like a primitive type.
     *
     * For example, you can define a String by surrounding some text in double quotes
     */
    String text = "here's a string";
    System.out.println(text);

    //
    // There are other primitive types that are much less common, which we'll see in the Further
    // Java course
    //
  }

}
