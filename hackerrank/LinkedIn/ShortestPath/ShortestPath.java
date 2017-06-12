import java.util.*;
public class ShortestPath {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int q = sc.nextInt();sc.nextLine();
        while (q -- > 0) {
            Hashtable<Integer, List<Integer>> vertices_dic = new Hashtable();
            int n = sc.nextInt();
            int l = sc.nextInt();sc.nextLine();
            while (l -- > 0) {
                int u = sc.nextInt();
                int v = sc.nextInt();sc.nextLine();
                if (!vertices_dic.containsKey(u)) {
                    // List<Integer> list = new ArrayList();
                    vertices_dic.put(u, new ArrayList(v));
                } else {
                	List<Integer> list = vertices_dic.get(u);
                	list.add(v);
                	vertices_dic.put(u, list);
                }
            }
            int src = sc.nextInt();
            shortTheThing(vertices_dic, src);
        }
	}
	public static ArrayList<Integer> shortTheThing(Hashtable<Integer, List<Integer>> dic, int src) {
		
	}
}