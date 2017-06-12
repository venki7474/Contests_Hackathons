import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i ++) {
        	arr[i] = sc.nextInt();
        }
        int value, hole;
        for (int i = 1; i <  n; i++){
        	value = arr[i];
        	hole = i;
        	while (hole > 0 && arr[hole-1] > value) {
        		arr[hole] = arr[hole-1];
        		hole = hole-1;
        	}
        	arr[hole] = value;
        }
        int diff = 999999999;
        ArrayList list = new ArrayList();
        for (int i = 0; i < n; i ++){
        	// System.out.println(arr[i] + " ");
        	if (i != n-1) {
        		int res = Math.abs(arr[i] - arr[i+1]);
        		if (res < diff){
        			diff = res;
        			list = new ArrayList();
        			list.add(arr[i]);
        			list.add(arr[i+1]);
        		} else if (res == diff){
        			list.add(arr[i]);
        			list.add(arr[i+1]);
        		}
        	} else {
        		break;
        	}
        }
        for (int i = 0; i < list.size(); i ++){
        	System.out.print(list.get(i) + " ");
        }
    }
}

import java.util.*;
import java.io.*;

class MyDisjoint {
  public Hashtable<String, Node> all = new Hashtable<>();
  // public Hashtable<String, boolean> all2 = new Hashtable<>();


  class Node {
    String data;
    Node parent;
    int rank;
  }
  public void makeSet(String data) {
    Node node = new Node();
    node.data = data;
    node.parent = node;
    node.rank = 0;
    all.put(data, node);
    // all2.put(data, false);
    // System.out.println("set made");
  }

  public String findSet(String data) {
    return findSet(all.get(data)).data;
  }
  public Node findSet(Node node) {
    Node parent = node.parent;
    if (node == parent) {
      return node;
    } else {
      node.parent = findSet(node.parent); // goes under recursion until it gets its parent.
      return node.parent;
    }
  }
  ArrayList<String> list = new ArrayList();
  public boolean union(String data1, String data2) {
    Node node1 = all.get(data1);
    Node node2 = all.get(data2);
    Node parent1 = findSet(node1);
    Node parent2 = findSet(node2);

    if (parent1.data.equals(parent2.data)) {
      list.add(data1+","+data2);
            return false;
        }

        //else whoever's rank is higher becomes parent of other
        if (parent1.rank >= parent2.rank) {
            //increment rank only if both sets have same rank
            parent1.rank = (parent1.rank == parent2.rank) ? parent1.rank + 1 : parent1.rank;
            parent2.parent = parent1;
            list.add(data1+","+data2);
        } else {
            parent1.parent = parent2;
            list.add(data1+","+data2);
        }
        return true;
  }
  public void listprint(){
      // System.out.println(list);
    for (String str : list) {
      System.out.println("("+str+")");
    }
  }
}
public class Kruskals {
  public static void main(String[] args) {
    Hashtable<String,ArrayList> vxHash = new Hashtable<String,ArrayList>();
        Hashtable<String,ArrayList> wtHash = new Hashtable<String,ArrayList>();
        MyDisjoint myDj = new MyDisjoint();
    Scanner sc = new Scanner(System.in);
        int num = Integer.parseInt(sc.nextLine());
        String vertices = sc.nextLine();
        ArrayList vxAr = new ArrayList();

        StringTokenizer stzr = new StringTokenizer(vertices, "(), ");
        while (stzr.hasMoreTokens()) {
          String tk = stzr.nextToken();
            vxAr.add(tk);
            myDj.makeSet(tk);
        }
        // System.out.println(vxAr);
        // System.out.println(myDj.findSet("A"));
        int ver=0;
        ArrayList<String> arr1 = new ArrayList();
        ArrayList<Integer> arr2 = new ArrayList();
        for(int j = 0; j < num; j ++) {
            String st = sc.nextLine();
            String s[] = st.split("\\s");

            for(int i = 0; i < s.length; i ++) {
                if(!s[i].equals("0")) {
                    arr1.add(vxAr.get(j)+"-"+vxAr.get(i) +"="+s[i]);
                    arr2.add(Integer.parseInt(s[i]+""));
                }
            }
            ver++;
        }
        Collections.sort(arr2);
        int count = 0;
        boolean[][] visit = new boolean[vxAr.size()][vxAr.size()];
        for(int i = 0; i < visit.length; i ++ ) {
          for(int j = 0; j < visit.length; j ++) {
            visit[i][j] = false;
          }
        }
        for (int i = 0; i < arr2.size(); i ++) {
          ArrayList<String> finalList = new ArrayList<String>();

          for(int j = 0; j < arr1.size(); j ++) {
            String str = arr1.get(j);
            int val = Integer.parseInt((arr1.get(j)).substring(4));
            String st1 = "", st2 = "";
            if (arr2.get(i) == val) {
              st1 = arr1.get(j).substring(0,1);
              st2 = arr1.get(j).substring(2,3);
              String rt1 = myDj.findSet(st1);
              String rt2 = myDj.findSet(st2);
              if (!rt1.equals(rt2) && visit[vxAr.indexOf(st1)][vxAr.indexOf(st2)] == false) {

                // myDj.union(st1, st2);
                finalList.add(st1+" "+ st2);
                System.out.println(st1 +"--"+st2);
                System.out.println("**"+vxAr);
                visit[vxAr.indexOf(st1)][vxAr.indexOf(st2)] = visit[vxAr.indexOf(st2)][vxAr.indexOf(st1)] = true;
                count += val;
              } 
              arr1.remove(str);
              arr1.remove(st2 + "-" + st1 + "=" + val);
              break;
            }
          }
          for(int k = finalList.size() - 1; k >= 0; k--) {
            String[] temp = finalList.get(k).split(" ");
            myDj.union(temp[0],temp[1]); 
          }
        }
        myDj.listprint();
        System.out.println(count);
  }
}
/*

7
(A,B,C,D,E,F,G)
0 2 0 3 3 0 0
2 0 3 0 4 0 0
0 3 0 0 1 8 0
3 0 0 0 0 7 0
3 4 1 0 0 6 0
0 0 8 7 6 6 9
0 0 0 0 0 9 0

*/