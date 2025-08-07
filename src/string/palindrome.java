package string;
import java.util.*;

public class palindrome {
    public static boolean isPalindromeString(String text) {
        String clean = text.toLowerCase();
        int left = 0, right = clean.length() - 1;
        while (left < right) {
            if (clean.charAt(left) != clean.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String inputStr = scanner.nextLine();
        if (isPalindromeString(inputStr)) {
            System.out.println("It is a palindrome string.");
        } else {
            System.out.println("It is not a palindrome string.");
        }
        scanner.close();
    }
}

