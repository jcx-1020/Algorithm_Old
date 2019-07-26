package leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * 给定一个字符串，请你找出其中不含有重复字符的 最长子串 的长度。
 * <p>
 * 示例 1:
 * 输入: "abcabcbb"
 * 输出: 3
 * 解释: 因为无重复字符的最长子串是 "abc"，所以其长度为 3。
 * 示例 2:
 * 输入: "bbbbb"
 * 输出: 1
 * 解释: 因为无重复字符的最长子串是 "b"，所以其长度为 1。
 * 示例 3:
 * 输入: "pwwkew"
 * 输出: 3
 * 解释: 因为无重复字符的最长子串是 "wke"，所以其长度为 3。
 */
public class LongestSubstringWithoutRepeatingCharacters {

    public int lengthOfLongestSubstring(String s) {
        //如果字符串为空返回0
        if (s.length() == 0) {
            return 0;
        }
        //存储字符和下标
        Map<Character, Integer> map = new HashMap<>();
        //最大不重复串长度
        int max = 0;
        //左指针
        int left = 0;
        for (int i = 0; i < s.length(); i++) {
            //如果map中有该字符
            if (map.containsKey(s.charAt(i))) {
                //left和map中该字符的value+1比  取大的
                left = Math.max(left, map.get(s.charAt(i)) + 1);
            }
            //字符和下标存入map中
            map.put(s.charAt(i), i);
            //已存最大不重复串长度 和 当前不重复串长度 比较  取最大
            max = Math.max(max, i - left + 1);
        }
        //返回最大不重复串长度
        return max;
    }
}
