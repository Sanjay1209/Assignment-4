// 8. WAP to find the maximum occurring character in a String
   import java.util.Scanner;

public class Q8 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = scanner.nextLine();
        int[] freq = new int[256];

        int maxFreq = 0;
        char maxChar = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            freq[ch]++;
            if (freq[ch] > maxFreq) {
                maxFreq = freq[ch];
                maxChar = ch;
            }
        }
        System.out.println("The maximum occurring character in the string is '" + maxChar + "' with frequency " + maxFreq);
    }
}