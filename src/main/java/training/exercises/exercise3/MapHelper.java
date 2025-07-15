package training.exercises.exercise3;

import java.util.HashMap;
import java.util.Map;

/**
 * Helpful methods for dealing with Maps.
 */
class MapHelper {

  /**
   * Returns a map with three entries. The keys and values can be any type.
   *
   * @return a three-entry map.
   */
  Map<Object, Object> createThreeEntryMap() {
    Map<Object,Object> nameAgeMap=new HashMap<>();
    nameAgeMap.put("John", 20);
    nameAgeMap.put("Jane", 30);
    nameAgeMap.put("Ford", 40);
    // nameAgeMap.put("UK", "London");
    return nameAgeMap;
    
  }


  /**
   * Returns the value of the entry in the map for which the key is "Matt".
   *
   * @param namesToNumbers the map in which to find the entry
   * @return the value for the "Matt" entry
   */
  String getMattsPhoneNumber(Map<String, String> namesToNumbers) {

    return namesToNumbers.get("Matt");

  }


  /**
   * Takes the given map of names to phone numbers and prints a phone directory. Each line
   * will contain a name followed by a colon, space, and then the phone number belonging to that
   * name.
   *
   * @param namesToNumbers the names and numbers to print
   */
  void printPhoneDirectory(Map<String, String> namesToNumbers) {
    
    for(Map.Entry<String, String> entry:namesToNumbers.entrySet()){
      System.out.println(entry.getKey()+": "+entry.getValue());
    }
  }

}
