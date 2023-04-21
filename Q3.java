// 3. WAP to check if “2552” is palindrome or not.
public class Q3 {
    public static void main(String[] args) {
        String str = "2552";
        boolean isPalindrome = true;

        for(int i=0; i<str.length()/2; i++) {
            if(str.charAt(i) != str.charAt(str.length()-i-1)) {
                isPalindrome = false;
                break;
            }
        }

        if(isPalindrome) {
            System.out.println(str + " is a palindrome.");
        } else {
            System.out.println(str + " is not a palindrome.");
        }
    }
}