package leetcode_cn;

import org.junit.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * 给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的 两个整数。
 * 你可以假设每种输入只会对应一个答案。但是，你不能重复利用这个数组中同样的元素。
 * 示例:
 * 给定 nums = [2, 7, 11, 15], target = 9
 * 因为 nums[0] + nums[1] = 2 + 7 = 9
 * 所以返回 [0, 1]
 */
public class NO1 {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }
        for (int i = 0; i < nums.length; i++) {
            int sec = target - nums[i];
            /*这里要注意一点：一个数不能用两遍。这是通过 map.get(sec) != i 来实现的*/
            if (map.containsKey(sec) && map.get(sec) != i) {
                return new int[]{i, map.get(sec)};
            }
        }
        throw new IllegalArgumentException("No two sum solution");
    }

    @Test
    public void test() {
        int[] ints = twoSum(new int[]{3, 2, 4}, 6);
        System.out.println(Arrays.toString(ints));
    }
}
