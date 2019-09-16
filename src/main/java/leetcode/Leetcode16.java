package leetcode;

import com.sun.xml.internal.bind.v2.runtime.unmarshaller.XsiNilLoader;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * @author : 夕
 * @date : 2019/9/16
 */
public class Leetcode16 {

    /**
     *给定一个包括 n 个整数的数组 nums 和 一个目标值 target。找出 nums 中的三个整数，使得它们的和与 target 最接近。返回这三个数的和。假定每组输入只存在唯一答案。
     *
     * 例如，给定数组 nums = [-1，2，1，-4], 和 target = 1.
     *
     * 与 target 最接近的三个数的和为 2. (-1 + 2 + 1 = 2).
     *
     * 来源：力扣（LeetCode）
     * 链接：https://leetcode-cn.com/problems/3sum-closest
     * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
     */

    /**
     * 1.首先对数组进行排序，时间复杂度O(nlogn)
     * 2.然后将前三个数作为初始结果，接着不断进行下标后移，找出最接近的数值，
     * 因为是三个数的和，所以第二个数为start，第三个为end
     */
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int result = nums[0] +nums[1] + nums[2];
        for(int i = 0;i<nums.length;i++){
            int start = i + 1;
            int end = nums.length - 1;
            while (start < end){
                int sum = nums[start] + nums[end] + nums[i];
                if(Math.abs(target - sum) < Math.abs(target - result)){
                    result = sum;
                }
                if(sum > target){
                    end--;
                } else  if(sum < target){
                    start++;
                }else {
                    return result;
                }
            }
        }
        return result;
    }

}
