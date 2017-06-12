/*
You are given a block of text with different words. These words are separated by white-spaces and punctuation marks. 
Numbers are not considered words in this mission (a mix of letters and digits is not a word either). 
You should count the number of words (striped words) where the vowels with consonants are alternating, 
that is; words that you count cannot have two consecutive vowels or consonants. 
The words consisting of a single letter are not striped -- do not count those. 
Casing is not significant for this mission. Here "y" is also a vowel.

Example 1: "My name is ..." = 3
Example 2: "Hello world" = 0
Example 3: "A quantity of striped words." = 1
Example 4: "Dog, cat, mouse, bird. Human." = 3	

*/
import java.util.*;
public class Stripped{
	public static void main(String[] args) {
		String input;
		String vowels = "aeiouyAEIOUY";
		int count = 0, temp = 0;
		Scanner sc = new Scanner(System.in);
		input = sc.nextLine();
		StringTokenizer st = new StringTokenizer(input, " , . \"");
		while(st.hasMoreTokens()) {
			String token = st.nextToken();
			temp = 0;
			if (token.length() > 1) {
				for (int i = 0; i < token.length(); i++) {
					if(i < token.length()-1 && vowels.contains(String.valueOf(token.charAt(i)))) { // checks werher the character is vowel or not
						if(!vowels.contains(String.valueOf(token.charAt(i+1)))){ // checks the next character is consonant or not
							temp = temp + 1;
						}
					} else if (i < token.length()-1 && (!vowels.contains(String.valueOf(token.charAt(i))))) { // checks for consonant
						if( vowels.contains(String.valueOf(token.charAt(i+1)))) { // checks the next char for vowel
							temp = temp + 1;
						}
					}
				}
				if (temp == token.length() - 1) {
					count++;
				}
			}
		}
		System.out.println("the total Stripped words are :" +count); 
	}
}