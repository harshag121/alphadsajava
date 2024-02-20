public class Palindrome {

    public static boolean isPalindrome(String str) {
        // Handle null or empty strings
        if (str == null || str.isEmpty()) {
            return true;
        }

        // Remove non-alphanumeric characters and convert to lowercase for case-insensitivity
        String cleanStr = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        // Two pointer approach for efficient comparison
        int i = 0, j = cleanStr.length() - 1;
        while (i < j) {
            if (cleanStr.charAt(i) != cleanStr.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }

        return true;
    }

    public static void main(String[] args) {
        String[] testStrings = {
                "racecar",
                "hello",
                "madam",
                "A man, a plan, a canal: Panama",
                "Was it a car or a cat I saw?"
        };

        for (String str : testStrings) {
            System.out.println(str + " is palindrome: " + isPalindrome(str));
        }
    }
}
