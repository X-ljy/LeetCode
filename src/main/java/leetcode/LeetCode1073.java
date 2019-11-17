package leetcode;

import java.util.Arrays;

/**
 * @author : 夕
 * @date : 2019/10/14
 */
public class LeetCode1073 {

    /**
     * 给出基数为 -2 的两个数 arr1 和 arr2，返回两数相加的结果。
     *
     * 数字以 数组形式 给出：数组由若干 0 和 1 组成，按最高有效位到最低有效位的顺序排列。例如，arr = [1,1,0,1] 表示数字 (-2)^3 + (-2)^2 + (-2)^0 = -3。数组形式 的数字也同样不含前导零：以 arr 为例，这意味着要么 arr == [0]，要么 arr[0] == 1。
     *
     * 返回相同表示形式的 arr1 和 arr2 相加的结果。两数的表示形式为：不含前导零、由若干 0 和 1 组成的数组。
     *
     *  
     *
     * 示例：
     *
     * 输入：arr1 = [1,1,1,1,1], arr2 = [1,0,1]
     * 输出：[1,0,0,0,0]
     * 解释：arr1 表示 11，arr2 表示 5，输出表示 16 。
     *  
     *
     * 提示：
     *
     * 1 <= arr1.length <= 1000
     * 1 <= arr2.length <= 1000
     * arr1 和 arr2 都不含前导零
     * arr1[i] 为 0 或 1
     * arr2[i] 为 0 或 1
     *
     * 来源：力扣（LeetCode）
     * 链接：https://leetcode-cn.com/problems/adding-two-negabinary-numbers
     * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
     */

    public static int[] addNegabinary(int[] arr1, int[] arr2) {
        int n1 = 0;
        int n2 = 0;

        int[] a1 = new int[arr1.length];
        int[] a2 = new int[arr2.length];

        for(int j = 0;j<arr1.length;j++){
            a1[j] = arr1[arr1.length-1-j];
        }

        for(int j = 0;j<arr2.length;j++){
            a2[j] = arr2[arr2.length-1-j];
        }

        for(int i = 0;i<arr1.length;i++){
            n1 = (int) (n1 + a1[i]*Math.pow(-2,i));
        }


        for(int i = 0;i<arr2.length;i++){
            n2 = (int) (n2 + a2[i]*Math.pow(-2,i));
        }

        int n = n1 + n2;


        String s = Integer.toString(n,2);
        System.out.println(s);
        int[] res = new int[s.length()];
        for (int i = 0;i<res.length;i++){
            System.out.println(Integer.parseInt(String.valueOf(s.charAt(i))));
            res[i] = Integer.parseInt(String.valueOf(s.charAt(i)));
        }
        return res;
    }

    public static void main(String[] args) {
        addNegabinary(new int[]{1,1,1,1,1},new int[]{1,0,1,});
    }


}
