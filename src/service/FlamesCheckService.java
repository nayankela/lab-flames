package service;

// Create a class called FlamesCheckService
// FlamesCheckService has a method findFlames to find the flames between two names
// char findFlames(String name1, String name2) takes two strings as arguments
// Your task is to calculate the flames value and return the corresponding character as output 
// You must return only the following values ['f','l','a','m','e','s']
// change the return value at the end of the method corresponding to your return value

public class FlamesCheckService {

	public char findFlames(String name1, String name2) {

		int len1 = name1.length();
		int len2 = name2.length();
		char str1[] = name1.toCharArray();
		char str2[] = name2.toCharArray();
		String flm = "flames";
		for (int i = 0; i < len1; i++) {
			for (int j = 0; j < len2; j++) {
				if (str1[i] == str2[j]) {
					str1[i] = '*';
					str2[j] = '*';
					break;
				}
			}
		}
		String tname = new String(str1);
		tname = tname + (new String(str2));
		tname = tname.replace("*", "");
		int num = 0, unmatchedWords = 0;
		unmatchedWords = tname.length();
		System.out.println("Umatched Words are:- "+unmatchedWords);

		for (int s = 6; s >= 2; s--) {
			if (unmatchedWords > s) {
				num = unmatchedWords - s;
			} else {
				num = unmatchedWords;
			}
			while (num > s) {
				num = num - s;
			}
			flm = flm.substring(num, flm.length()) + (flm.substring(0, num - 1));
		}
		System.out.println("Your Name:\n" + name1 + "\nYour Crush Name:\n" + name2 + "\nYour Result:\n" + flm.charAt(0));
		return flm.charAt(0);
	}
}
