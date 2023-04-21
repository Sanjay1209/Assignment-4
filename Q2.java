// 2. WAP to print Duplicates characters from the String.
 import java.util.Scanner;

public class Q2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = scanner.nextLine();
        scanner.close();
        
        System.out.print("Duplicate characters in the string are: ");
        
        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    System.out.print(str.charAt(i) + " ");
                    break;
                }
            }
        }
    }
}