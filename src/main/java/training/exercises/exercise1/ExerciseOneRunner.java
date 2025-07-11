package training.exercises.exercise1;

public class ExerciseOneRunner {
    
    public static void main(String[] args){
        
        System.out.println("--------Comparison class starts here ----------");
        Comparisons compareObject=new Comparisons();
        System.out.println("is 9 positive?-->  "+compareObject.isPositive(9));
        System.out.println("Is 5 in range 2 and 3 ?-->  "+compareObject.isInRange(5, 2, 3));
        System.out.println("-1 Is negative or five? -->"+ compareObject.isNegativeOrFive(-1));

        System.out.println("-------Math class starts here -----------");

        Maths calc=new Maths();
        
        System.out.println(calc.add(1,2));
        System.out.println(calc.subtract(3,5));
        System.out.println(calc.multiply(2,3));
        System.out.println(calc.divide(10,2));
        
        System.out.println("-------More Math class starts here -----------");
        MoreMaths moreMath= new MoreMaths();
        System.out.println(moreMath.increment(10));
        System.out.println(moreMath.decrement(10));
        System.out.println(moreMath.doubleIfOdd(3));
        
        System.out.println("-------FizzBuzz class starts here -----------");
        FizzBuzz fizzBuzz= new FizzBuzz();
        fizzBuzz.takeTurn(15);
        fizzBuzz.takeTurn(9);
        fizzBuzz.takeTurn(20);
        fizzBuzz.takeTurn(13);
    }
}
