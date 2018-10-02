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

//��MIUI8�Ƴ��ֻ�������֮��MIUI9�ƻ��Ƴ�һ���绰�������Ĺ��ܣ����Ƚ��绰�����е�ÿ�����ּ���8ȡ��λ��
//Ȼ��ʹ�ö�Ӧ�Ĵ�д��ĸ���� ��"ZERO", "ONE", "TWO", "THREE", "FOUR", "FIVE", "SIX", "SEVEN", "EIGHT", "NINE"���� 
//Ȼ�����������Щ��ĸ�������ɵ��ַ�����Ϊ�绰�����Ӧ�ķ���
//��������:
//��һ����һ������T��1 �� T �� 100)��ʾ������������������T�У�ÿ�и���һ�������ĵ绰����ķ���������3��10000֮�䣩��
//�������:
//���T�У��ֱ��Ӧ������ÿ���ַ�����Ӧ�ķ���ǰ����С�绰���루����ǰ��0����

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






