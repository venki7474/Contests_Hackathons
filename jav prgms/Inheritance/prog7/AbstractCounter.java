
/**
 * Write a description of class AbstractCounter here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
abstract public class AbstractCounter {
  abstract public void click();
  public int get() { 
    return value; 
  }
  public void set(int x) { 
    value = x; 
  }
  public String toString() { 
    return String.valueOf(value); 
  }
  protected int value;  
}
