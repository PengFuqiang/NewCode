package Oct5;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			System.out.println(handle(sc.nextLine()));
		}
	}

	private static int handle(String nextLine) {
		// TODO Auto-generated method stub
		char[] chars = nextLine.toCharArray();
		for (int i = 5; i <= chars.length; i++) {
			for (int j = 0; j < nextLine.length(); j++) {
				StringBuffer buf = new StringBuffer();
				for (int k = j; k < j+i; k++) {
					buf.append(chars[k%nextLine.length()]);
				}
				String subString = buf.toString();
				if (subString.contains("A")
						&& subString.contains("B")
						&& subString.contains("C")
						&& subString.contains("D")
						&& subString.contains("E"))
					return chars.length - subString.length();
			}
		}
		return 0;
	}

}
