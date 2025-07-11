package training.exercises.exercise3;

import java.util.ArrayList;
import java.util.List;

public class ExerciseThreeRunner {
    public static void main(String[] args){

        String whichClass="ListMaths";

        if(whichClass=="ListHelper"){
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
        }else if(whichClass=="ListMaths"){
            ListMaths listMaths=new ListMaths();
            List<Integer> listOfInt=new ArrayList<>();
            listOfInt.add(1);
            listOfInt.add(2);
            listOfInt.add(3);
            listOfInt.add(4);

            System.out.println(listMaths.sum(listOfInt));
            System.out.println("=========================================");
            List<Double> listofDouble=List.of(1.0,2.0,3.0,4.0,5.0,6.0);
            System.out.println("Average is: "+listMaths.average(listofDouble));
        }
        
    }
}
