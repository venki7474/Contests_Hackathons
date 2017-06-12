import java.util.*;
import java.math.*;
public class ProgMainRandm {
	public static void main(String[] args) {
		int i = 0;
		while (i < 10) {
		Random rand = new Random();
		// rand.setSeed(10);
		int rd = rand.nextInt(10);
		System.out.println(rd);
		i++;
		}
	}
}