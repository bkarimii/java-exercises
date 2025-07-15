package training.exercises.exercise4;

enum DayOfWeek {
  MONDAY("Weekday"),
  TUESDAY("Weekday"),
  WEDNESDAY("Weekday"),
  THURSDAY("Weekday"),
  FRIDAY("Weekday"),
  SATURDAY("Weekend"),
  SUNDAY("Weekend")
  ; 
  // TODO add some values -- don't worry about the method below for now. We'll use that in a bit.

 private String description;

  DayOfWeek(String description){
    this.description=description;
 }

 public String getDescription(){
  return description;
 }
  /**
   * Returns true if this day is part of the weekend; false if it's a weekday.
   */
  boolean isWeekend() {
      if(this==SATURDAY || this==SUNDAY){
        return true;
      }else{
        return false;
      }
    }

}
