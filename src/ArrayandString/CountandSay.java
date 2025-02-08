package ArrayandString;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class CountandSay {
    public String countAndSay(int n) {
        if (n == 1){
            return "1";
        }
        String result = countAndSay(n-1);
        List<List<Integer>> pairs = this.helper(result);
        return this.convertList2String(pairs);

    }

    public List<List<Integer>> helper(String str) {

        List<List<Integer>> result = new ArrayList<>();
        if (str.length() == 0) return result;
        int count = 0;
        int current = str.charAt(0) - '0';
        int next = current;
        for (int i = 0; i < str.length() - 1; i++) {
            current = str.charAt(i) - '0';
            next = str.charAt(i+1) - '0';
            if (current == next) {
                count += 1;
            }
            if (current != next || i == str.length() - 2){
                List<Integer> map = new ArrayList<>();
                map.add(current);
                map.add(count+1);
                result.add(map);
                count = 0;
            }
        }
        if (((str.charAt(str.length()-1) - '0') != current) || str.length() == 1) {
            List<Integer> map = new ArrayList<>();
            map.add((str.charAt(str.length()-1) - '0'));
            map.add(1);
            result.add(map);
        }
        /*
        else {
            List<Integer> map = result.get(result.size() - 1);
            map.set(0, map.get(1) + 1);
        } */
        return result;

    }
    public String convertList2String(List<List<Integer>> pairs){
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < pairs.size(); i++) {
            String firstNumber = pairs.get(i).get(1).toString();
            String secondNumber = pairs.get(i).get(0).toString();
            stringBuilder.append(firstNumber);
            stringBuilder.append(secondNumber);
        }
        return stringBuilder.toString();
    }

}
