package leetcode_cn;

/**
 * 给定两个大小为 m 和 n 的有序数组 nums1 和 nums2。
 * <p>
 * 请你找出这两个有序数组的中位数，并且要求算法的时间复杂度为 O(log(m + n))。
 * <p>
 * 你可以假设 nums1 和 nums2 不会同时为空。
 * <p>
 * 示例 1:
 * <p>
 * nums1 = [1, 3]
 * nums2 = [2]
 * <p>
 * 则中位数是 2.0
 * 示例 2:
 * <p>
 * nums1 = [1, 2]
 * nums2 = [3, 4]
 * <p>
 * 则中位数是 (2 + 3)/2 = 2.5
 */
public class NO4 {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] all = new int[nums1.length + nums2.length];
        int i = 0, j = 0, k = 0;
        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] < nums2[j]) {
                all[k++] = nums1[i++];
            } else {
                all[k++] = nums2[j++];
            }
        }
        while (i < nums1.length) {
            all[k++] = nums1[i++];
        }
        while (j < nums2.length) {
            all[k++] = nums2[j++];
        }
        if (all.length % 2 == 1) {
            return (double) all[all.length / 2];
        } else {
            return (all[all.length / 2 - 1] + all[all.length / 2]) / 2.0;
        }
    }
}
/**
 * 总结：
 * 这道题目比较唬人，写着是困难，又是“中位数”什么的，其实自己一次提交就成功了。
 * 中位数概念：在一组排序的数中，如果个数是奇数，中位数就是中间的那个数，如果是偶数，就是中间的两个数的平均数。
 * 一些解算法基本的东西依然可以在这个解决过程中体现出来：
 * 1. 知道思路后，先写思路，不要具体写的太细，容易陷进去。比如这题先写一个大概，第一个while是比较最大，第二个第三个while是不比较取大，
 * 最后一个if else是中位数概念的表达。
 * 2. 写完思路后具体的把每一个步骤细节补全。
 * 3. 最后统揽一下，看一个边界值，进行最后的修正。
 * 4. 提交，如果有问题，按照这组输入输出debug一下。
 */
