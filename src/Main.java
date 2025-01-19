public class Main {
    public static void main(String[] args) {
        System.out.println(isPalindrome("a"));
        System.out.println(isPalindrome("potop"));
        System.out.println(isPalindrome("ab"));
        System.out.println(isPalindrome("aba"));
        System.out.println(isPalindrome("abac"));
    }

    public static boolean isPalindrome(String word) {
        int cursorLeft = 0;
        int cursorRight = word.length() - 1;

        while (cursorLeft <= cursorRight) {
            if (word.charAt(cursorLeft) != word.charAt(cursorRight)) {
                return false;
            }

            cursorLeft++;
            cursorRight--;
        }

        return true;
    }
}