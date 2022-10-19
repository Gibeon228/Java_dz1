package Java_dz1;

public class FourhlyTask {
        public boolean isPalindrome(String s) {
            int i = 0;
            int j = s.length() - 1;
            while (i < j)
            {
                while ((Character.isLetterOrDigit(s.charAt(i)) == false) && (i < j)) i++;
                while ((Character.isLetterOrDigit(s.charAt(j)) == false) && (j > i)) j--;
                if (Character.toUpperCase(s.charAt(i)) != Character.toUpperCase(s.charAt(j)) && (i < j)) {
                    return false;
                }

                i++;
                j--;

            }
            return true;
        }
}
