package Easy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Strings {
    public void reverseString(char[] s) {
        for (int i = 0; i < s.length / 2; i++) {
            char temp = s[i];
            s[i] = s[s.length - i - 1];
            s[s.length - i -1] = temp;
        }
    }
    public int reverse(int x) {
        List<Integer> digitList = new ArrayList<>();
        int new_x = Math.abs(x);
        while (new_x > 0) {
            digitList.add(new_x % 10);
            new_x /= 10;
        }
        int result = 0;
        for (int i = 0; i < digitList.size(); i++) {
            if (result > Integer.MAX_VALUE / 10) return 0;
            if (result < Integer.MIN_VALUE / 10) return 0;
            result = result * 10 + digitList.get(i);

        }
        if (x < 0) return -1*result;
        return result;
    }
    public int firstUniqChar(String s) {
        Map<Character, Integer> freq = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            int num = freq.getOrDefault(s.charAt(i),0);
            freq.put(s.charAt(i), num + 1);
        }
        for (int i = 0; i < s.length(); i++) {
            if (freq.get(s.charAt(i)) == 1) return i;
        }
        return -1;
    }
    public boolean isAnagram(String s, String t) {
        Map<Character,Integer> freq = new HashMap<>();

        for (char c : s.toCharArray()) {
            freq.put(c, freq.getOrDefault(c, 0) + 1);
        }
        for (char c : t.toCharArray()) {
            freq.put(c, freq.getOrDefault(c, 0) - 1);
            if (freq.get(c) == 0) freq.remove(c);
        }
        return freq.isEmpty();
    }
    public boolean isPalindrome(String s) {
        StringBuilder stringBuilder = new StringBuilder();
        for (char c: s.toCharArray()) {
            if (Character.isLetterOrDigit(c)) stringBuilder.append(String.valueOf(c).toLowerCase());
        }
        String newString = stringBuilder.toString();
        for (int i = 0; i < newString.length(); i++) {
            if (newString.charAt(i) != newString.charAt(newString.length() - i - 1)) return false;
        }
        return true;
    }
    public int myAtoi(String s) {
        // 1. Baştaki boşlukları sil
        s = s.strip();
        if (s.isEmpty()) return 0;

        // 2. İşaret belirleme
        int sign = 1, i = 0, n = s.length();
        if (s.charAt(i) == '-' || s.charAt(i) == '+') {
            sign = (s.charAt(i) == '-') ? -1 : 1;
            i++;
        }

        int number = 0;

        // 3. Rakamları işle
        while (i < n && Character.isDigit(s.charAt(i))) {
            int digit = s.charAt(i) - '0';

            // 4. Overflow kontrolü
            if (number > Integer.MAX_VALUE / 10 ||
                    (number == Integer.MAX_VALUE / 10 && digit > 7)) {
                return (sign == 1) ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }

            // Sayıyı büyüt
            number = number * 10 + digit;
            i++;
        }

        // 5. İşaretle çarpıp döndür
        return number * sign;
    }
    public int strStr(String haystack, String needle) {
        int index = -1;
        for (int i = 0; i < haystack.length() - needle.length() + 1; i++) {
            String substring = haystack.substring(i, i + needle.length());
            if (substring.equals(needle)) return i;
        }
        return index;
    }
    public String longestCommonPrefix(String[] strs) {
        String commonPrefix = strs[0];
        for (int i = 1; i < strs.length; i++) {
            commonPrefix = findCommonPrefix(commonPrefix,strs[i]);
            if (commonPrefix.equals("")) return commonPrefix;
        }
        return commonPrefix;

    }
    public String findCommonPrefix(String str1, String str2) {
        StringBuilder stringBuilder = new StringBuilder();
        int i = 0;
        int j = 0;
        while (i < str1.length() && j < str2.length()) {
            if (str1.charAt(i) == str2.charAt(j)) {
                stringBuilder.append(str1.charAt(i));
                i += 1;
                j += 1;
            }
            else break;

        }
        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        Strings strings = new Strings();

        /*
        int result = strings.reverse(123);
        System.out.println(result);

        int result = strings.firstUniqChar("leetcode");
        System.out.println(result);

        boolean result = strings.isPalindrome("A man, a plan, a canal: Panama");
        System.out.println(result);

        int result = strings.myAtoi("b-042");
        System.out.println(result);
        System.out.println(Integer.MIN_VALUE); */

        /*
        int result = strings.strStr("sadbutsad","sado");
        System.out.println(result); */

        String[] strs = {"acc","aaa","aaba"};
        String result = strings.longestCommonPrefix(strs);
        System.out.println(result);
    }
}
