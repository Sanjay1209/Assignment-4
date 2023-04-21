
// 1. WAP to remove Duplicates from a String.(Take any String EX with duplicates character)

import java.util.Scanner;

public class Q1 {

    public static void main(String[] args) {
    	Scanner scanner = new Scanner(System.in);
    	System.out.print("Enter a String with duplicates :");
        String str = scanner.nextLine();
        String result = removeDuplicates(str);
        System.out.println(result); 
        scanner.close();
    }

    public static String removeDuplicates(String str) {

        char[] chars = str.toCharArray();
        int length = chars.length;

        for (int i = 0; i < length; i++) {
            for (int j = i + 1; j < length; j++) {
                if (chars[i] == chars[j]) {
                    int temp = j;

                    for (int k = temp + 1; k < length; k++) {
                        chars[temp] = chars[k];
                        temp++;
                    }
                    length--;
                    j--;
                }
            }
        }

        return new String(chars).substring(0, length);
    }
}