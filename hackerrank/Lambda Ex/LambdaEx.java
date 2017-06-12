import java.io.*;
import java.util.*;
interface performOperation{
    int check(int a);
}
class Math{
   public static int checker(performOperation p ,int num){
       return p.check(num);
   }
   performOperation checkEvenOdd() {
   		performOperation ev = (int a) -> { return a%2 == 0?0:1; };
   		return ev;
   }
   performOperation checkPrime() {
   		performOperation p = (int a) -> {
   			int flag = 0;
   			for (int i =1; i < a; i++){ if (a%i == 0){ flag = 1; } }
   			return (flag==1?0:1);
   		};
  		return p;
 }  
   performOperation checkPalindrome() {
   		performOperation pal = (int a) -> {
   			int r,sum=0,temp;     
			temp = a;    
		    while(a > 0) {  
   				r = a % 10; 
   				sum = (sum * 10) + r;    
   				a = a / 10;    
  			}
  			return (temp == sum?0:1);   
   		};
   		return pal;
   }
}
public class LambdaEx {

    public static void main(String[] args)throws IOException {
        Math ob = new Math();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T=Integer.parseInt(br.readLine());
        performOperation op;
        int ret =0;
        String ans=null;
        while(T-->0){
            String s=br.readLine().trim();
            StringTokenizer st=new StringTokenizer(s);
            int ch=Integer.parseInt(st.nextToken());
            int num=Integer.parseInt(st.nextToken());
            if(ch==1){
                op = ob.checkEvenOdd();  
                ret = ob.checker(op,num);
                ans = (ret == 0)?"EVEN":"ODD";
            }
            else if(ch==2){
                op = ob.checkPrime();
                ret = ob.checker(op,num);
                ans = (ret == 0)?"PRIME":"COMPOSITE";
            }
            else if(ch==3){
                op = ob.checkPalindrome();
                ret = ob.checker(op,num);
              	ans = (ret == 0)?"PALINDROME":"NOT PALINDROME";

            }
            System.out.println(ans);
        }
    }
          
}
