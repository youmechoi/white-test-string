package Stringedit;

import java.util.Scanner;

public class Stringedit {

	static int[] charFreq(String str1) {
		str1 = str1.toLowerCase();
		int freq[] = new int[26];
		for (int a = 0, c = 97; a < 26; a++, c++) { 
			for (int j = 0; j < str1.length(); j++) {
				char ch = str1.charAt(j);
				if (ch == c)
					freq[a]++;
			}
		}
		return freq;
	}

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a String : ");
		String str1 = scan.nextLine();
		String str2 = "";
		String[] array = str1.split(" ");

		for (int i = array.length - 1; i > -1; i--) {
			str2 += array[i] + " ";
		}

		System.out.println(str2);

		str1 = str1.replaceAll(" ", "");
		System.out.println("total: " + str1.length());

		int freq[] = charFreq(str1);
		for (int i = 0, c = 97; i < 26; i++, c++) {
			if (freq[i] != 0) {
				char ch = (char) c;

				System.out.println(ch + ": " + freq[i]);

			}
			scan.close();

		}

	}

}
