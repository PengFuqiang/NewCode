import java.io.BufferedReader;
import java.io.InputStreamReader;

import java.util.*;

public class Main {
	public static void main(String ...args) throws Exception{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String []strings = bf.readLine().split(" ");
		Arrays.sort(strings, new Comparator<String>() {
			@Override
			public int compare(String arg0, String arg1) {
				String s1 = arg0 + arg1;
				String s2 = arg1 + arg0;
				return s2.compareTo(s1);
			}
		});
		StringBuffer sb = new StringBuffer();
		for(int i = 0;i < strings.length;i++) {
			sb.append(strings[i]);
		}
		System.out.print(sb);
		
	}
	
	public static int getMaxLen(String str) {
		if (str == null || str.equals("")) {
			return 0;
		}
		char[] charArr = str.toCharArray();
		int max = 0;
		int len = 0;
		for (int i = 0; i < str.length(); i++) {
			for (int j = 0; i - j >= 0 && i + j < str.length(); j++) {
				if (charArr[i +j] != charArr[i - j]) {
					break;
				}
				len = 2*j + 1;
				
			}
			max = max > len ? max : len;
			for (int j = 0; i - j >= 0 && i + j < str.length(); j++) {
				if (charArr[i + j + 1] != charArr[i - j]) {
					break;
				}
				len = 2 * j + 2;
				
			}
			max =max > len ? max : len;
		}
		return max;
	}
}