import java.util.*;

public class LCM_Prob1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();sc.nextLine();
		Hashtable<String, Integer> scores = new Hashtable();
		scores.put("Sally", 0); scores.put("Darrell", 0);
		int answer = 0, loop = 0;
		String question = "";
		String ques_user = "";
		String firstPlayer = "", secondPlayer = "";
		boolean invalid_flag = false;
		while (loop < t) {
			String input = sc.nextLine().trim();
			String[] input_arr = input.split(" ");
			
			// System.out.println(Arrays.toString(input_arr));

			if (input_arr.length == 2) {
				if (input_arr[0].equals("Sally") || input_arr[0].equals("Darrell")) {
					if (loop==0){
						firstPlayer = input_arr[0];
					}
					ques_user = input_arr[0];
					question = input_arr[1];
					String[] que = input_arr[1].split(",");
					int[] int_arr = new int[que.length];
					for (int i = 0; i < que.length; i ++) {
						int_arr[i] = Integer.parseInt(que[i]);
					}
					answer = lcm_arr(int_arr, int_arr.length);
					// System.out.println("answer is :  "+answer);	
				}
			} else if (input_arr.length == 3) {
				// System.out.println("check");
				if (input_arr[0].equals("A")) {
					// System.out.println("innnnnn");
					String player2 = input_arr[1];
					if (loop==1){
						secondPlayer = player2;
					}
					if (input_arr[2].equals("PASS")){
						System.out.println(ques_user+"'s question is: "+question);
						System.out.println("Question is PASSed\nAnswer is: "+ answer);
						System.out.println(player2+": "+scores.get(player2)+"points");
					} else {
						// System.out.println("yaaaaar");
						int player_ans = Integer.parseInt(input_arr[2]);
						// System.out.println("player ans is : "+ player_ans+"answww"+ answer);
						if (player_ans == answer) {
							scores.put(player2,scores.get(player2)+10);
							System.out.println(ques_user+"'s question is: "+question);
							System.out.println("Correct Answer");
							System.out.println(player2+": "+scores.get(player2)+"points");
						} else {
							System.out.println(ques_user+"'s question is: "+question);
							System.out.println("Wrong Answer");
							System.out.println(player2+": "+scores.get(player2)+"points");
						}
					}
				}
			} else {
				invalid_flag = true;
				break;
			}
			
			loop++;
		}
		if (invalid_flag == false) {
				System.out.println("Total Points:\n"+firstPlayer+": "
					+scores.get(firstPlayer)+"points\n"+
					secondPlayer+": "+scores.get(secondPlayer)+"points");
				if(scores.get(firstPlayer) == scores.get(secondPlayer)) {
					System.out.print("Game Result: Draw");
				} else if (scores.get(firstPlayer) > scores.get(secondPlayer)) {
					System.out.print("Game Result: "+firstPlayer+" is winner");
				} else if (scores.get(firstPlayer) < scores.get(secondPlayer)) {
					System.out.print("Game Result: "+secondPlayer+" is winner");
				}
			} else {
				System.out.print("Invalid Input");
			}
	}
	static int lcm_arr(int[] input, int size) {
		int i;
		int temp[] = new int[size-1];
		if (size == 2) {
			return lcm(input[0], input[1]);
		} else {
			for (i = 0; i < size-1; i ++) {
				temp[i] = input[i];
			}
			temp[size-2] = lcm(input[size-2], input[size-1]);
			return lcm_arr(temp, size-1);
		}
	}
	static int gcd(int a, int b) {
		if (a == b) {
			return a;
		}
		if (a > b) {
			return gcd(a-b,b);
		}
		return gcd(a,b-a);
	}
	static int lcm(int a, int b) {
		return (a*b)/gcd(a,b);
	}
}

/*
4
Sally 3,5
A Darrell 15
Darrell 4,8
A Sally 8

4
Sally 3,5
A Darrell 15
Darrell
A Sally 15 

2
Sally 3,5
A Darrell 3

2
Sally 3,5,15
A Darrell 15

4
Sally 3,5
A Darrell 15
Darrell
A Sally 15 

*/

