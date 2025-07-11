package training.exercises.exercise2;

public class ExerciseTwoRunner {
    
 public static void main(String[] args){
    Loops loops=new Loops();
    loops.countUpTo(10);

    System.out.println("=====================================");
    loops.countInMultiples(2, 19);
    System.out.println("=====================================");
    System.out.println(loops.sumOfSquares(5));
    System.out.println("=====================================");
    System.out.println(loops.average(10));
    System.out.println("=====================================");
    loops.maybeBreakAtTen(13, true);
    System.out.println("=====================================");
    loops.countToTenSkipping(6);
 }
}
