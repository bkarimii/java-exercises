package training.exercises.exercise1;

public class ExerciseOneRunner {
    
    public static void main(String[] args){
        Comparisons compareObject=new Comparisons();
        System.out.println("is 9 positive?-->  "+compareObject.isPositive(9));
        System.out.println("Is 5 in range 2 and 3 ?-->  "+compareObject.isInRange(5, 2, 3));
        System.out.println("-1 Is negative or five? -->"+ compareObject.isNegativeOrFive(-1));
    }
}
