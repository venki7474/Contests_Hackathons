/*
Problem Statement:

We all know Chandler and Joey; they are the best buddies. 
One day they went to a fare and they saw a Balloon-shooting shop and suddenly Chandler challenges Joey to a shooting challenge. 
The rule of challenge is that Joey has to shoot alternative balloons one from the beginning another one from the end and so on, from the row of balloons. 
Every balloons are marked with some specific points. 
Chandler ask Joey if he can shoot the balloons and get a specific score set by him. 
If Joey can do that he will have a treat from chandler in the central-perk otherwise he needs to pay for the coffee next time. 
So Joey wants to know whether he will be able to get the score or not and we have to help him figuring that out. 
NOTE: The game always starts by bursting the first balloon first and so on. 
INPUT FORMAT:
The first line contains the no. of test cases T. 
Each test cases contains three lines, 
First line shows the total no. of balloons N. 
Second line will have the points of each balloons in an array. 
Third line shows the specific score S set by chandler. 

OUTPUT FORMAT:

If it is possible then print the position of balloons that Joey had popped or else print "BING". 

CONSTRAINTS:

SubTask#1

1<=T<=10^5 
1<=N<=10^7 
1<=S<=10^18 

SubTask#2

Original Constraints.. 

SubTask#3

Original Constraints.


SAMPLE INPUT:

1 
6 
17 8 9 21 3 5 
30 

SAMPLE OUTPUT:

1 6 2 

EXPLANATION:

As we can see that if we burst the balloons of position 1 ,6 and 2 
The sum of score will add up to 17+5+8=30 
So the answer is 1 6 2.
*/
import java.util.*;
import java.math.*;
class JoeyChallenge {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = Integer.parseInt(sc.nextLine());
		while (t -- > 0) {
			int n = Integer.parseInt(sc.nextLine());
			// int[] arr = new int[n];
			// int i = 0;
			// ArrayList<Integer> list = new ArrayList();
			// while (i < n) {
			// 	// arr[i] = sc.nextInt();
			// 	list.add(sc.nextInt());
			// 	i++;
			// }sc.nextLine();
			String[] inp_arr = sc.nextLine().split(" ");
			ArrayList<String> list = new ArrayList<String>(Arrays.asList(inp_arr));
			String s_str = sc.nextLine();
			BigInteger s = new BigInteger(s_str);
			// System.out.println(s+";");
			BigInteger res = new BigInteger("0");
            String res_str = "";
            int j = 0, m = 0;
            boolean flag = false;
            if (list.size()%2 == 0) {
            	m = list.size()/2;
            } else {
            	m = list.size()/2 +1;
            }
			while (j < m) {
				String temp = list.get(j);
                res_str = res_str + (j+1) +" ";
                BigInteger big_temp = new BigInteger(temp+"");
                res = res.add(big_temp);
                // System.out.println(res+"ressss");
				if ((res.compareTo(s)) == 0) {
					flag = true;
                    break;
                }
                if ((res.compareTo(s)) > 0) {
                	break;
                }
                int k = list.size()-1 - j;
                String temp2 = list.get(k);
                res_str = res_str + (k+1) +" ";
                BigInteger big_temp2 = new BigInteger(temp2+"");
                res = res.add(big_temp2);
				if ((res.compareTo(s))==0) {
					flag = true;
                    break;
                }
                if ((res.compareTo(s)) > 0) {
                	break;
                }
                j ++;
			}
			if (flag){
            	System.out.println(res_str);
            } else {
            	System.out.println("BING");
            }
		}
	}
}
