package Algorithm.ContinuousNotSameStr;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * @Author: jow
 * @Date: 2019/3/14 23:06
 * @Description
 * @Version 1.0
 */
public class StringOfNotSame {
    public int lengthOfLongestSubstring(String s) {
        if (s.length() == 0) return 0;
        int result = 1;
        char [] arr = s.toCharArray();
        int start = 0;
        int end = 0;
        for (int i = 1; i < s.length(); i++) {
//            带头不带尾的substring
            String str = s.substring(start,end + 1);
            int index = str.indexOf(s.charAt(i));
            if(index < 0){
                end ++;
            }else{
                if (result <= end - start + 1) {
                    result = end - start + 1;
                }
//                只要重复都要重置 end 和start
                end ++;
                start = start + index + 1;
            }
        }
//        直接结束的要判断
        if (result < end - start + 1) result = end - start + 1;
        return result;
    }

    public int im1(String s){
        int n = s.length();
        Set<Character> set = new HashSet<>();
        int ans = 0, i = 0, j = 0;
        while (i < n && j < n) {
            // try to extend the range [i, j]
            if (!set.contains(s.charAt(j))){
                set.add(s.charAt(j++));
                ans = Math.max(ans, j - i);
            }
            else {
                set.remove(s.charAt(i++));
            }
        }
        return ans;
    }

    public int im2(String s) {
        int n = s.length(), ans = 0;
        Map<Character, Integer> map = new HashMap<>(); // current index of character
        // try to extend the range [i, j]
        for (int j = 0, i = 0; j < n; j++) {
            if (map.containsKey(s.charAt(j))) {
                i = Math.max(map.get(s.charAt(j)), i);
            }
            ans = Math.max(ans, j - i + 1);
            map.put(s.charAt(j), j + 1);
        }
        return ans;
    }

    public int im3(String s) {
        int n = s.length(), ans = 0;
        int[] index = new int[128]; // current index of character
        // try to extend the range [i, j]
        for (int j = 0, i = 0; j < n; j++) {
            i = Math.max(index[s.charAt(j)], i);
            ans = Math.max(ans, j - i + 1);
            index[s.charAt(j)] = j + 1;
        }
        return ans;
    }

/*
* int [26] 用于字母 ‘a’ - ‘z’或 ‘A’ - ‘Z’
int [128] 用于ASCII码
int [256] 用于扩展ASCII码
*/
}
