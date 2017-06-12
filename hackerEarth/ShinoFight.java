import java.util.*;
import java.io.*;
import java.lang.*;
class ShinoFight {
	public static void main(String[] args) throws IOException{
		try {
			Scanner sc = new Scanner(System.in);
			int n = sc.nextInt();
			int q = sc.nextInt(); sc.nextLine();
			int[] arr = new int[n];
			Hashtable<Integer, Integer> ht = new Hashtable();
			ArrayList<Integer> winners = new ArrayList();
			if (n % 2 == 0){
				for (int i = 0; i < n; i ++) {
					arr[i] = sc.nextInt();i++;
					arr[i] = sc.nextInt();
					if (arr[i] > arr[i-1]) {
						ht.put (i,1);ht.put(i-1,1);
						winners.add(i);
					} else if (arr[i] < arr[i - 1]) {
						ht.put (i-1,1);ht.put(i-1,1);
						winners.add(i-1);
					}
				}
			} else {
				for (int i = 0; i < n-1; i ++) {
					arr[i] = sc.nextInt();i++;
					arr[i] = sc.nextInt();
					if (arr[i] > arr[i-1]) {
						ht.put (i,1);ht.put(i-1,1);
						winners.add(i);
					} else if (arr[i] < arr[i - 1]) {
						ht.put (i-1,1);ht.put(i-1,1);
						winners.add(i-1);
					}
				}
				arr[n-1] = sc.nextInt();
				ht.put(n-1,0);
				winners.add(n-1);
			}
			// 
			// System.out.println(ht);
			// System.out.println(winners);
			ArrayList<Integer> dummy = winners;
			while (dummy.size() != 1) {
				dummy = new ArrayList();
				if (winners.size()%2 == 0) {
					for (int i = 0; i < winners.size(); i +=2) {
						if (i+1 <= winners.size()-1 && arr[winners.get(i)] > arr[winners.get(i+1)]) {
							if (ht.containsKey(winners.get(i))) {
								ht.put(winners.get(i),ht.get(winners.get(i))+1);
								ht.put(winners.get(i+1),ht.get(winners.get(i+1))+1);
								dummy.add(winners.get(i));
							}
						} else if (i+1 <= winners.size()-1 && arr[winners.get(i)] < arr[winners.get(i+1)]) {
							if (ht.containsKey(winners.get(i+1))) {
								ht.put(winners.get(i),ht.get(winners.get(i))+1);
								ht.put(winners.get(i+1),ht.get(winners.get(i+1))+1);
								dummy.add(winners.get(i+1));
							}
						}
					}
				} else {
					for (int i = 0; i < winners.size(); i +=2) {
						if (i+1 <= winners.size()-1 && arr[winners.get(i)] > arr[winners.get(i+1)]) {
							if (ht.containsKey(winners.get(i))) {
								ht.put(winners.get(i),ht.get(winners.get(i))+1);
								ht.put(winners.get(i+1),ht.get(winners.get(i+1))+1);
								dummy.add(winners.get(i));
							}
						} else if (i+1 <= winners.size()-1 && arr[winners.get(i)] < arr[winners.get(i+1)]) {
							if (ht.containsKey(winners.get(i+1))) {
								ht.put(winners.get(i),ht.get(winners.get(i))+1);
								ht.put(winners.get(i+1),ht.get(winners.get(i+1))+1);
								dummy.add(winners.get(i+1));
							}
						}
					}
					if (ht.containsKey(winners.get(winners.size()-1))) {
						// ht.put(winners.get(winners.size()-1));
						dummy.add(winners.get(winners.size()-1));
					}
				}
				winners = new ArrayList();
				winners = dummy;
			}
			// System.out.println(winners);
			// System.out.println(ht);
			while(q --> 0) {
				int que = sc.nextInt();sc.nextLine();
				System.out.println(ht.get(que-1));
			}
		} catch (Exception e) {
			return;
		}
	}
}

/*
5 5
1 2 3 4 5
1
2
3
4
5

*/