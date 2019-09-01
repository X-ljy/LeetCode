package leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * @author : 夕
 * @date : 2019/9/1
 */
public class Leetcode1 {

    /**
     * Given an array of integers, return indices of the two numbers such that they add up to a specific target.
     * You may assume that each input would have exactly one solution, and you may not use the same element twice.
     * Example:
     * Given nums = [2, 7, 11, 15], target = 9,
     * Because nums[0] + nums[1] = 2 + 7 = 9,
     * return [0, 1].
     * ————————————————
     */

    /**
     *方法1.从第一个数开始，用 target-此数 ，得到数值与接下来的数值进行对比，如果有则返回，如果没有；则继续此操作。
     * 使用此种方法，时间复杂度O(n²) ，空间复杂度 O(1)
     *
     * 方法2.设置一个Map,键设置为数值 值设置为下标。
     * 从第一个数1开始，用 target-数1 ，得到 数值2
     * 查看Map中是否有此键，如果有则返回;如果没有，将数1的值作为键，下标作为值 存入Map.
     * 时间复杂度O(n) 空间复杂度O(n)
     */
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<nums.length; i++) {
            if(map.containsKey(target - nums[i])) {
                return new int[]{map.get(target - nums[i]), i};
            }
            map.put(nums[i], i);
        }
        return null;
    }
}
