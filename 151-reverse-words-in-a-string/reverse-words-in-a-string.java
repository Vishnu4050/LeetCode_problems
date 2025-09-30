class Solution {
    public String reverseWords(String s) {
        // Step 1: use StringBuilder to reverse the whole string  
        StringBuilder sb = new StringBuilder(s);
        sb.reverse();

        // Step 2: reverse each word in this reversed string
        reverseEachWord(sb);

        // Step 3: clean up spaces — trim extra spaces, collapse multiple spaces into one
        return cleanSpaces(sb);
    }

    // Reverse substrings corresponding to words in sb
    private void reverseEachWord(StringBuilder sb) {
        int n = sb.length();
        int i = 0, j = 0;

        while (i < n) {
            // skip spaces to find start of a word
            while (i < n && sb.charAt(i) == ' ') {
                i++;
            }
            // j moves to the end of this word (or to next space)
            j = i;
            while (j < n && sb.charAt(j) != ' ') {
                j++;
            }
            // now [i, j-1] is a word, reverse it
            reverse(sb, i, j - 1);

            // move i forward for next iteration
            i = j;
        }
    }

    // Reverse characters in sb between indices l and r inclusive
    private void reverse(StringBuilder sb, int l, int r) {
        while (l < r) {
            char tmp = sb.charAt(l);
            sb.setCharAt(l, sb.charAt(r));
            sb.setCharAt(r, tmp);
            l++;
            r--;
        }
    }

    // Remove extra spaces (leading, trailing, and multiple in between)
    private String cleanSpaces(StringBuilder sb) {
        int n = sb.length();
        int i = 0, j = 0;

        while (j < n) {
            // skip spaces
            while (j < n && sb.charAt(j) == ' ') {
                j++;
            }
            // copy non-space characters
            while (j < n && sb.charAt(j) != ' ') {
                sb.setCharAt(i, sb.charAt(j));
                i++;
                j++;
            }
            // skip spaces again between words
            while (j < n && sb.charAt(j) == ' ') {
                j++;
            }
            // if there are more words ahead, put a single space
            if (j < n) {
                sb.setCharAt(i, ' ');
                i++;
            }
        }

        return sb.substring(0, i);
    }
}
