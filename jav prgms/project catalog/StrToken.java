
/**
 * Write a description of class StrToken here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

 
 
import java.util.StringTokenizer;
//- See more at: http://www.java2novice.com/stringtokenizer/tokens-by-delimiters/#sthash.JupYUHW4.dpuf
//import java.lang.Object;
//import java.util.StringTokenizerv;
public class StrToken
{
    public static void main(String[] args)
    {
        int token=0;
        String thirdString=new String();
        String fithString=new String();
        String input=new String("A quick brown fox jumps over the lazy dog");
        String delim=new String(" ");
        
     StringTokenizer st = new StringTokenizer(input.toString()," ");
     while (st.hasMoreTokens())
     {
         //System.out.println(st.nextToken());
         st.nextToken();
         token++;
         if(token==2)
         {
         thirdString=st.nextToken();
         token++;
        }
         if(token==4)
         {
         fithString=st.nextToken();
         token++;
        }
        
     }
     System.out.println(token);
     System.out.println(thirdString);
     System.out.println(fithString);
     
    }
  
}
