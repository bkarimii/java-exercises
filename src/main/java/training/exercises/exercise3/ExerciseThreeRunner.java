package training.exercises.exercise3;

import java.util.ArrayList;
import java.util.List;

public class ExerciseThreeRunner {
    public static void main(String[] args){
        ListHelper listHelper=new ListHelper();
        System.out.println(listHelper.createFourElementList());

        System.out.println("=========================================");
        List<String> list=new ArrayList<>();
        list.add("first");
        list.add("second");
        list.add("third");
        list.add("fourth");
        list.add("fifth");
        list.add("sixth");

        // listHelper.getFifthElement(list);
        System.out.println(listHelper.getFifthElement(list));

        System.out.println("=========================================");
        listHelper.addElementAtStart(list, "zero");

        System.out.println("=========================================");
        listHelper.printAllElements(list);
    }
}
