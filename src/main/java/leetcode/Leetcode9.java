package leetcode;

/**
 * @author : 夕
 * @date : 2019/9/5
 */
public class Leetcode9 {

    /**
     * 判断一个整数是否是回文数。回文数是指正序（从左向右）和倒序（从右向左）读都是一样的整数。
     *
     * 示例 1:
     *
     * 输入: 121
     * 输出: true
     * 示例 2:
     *
     * 输入: -121
     * 输出: false
     * 解释: 从左向右读, 为 -121 。 从右向左读, 为 121- 。因此它不是一个回文数。
     * 示例 3:
     *
     * 输入: 10
     * 输出: false
     * 解释: 从右向左读, 为 01 。因此它不是一个回文数。
     *
     * 来源：力扣（LeetCode）
     * 链接：https://leetcode-cn.com/problems/palindrome-number
     * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
     */

    /**
     * 如果数值为负数，则一定不相等，直接返回false
     * 如果为正数，将此数通过倒序后，与原数比较，返回结果
     */
    public boolean isPalindrome(int x) {
        if(x < 0){
            return false;
        }
        int src = x;
        int newNum = 0;
        while (x != 0){
            newNum = newNum*10 + x%10;
            x /= 10;
        }
        return src == newNum;
    }
}
