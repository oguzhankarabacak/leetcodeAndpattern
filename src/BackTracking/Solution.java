package BackTracking;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {
    public List<String> letterCombinations(String digits) {
        if (digits == null || digits.length() == 0) return new ArrayList<>();

        Map<Character, String> phoneMap = new HashMap<>();
        phoneMap.put('2', "abc");
        phoneMap.put('3', "def");
        phoneMap.put('4', "ghi");
        phoneMap.put('5', "jkl");
        phoneMap.put('6', "mno");
        phoneMap.put('7', "pqrs");
        phoneMap.put('8', "tuv");
        phoneMap.put('9', "wxyz");

        List<String> result = new ArrayList<>();

        backtrack(digits, 0 , new StringBuilder(), result, phoneMap);
        return result;
    }
    private void backtrack(String digits, int index, StringBuilder currentCombination,List<String> result, Map<Character, String> phoneMap) {
        if (index == digits.length()) {
            result.add(currentCombination.toString());
            return;
        }

        // Şu anki rakamı al
        char currentDigit = digits.charAt(index);

        // Bu rakama karşılık gelen harfleri al
        String letters = phoneMap.get(currentDigit);

        // Harfleri tek tek deneyip backtrack fonksiyonunu çağır
        for (char letter : letters.toCharArray()) {
            currentCombination.append(letter);  // Harfi ekle
            backtrack(digits, index + 1, currentCombination, result, phoneMap);  // Sonraki rakama geç
            currentCombination.deleteCharAt(currentCombination.length() - 1);  // Geriye dön, son harfi çıkar
        }
    }
    public static void main(String[] args) {
        Solution solution = new Solution();
        String digits = "23";
        List<String> combinations = solution.letterCombinations(digits);
        System.out.println(combinations);
    }
}
