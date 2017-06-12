import java.util.*;
class Fsm {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      String s = sc.nextLine();
      boolean b = hasUNumber(s);
      if(b==true){
        System.out.println("Yes, its a float number");
      }if(b==false){
        System.out.println("Not a float number");
      }
    }
    
    public static boolean hasUNumber(String src) {
      String s = src + ';';
        int ndx = 0;
        if (s.charAt(0) >= '0' && s.charAt(0) <= '9') {
          ndx = 1;
          while (s.charAt(ndx) >= '0' && s.charAt(ndx) <= '9') ndx++;
            if (src.charAt(src.length()-1) == 'E' || src.charAt(src.length()-1) == 'e') { // this code checks whether the Last character is not an "E/e"
              return false;
            }
            if (s.charAt(ndx) == '.') {
              ndx++;
              if (s.charAt(ndx) >= '0' && s.charAt(ndx) <= '9') {
                ndx++;
                while (s.charAt(ndx) >= '0' && s.charAt(ndx) <= '9') ndx++;
                if (s.charAt(ndx) == 'E' || s.charAt(ndx) == 'e' ){
                  return hasUNumberState6(s, ndx+1);
                }
                else if (ndx + 1 == s.length()){
                  return true;
                }
                else{
                  return false;
                }
              } else if (s.charAt(ndx) == 'E' || s.charAt(ndx) == 'e') {
                return hasUNumberState6(s, ndx+1);
              } else if (ndx + 1 == s.length()){
                return true;
              }
              else return false;
              } 
              else if (s.charAt(ndx) == 'E' || s.charAt(ndx) == 'e') {
                return hasUNumberState6(s, ndx+1);
              } 
              else if (ndx + 1 == s.length()){
                return true;
              }
              else{
                return false;
              }
        }
        else if (s.charAt(0) >= '.') {
          if (s.charAt(1) >= '0' && s.charAt(1) <= '9') {
            ndx++;
            while (s.charAt(ndx) >= '0' && s.charAt(ndx) <= '9') ndx++;
            if (s.charAt(ndx) == 'E' || s.charAt(ndx) == 'e') {
              return hasUNumberState6(s, ndx+1);
            } 
            else if (ndx + 1 == s.length()) 
              return true;
            else 
              return false;
          }
          else 
            return false;
        }
        else 
          return false;
      }
      /**
      *this method is for state 6
      *@param String the String and and the index
      *@return boolean value. 
      **/
      private static boolean hasUNumberState6(String str, int index) {
      
    /* Write the code here */
        int temp = 0;
        for( ;index+1 < str.length();) {
          if(temp == 0 && (str.charAt(index) == '+'|| str.charAt(index) == '-')) { // this code checks the '+'or '-'
            if (str.charAt(index+1) >= '0' && str.charAt(index+1) <= '9'){// this code checks the next char after '+' or '-'
              temp = 2;
            }
            else
              temp = 1;
            index ++;
          } else if(str.charAt(index) >= '0' && str.charAt(index) <= '9') { // this code only checks the number less than 9
            index ++;
          } else 
            return false;
          } 
          if(temp == 0 || temp == 2) { // returns the the boolean 
            return true;
          } else {
            return false;
          }
      } 
  } 
