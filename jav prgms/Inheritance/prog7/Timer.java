
/**
 * Write a description of class Timer here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Timer extends  AbstractCounter {
  public Timer(int v) { 
    set(v); 
  }
  public void click() { 
    value++; 
  }
  public String toString() {
    return hour() + "hours" + (value / 60) + " minutes, " + (value % 60) + " seconds";
  }
  public int hour() {
    return (value / (60 * 60));    
  } 
}
