import java.util.*;
import java.io.*;
import java.lang.*;
class Solution {
	public static void main(String[] args) {
		Hashtable<Integer, ArrayList<Integer>> vxHash = new Hashtable();
		Hashtable<Integer, ArrayList<Integer>> wtHash = new Hashtable();

		Hashtable<Integer,Integer> distance=new Hashtable();
		Scanner sc = new Scanner(System.in);
		int C = sc.nextInt(); int F = sc.nextInt();
		ArrayList<Integer> vxArr = new ArrayList();
		int tp = 1;
		while(tp <= C) {
			vxArr.add(tp);
			tp++;
		}
		while(F-->0) {
			int v1 = sc.nextInt(); int v2 = sc.nextInt(); int wt = sc.nextInt(); sc.nextLine();
			ArrayList<Integer> arrVx = vxHash.get(v1);
			ArrayList<Integer> arrWt = wtHash.get(v1);
			if(arrVx == null && arrWt == null) {
				arrVx = new ArrayList();
				arrWt = new ArrayList();
				arrVx.add(v2);
				vxHash.put(v1, arrVx);
				arrWt.add(wt);
				wtHash.put(v1, arrWt);
			} else {
				arrVx.add(v2);
				vxHash.put(v1, arrVx);
			
				arrWt.add(wt);
				wtHash.put(v1, arrWt);
			}	 
		}
		// System.out.println(vxHash);
		// System.out.println("=====");
		// System.out.println(wtHash);
		List<Integer> queueArray = new ArrayList();
		queueArray.add(vxArr.get(0));
		distance.put(vxArr.get(0), 0);
		int j1 = 1;
        while (j1 < vxArr.size()) {
        	distance.put(vxArr.get(j1), 99999);
        	j1++;
        }
        int finalDist = 0;
        while (queueArray.size()!= 0) {
        	int minStr = 0;
        	int minValue = Integer.MAX_VALUE;
        	// System.out.println(queueArray);
        	for (int m = 0; m < queueArray.size(); m ++) {
        		int eachValue = (Integer)distance.get(queueArray.get(m)); 
        		if(eachValue <= minValue) { 
        			minValue = eachValue; 
        			minStr = queueArray.get(m);
        		}
        	}
        	queueArray.remove(queueArray.indexOf(minStr));
        	List<Integer> pVx = new ArrayList();
        	List<Integer> pWt = new ArrayList();
        	pWt = wtHash.get(minStr);
        	pVx = vxHash.get(minStr);
        	if (pVx != null)
        	for  (int l = 0; l < pVx.size(); l ++) {
        		int uDist = 0, vDist = 0, edgeWt = 0, sum = 0;
        		uDist = (Integer)distance.get(minStr);
        		vDist = (Integer)distance.get(pVx.get(l));
        		edgeWt = pWt.get(l);
        		sum = uDist + edgeWt;
        		// System.out.println( minStr + "+++"+uDist +"---" + vDist+" sum is  "+sum);
        		if (vDist > sum) {
        		 	distance.put(pVx.get(l), sum);
        		 	if (!queueArray.contains(pVx.get(l))) {
        		 		queueArray.add(pVx.get(l));
        		 		// System.out.println("in loop");
        		 	}
        		 }
        	}
        }
        // System.out.println(distance);
        Set s = distance.keySet();
        Iterator iterSet = s.iterator();
 		int min = Integer.MIN_VALUE;
		while (iterSet.hasNext()) {
			int strKey = (Integer)iterSet.next();
			if(min <= distance.get(strKey)) {
				min = distance.get(strKey);
			}
		}
		System.out.println(min);
	}
}