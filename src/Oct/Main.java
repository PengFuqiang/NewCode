//package Oct;
//
//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//
//
//public class Main {
//	public static void mained(String[] args) throws IOException {
//		BufferedReader brs = new BufferedReader(new InputStreamReader(System.in));
//		String inputString = brs.readLine();
//		String[] numbers = inputString.split(" ");
//		for (int i = numbers.length - 1; i >= 0; i--) {
//			if (i == 0) {
//				System.out.print(numbers[i]);
//				
//			} else {
//				System.out.print(numbers[i] + " ");
//			}
//		}
//	}
//
//}

package Oct;

import java.util.Scanner;

//继MIUI8推出手机分身功能之后，MIUI9计划推出一个电话号码分身的功能：首先将电话号码中的每个数字加上8取个位，
//然后使用对应的大写字母代替 （"ZERO", "ONE", "TWO", "THREE", "FOUR", "FIVE", "SIX", "SEVEN", "EIGHT", "NINE"）， 
//然后随机打乱这些字母，所生成的字符串即为电话号码对应的分身。
//输入描述:
//第一行是一个整数T（1 ≤ T ≤ 100)表示测试样例数；接下来T行，每行给定一个分身后的电话号码的分身（长度在3到10000之间）。
//输出描述:
//输出T行，分别对应输入中每行字符串对应的分身前的最小电话号码（允许前导0）。

/*
 * 
4
EIGHT
ZEROTWOONE
OHWETENRTEO
OHEWTIEGTHENRTEO
 */

public class Main {
	public static void handle(String str) {
		str = str.toLowerCase();
		int[] hash = new int[10];
		StringBuffer sb = new StringBuffer(str);
		while (sb.toString().contains("z")) {
			hash[2]++;
			sb.deleteCharAt(sb.indexOf("z"));
			sb.deleteCharAt(sb.indexOf("e"));
			sb.deleteCharAt(sb.indexOf("r"));
			sb.deleteCharAt(sb.indexOf("o"));
		}
		while (sb.toString().contains("x")) {
			hash[8]++;
			sb.deleteCharAt(sb.indexOf("s"));
			sb.deleteCharAt(sb.indexOf("i"));
			sb.deleteCharAt(sb.indexOf("x"));
		}
		while (sb.toString().contains("s")) {
			hash[9]++;
			sb.deleteCharAt(sb.indexOf("s"));
			sb.deleteCharAt(sb.indexOf("e"));
			sb.deleteCharAt(sb.indexOf("v"));
			sb.deleteCharAt(sb.indexOf("e"));
			sb.deleteCharAt(sb.indexOf("n"));
		}
		while (sb.toString().contains("u")) {
			hash[6]++;
			sb.deleteCharAt(sb.indexOf("f"));
			sb.deleteCharAt(sb.indexOf("o"));
			sb.deleteCharAt(sb.indexOf("u"));
			sb.deleteCharAt(sb.indexOf("r"));
		}
		while(sb.toString().contains("f")) {
			hash[7]++;
			sb.deleteCharAt(sb.indexOf("f"));
			sb.deleteCharAt(sb.indexOf("i"));
			sb.deleteCharAt(sb.indexOf("v"));
			sb.deleteCharAt(sb.indexOf("e"));
		}
		while (sb.toString().contains("g")) {
			hash[0]++;
			sb.deleteCharAt(sb.indexOf("e"));
			sb.deleteCharAt(sb.indexOf("i"));
			sb.deleteCharAt(sb.indexOf("g"));
			sb.deleteCharAt(sb.indexOf("h"));
			sb.deleteCharAt(sb.indexOf("t"));
		}
		while (sb.toString().contains("w")) {
			hash[4]++;
			sb.deleteCharAt(sb.indexOf("t"));
			sb.deleteCharAt(sb.indexOf("w"));
			sb.deleteCharAt(sb.indexOf("o"));
		}
		while (sb.toString().contains("h") && !sb.toString().contains("g")) {
			hash[5]++;
			sb.deleteCharAt(sb.indexOf("t"));
			sb.deleteCharAt(sb.indexOf("h"));
			sb.deleteCharAt(sb.indexOf("r"));
			sb.deleteCharAt(sb.indexOf("e"));
			sb.deleteCharAt(sb.indexOf("e"));
		}
		while (sb.toString().contains("o") && !sb.toString().contains("z")) {
			hash[3]++;
			sb.deleteCharAt(sb.indexOf("o"));
			sb.deleteCharAt(sb.indexOf("n"));
			sb.deleteCharAt(sb.indexOf("e"));
		}
		while (sb.toString().contains("n")) {
			hash[1]++;
			sb.deleteCharAt(sb.indexOf("n"));
			sb.deleteCharAt(sb.indexOf("i"));
			sb.deleteCharAt(sb.indexOf("n"));
			sb.deleteCharAt(sb.indexOf("e"));
		}
		for (int i = 0; i < 10; i++) {
			for (int j = 1; j <= hash[i]; j++) {
				System.out.print(i);
			}
		}
		System.out.println();
		
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNextInt()) {
			int n = sc.nextInt();
			for (int i = 0; i < n; i++) {
				System.out.println();
				handle(sc.next());
			}
		}
	}
}






