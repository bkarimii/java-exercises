package training.exercises.exercise3;

import java.util.ArrayList;
import java.util.List;

/**
 * Helpful methods for dealing with lists.
 */
class ListHelper {

  /**
   * Returns a list with 4 elements. The elements could be of any type.
   *
   * @return a four-element list
   */
  List<Object> createFourElementList() {
    // List<Object> listOfFour=List.of("ab","bc","cd","de");
    
    List<Object> listOfFourInteger=new ArrayList<>();
    for(int i=1;i<=4;i++){
      listOfFourInteger.add(i);
    }


    return listOfFourInteger;
    // return listOfFour;
  }


  /**
   * Returns the fifth element of the given list of Strings.
   *
   * @param list the list from which to return the fifth element
   * @return the fifth element of the given list
   */
  String getFifthElement(List<String> list) {
    if(list.size()>5){
      return list.get(4);
    }else{
      System.out.println("Index out of boundary");
      return "";
    }
  }


  /**
   * Adds the given String to the start of the given list of Strings.
   *
   * @param listToAddTo the list to which to add the new element
   * @param elementToAdd the new element to add at the start of the list
   */
  void addElementAtStart(List<String> listToAddTo, String elementToAdd) {
    System.out.println("List before adding: "+ listToAddTo);
    listToAddTo.add(0,elementToAdd);
    System.out.println("List after adding at the start: "+listToAddTo);
  }


  /**
   * Prints all the elements in the given list. One line per element.
   *
   * @param list the list of items to print
   */
  void printAllElements(List<?> list) {
    
    // int bound=list.size();
    // for(int i=0;i<bound;i++){
    //   System.out.println(list.get(i));
    // }
    for(Object item:list){
      System.out.println(item);
    }
  }

}
