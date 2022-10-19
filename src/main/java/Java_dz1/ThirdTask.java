package Java_dz1;

class ThirdTask {
        public String reverseWords(String s) {
            String str = "";
            int m = 0;
            while (s.charAt(m) == ' ') m++;
            for (int i = s.length()-1; i > 0; i--) {
                if (s.charAt(i) != ' ') {
                    int k = i + 1;
                    while ((s.charAt(i) != ' ') && (i > m)) i--;
                    if (i != m) str = str + s.substring(i+1, k) + ' ';
                    else str = str + s.substring(i, k);
                }
            }
            if (s.length() > 2) {
                if ((s.charAt(0) != ' ') && (s.charAt(1) == ' ')) str = str + s.charAt(0);
            }
            else str = str + s.charAt(0);
            return str;
        }
}
