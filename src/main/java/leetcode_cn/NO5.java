package leetcode_cn;

/**
 * 给定一个字符串 s，找到 s 中最长的回文子串。你可以假设 s 的最大长度为 1000。
 * <p>
 * 示例 1：
 * <p>
 * 输入: "babad"
 * 输出: "bab"
 * 注意: "aba" 也是一个有效答案。
 * 示例 2：
 * <p>
 * 输入: "cbbd"
 * 输出: "bb"
 */
public class NO5 {
    /**
     * 未实现
     * @param s
     * @return
     */
    public String longestPalindrome(String s) {
        int i = 0, j=s.length();
        int m = 0, n = s.length();
        while (i<j){
            boolean aequalsb = aequalsb(s);
            if(aequalsb){
                s = s.substring(++i,--j);
            }
            else{
                s = s.substring(++i,j);//右
                s = s.substring(i,--j);//左
            }
        }
        return null;
    }
    public boolean aequalsb(String s){
        return s.charAt(0)==s.charAt(s.length()-1);
    }
}
/**
 * 总结：
 * 本来想使用一个减冶法来实现
 * 暴力法：
 * 由于回文是连续的，所以暴力法显然有优化的空间，是不是有一种类似于“滑动窗口”的算法来实现它？
 * 分治法：
 * 从中间向两边比，最长的回文的轴肯定在中间，如果比较失败，轴要么在左边，要么在右边，这不就是分治法吗？
 * 然而，它并不能将回文以轴为中心分成两段。中间值不是轴，回文最左值在中间值左边，最右值在中间值右边依然存在。
 * 减冶法：
 * 从两边向中间比，以i指向最左边，j指向最右边。相等向下比，i++,j--。不等，分两种情况向下比，i++,j不变; i不变，j--。
 * 想像中这种应该是可以做出来的，然而不等的时候，分两种情况到底要保存哪种？ 这不符合单一变量的原则。
 */
