import java.io.*;
import java.util.*;

public class TobogganTrajectory1 {
	public static void main(String[] args) throws IOException {
		Scanner in = new Scanner(new File("input3"));
		int counter = 0;
		int x = 1;
		String k = "";	

		while (in.hasNextLine()) {
			k = in.nextLine();
			if (x > k.length()) {
				x = x - k.length();
			}

			if (k.charAt(x - 1) == '#') {
				counter++;
			}
			x += 3;
		}
		System.out.println(k.length());
		System.out.println(counter);
	}
}