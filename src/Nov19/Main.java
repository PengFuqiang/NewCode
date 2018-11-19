package Nov19;

import java.util.Scanner;

public class Main {
	public static void mian(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()) {
			StringBuilder sb = new StringBuilder();
			sb.append(sc.next());
			int cnt = sc.nextInt();
			
			for(int i = 0;i < cnt;i++) {
                int j = 0;
                while(j + 1< sb.length() && sb.charAt(j) >= sb.charAt(j+1)) {
                    j++;
                }
                sb.deleteCharAt(j);
            }
			System.out.println(sb.toString());
		}
	}

}
