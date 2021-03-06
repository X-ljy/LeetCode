package leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * @author : 夕
 * @date : 2019/9/2
 */
public class Leetcode3 {

    /**
     * 给定一个字符串，请你找出其中不含有重复字符的 最长子串 的长度。
     *
     * 示例 1:
     *
     * 输入: "abcabcbb"
     * 输出: 3
     * 解释: 因为无重复字符的最长子串是 "abc"，所以其长度为 3。
     * 示例 2:
     *
     * 输入: "bbbbb"
     * 输出: 1
     * 解释: 因为无重复字符的最长子串是 "b"，所以其长度为 1。
     * 示例 3:
     *
     * 输入: "pwwkew"
     * 输出: 3
     * 解释: 因为无重复字符的最长子串是 "wke"，所以其长度为 3。
     *      请注意，你的答案必须是 子串 的长度，"pwke" 是一个子序列，不是子串。
     *
     * 来源：力扣（LeetCode）
     * 链接：https://leetcode-cn.com/problems/longest-substring-without-repeating-characters
     * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
     */

    /**
     * 定义一个 map 数据结构存储（k,v）key值为字符，value值字符位置 +1 ，+1 表示从字符位置 后一个才开始不重复
     */
    public int lengthOfLongestSubstring(String s) {
        int n = s.length(), ans = 0;
        Map<Character, Integer> map = new HashMap<>();
        for (int end = 0, start = 0; end < n; end++) {
            char alpha = s.charAt(end);
            //如果map中包含end位置的字符，则重置start
            if (map.containsKey(alpha)) {
                start = Math.max(map.get(alpha), start);
            }
            // 进行比较更新，得到此时最大子串的长度
            ans = Math.max(ans, end - start + 1);
            // 将 end 位置的字符加入map
            map.put(s.charAt(end), end + 1);
        }
        return ans;
    }

}
