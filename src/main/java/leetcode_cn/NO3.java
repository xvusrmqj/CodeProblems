package leetcode_cn;

import java.util.HashSet;

/**
 * [无重复字符的最长子串]
 * 给定一个字符串，请你找出其中不含有重复字符的 最长子串 的长度。
 * <p>
 * 示例 1:
 * <p>
 * 输入: "abcabcbb"
 * 输出: 3
 * 解释: 因为无重复字符的最长子串是 "abc"，所以其长度为 3。
 * 示例 2:
 * <p>
 * 输入: "bbbbb"
 * 输出: 1
 * 解释: 因为无重复字符的最长子串是 "b"，所以其长度为 1。
 * 示例 3:
 * <p>
 * 输入: "pwwkew"
 * 输出: 3
 * 解释: 因为无重复字符的最长子串是 "wke"，所以其长度为 3。
 * 请注意，你的答案必须是 子串 的长度，"pwke" 是一个子序列，不是子串。
 */
public class NO3 {
    private int lengthOfLongestSubstring(String s) {
        int n = s.length();
        HashSet<Character> set = new HashSet<>(n);
        int maxLen = 0, i = 0, j = 0;
        while (i <= n && j <= n) {
            if (!set.contains(s.charAt(j))) {
                set.add(s.charAt(j++));
                maxLen = Math.max(maxLen, set.size());
            } else {
                set.remove(s.charAt(i++));
            }
        }
        return maxLen;
    }
}
/**
 * 总结：
 * 这题说明了一些问题，
 * 1. 如果没有思路，最开始可以用暴力法的思路（但是不要写出来，浪费时间），再去优化暴力法（如有哪些地方重复计算了）。
 * 2. 滑动窗口可以算一个比较常用的抽象了，记住它。它使用索引i,j指向数组的两端。最开始固定一端。注意不要两端一起滑，一定是只有一个滑动（单一变量原则）。
 * 3. while相比for来说更加灵活。不要所有的都用for。
 * 4. Set是一个比较好的去重的选择。
 */