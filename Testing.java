public class Testing {
    public static void main(String[] args) {
        lengthOfLongestSubstring("dvdf");
    }
    static public int lengthOfLongestSubstring(String s) {
        int ans = 0;
        int c = 0;
        String subString = "";
        for(int i = 0; i < s.length(); i++) {
            char currChar = s.charAt(i);
            if(subString.contains(String.valueOf(currChar))) {

                c = 0;
                subString = "";
                i--;
            }
            else {
                c += 1;
                if(c > ans) ans = c;
                subString += currChar;
            }
        }
        return ans;
    }
}
