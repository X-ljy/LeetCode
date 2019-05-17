package DataStructure;

import java.util.ArrayList;
import java.util.List;

/**
 * 题目详述
 *
 * 给定一个整数数组 a，其中1 ≤ a[i] ≤ n （n为数组长度）, 其中有些元素出现两次而其他元素出现一次。
 * 找到所有出现两次的元素。
 * 你可以不用到任何额外空间并在O(n)时间复杂度内解决这个问题吗？
 * 示例：
 * 输入:
 * [4,3,2,7,8,2,3,1]
 * 输出:
 * [2,3]
 *
 *
 */

/**
 * 思路：
 * 由于原数组nums中元素的取值范围是（1到n），所以可以new出一个大小为n+1的数组array，
 * 遍历原数组nums，使用array记录nums中每个元素值出现的次数,如果nums某个元素值为5那么array[5]加一，以此类推（nums元素值为array数组的下标）
 * 再一次遍历数组array判断哪个下标上存储的次数值大于2，则将此值加入到result。
 */

public class leetcode442 {

   private static List<Integer> findDuplicates(int[] nums) {
                int n = nums.length;
                int [] array = new int[n+1];
                List<Integer> result = new ArrayList<Integer>();
                for(int i=0;i<nums.length;i++) {
                    array[nums[i]] += 1;
                }
                for(int i=1;i<array.length;i++)
                   {
                        if(array[i] > 1) {
                            result.add(i);
                        }
                }
                return result;
      }
    public static void main(String[] args) {

       int[] nums = {4,3,2,7,8,2,3,1};
        System.out.println(findDuplicates(nums));

    }
}
