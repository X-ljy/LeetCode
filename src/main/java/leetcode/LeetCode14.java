package leetcode;

/**
 * @author : 夕
 * @date : 2019/9/6
 */
public class LeetCode14 {
    /**
     * 编写一个函数来查找字符串数组中的最长公共前缀。
     *
     * 如果不存在公共前缀，返回空字符串 ""。
     *
     * 示例 1:
     *
     * 输入: ["flower","flow","flight"]
     * 输出: "fl"
     * 示例 2:
     *
     * 输入: ["dog","racecar","car"]
     * 输出: ""
     * 解释: 输入不存在公共前缀。
     * 说明:
     *
     * 所有输入只包含小写字母 a-z 。
     *
     * 来源：力扣（LeetCode）
     * 链接：https://leetcode-cn.com/problems/longest-common-prefix
     * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
     */

    /**
     * 找出字符串数组中最长公共前缀，需要两两相比较，先找出之间的最大公共部分，
     * 然后在用此公共部分去跟下一个字符串比较。如此反复。
     */
    public String longestCommonPrefix(String[] strs) {
        if(strs.length == 0){
            return "";
        }
        String ans = strs[0];
        for(int i = 1;i<strs.length;i++){
            int j = 0;
            for(;j<ans.length() && j < strs[i].length();j++){
                if(ans.charAt(j) != strs[i].charAt(j)){
                    break;
                }
            }
            ans = ans.substring(0,j);
            if(ans.equals("")){
                return ans;
            }
        }
        return ans;
    }
}
