package ArrayandString;

public class LongestSubstringwithoutRepeating {
    public int lengthOfLongestSubstring(String s) {
        if (s.length() == 0) return 0;
        String maxString = "" + s.charAt(0);
        for (int i = 0; i < s.length()-1; i++) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(s.charAt(i));
            for (int j = i+1; j < s.length(); j++) {
                if (stringBuilder.toString().indexOf(s.charAt(j)) == -1){
                    stringBuilder.append(s.charAt(j));
                    if (stringBuilder.toString().length() > maxString.length()) {
                        maxString = stringBuilder.toString();
                    }
                }
                else {
                    break;
                }
            }
        }
        return maxString.length();
    }
}
