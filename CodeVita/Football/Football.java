import java.util.*;
import java.io.*;
class Football {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());
		Hashtable<String, ArrayList<Integer>> hash = new Hashtable();
		String teams = sc.nextLine();
		StringTokenizer st = new StringTokenizer(teams, " ");
		while (st.hasMoreTokens()) {
			String token = st.nextToken();
			ArrayList<Integer> list = new ArrayList();
			list.add(0);list.add(0);list.add(0);list.add(0);list.add(0);list.add(0);
			hash.put(token, list);
		}
		int matches = Integer.parseInt(sc.nextLine());
		while(matches -- > 0) {
			String match = sc.nextLine();
			st = new StringTokenizer(match, " ");
			int count = 0;
			while (st.hasMoreTokens()) {
				String first = st.nextToken();
				String second = st.nextToken();
				int goals1 = Integer.parseInt(st.nextToken());
				int goals2 = Integer.parseInt(st.nextToken());
				if (first.equals(second)) {
					System.out.println("Invalid Input");
					return;
				}
				///for first team
				ArrayList<Integer> data = hash.get(first);
				int tempMatches = data.get(0);
				if (tempMatches == 2) {
					System.out.print("Invalid Input");
					return;
				}
				data.set(0, tempMatches+1);
				int tempGF = data.get(1);
				data.set(1,tempGF+goals1);
				int tempAF = data.get(2);
				data.set(2,tempAF+goals2);
				int tempGD = data.get(1) - data.get(2);
				data.set(3, tempGD);
				if (goals1 > goals2) {
					int tempPts = data.get(4);
					data.set(4,tempPts+2);
				}
				if (goals1 == goals2) {
					int tempPts = data.get(4);
					data.set(4,tempPts+1);
				}
				hash.put(first,data);
				//for second team
				ArrayList<Integer> data2 = hash.get(second);
				int temp2Matches = data2.get(0);
				if (temp2Matches == 2) {
					System.out.print("Invalid Input");
					return;
				}
				data2.set(0, temp2Matches+1);
				int temp2GF = data2.get(1);
				data2.set(1,temp2GF+goals2);
				int temp2AF = data2.get(2);
				data2.set(2,temp2AF+goals1);
				int temp2GD = data2.get(1) - data2.get(2);
				data2.set(3, temp2GD);
				if (goals2 > goals1) {
					int temp2Pts = data2.get(4);
					data2.set(4,temp2Pts+2);
				}
				if (goals1 == goals2) {
					int temp2Pts = data2.get(4);
					data2.set(4,temp2Pts+1);
				}
				hash.put(second, data2);
			}
		}
		// System.out.println(hash);
		Set<String> set = hash.keySet();
		ArrayList<String> forRank = new ArrayList();
		for (String key : set) {
			
			ArrayList<Integer> dt = hash.get(key);
			forRank.add(dt.get(4)+" "+dt.get(3)+" "+dt.get(1)+" "+key+"");
		}
		String tp = "";
		for (int i = 0; i < forRank.size(); i ++) {
			for (int j = i + 1; j < forRank.size(); j ++) {
				if (Integer.parseInt(forRank.get(i).substring(0,1)) > Integer.parseInt(forRank.get(j).substring(0,1))) {
					tp = forRank.get(i);
					forRank.set(i,forRank.get(j));
					forRank.set(j,tp);
				}
				if (Integer.parseInt(forRank.get(i).substring(0,1)) == Integer.parseInt(forRank.get(j).substring(0,1))) {
					if (Integer.parseInt(forRank.get(i).substring(2,3)) > Integer.parseInt(forRank.get(j).substring(2,3))) {
						tp = forRank.get(i);
						forRank.set(i,forRank.get(j));
						forRank.set(j,tp);
					} else if (Integer.parseInt(forRank.get(i).substring(2,3)) == Integer.parseInt(forRank.get(j).substring(2,3))) {
						if (Integer.parseInt(forRank.get(i).substring(4,5)) > Integer.parseInt(forRank.get(j).substring(4,5))) {
							tp = forRank.get(i);
							forRank.set(i,forRank.get(j));
							forRank.set(j,tp);
						} else if (Integer.parseInt(forRank.get(i).substring(4,5)) == Integer.parseInt(forRank.get(j).substring(4,5))){
							if (forRank.get(i).substring(6).compareTo(forRank.get(j).substring(6)) < 0) {
								tp = forRank.get(i);
								forRank.set(i,forRank.get(j));
								forRank.set(j,tp);
							}
						}
					}
				}

			}
		}
		// System.out.println(forRank);
		for (int i = (forRank.size()-1); i >= 0; i --) {
			if (i == 0) {
				System.out.print(forRank.get(i).substring(6).trim());
			} else {
				System.out.println(forRank.get(i).substring(6).trim());
			}
		}
	}
}