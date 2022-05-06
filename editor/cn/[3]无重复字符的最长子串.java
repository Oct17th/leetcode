//给定一个字符串 s ，请你找出其中不含有重复字符的 最长子串 的长度。 
//
// 
//
// 示例 1: 
//
// 
//输入: s = "abcabcbb"
//输出: 3 
//解释: 因为无重复字符的最长子串是 "abc"，所以其长度为 3。
// 
//
// 示例 2: 
//
// 
//输入: s = "bbbbb"
//输出: 1
//解释: 因为无重复字符的最长子串是 "b"，所以其长度为 1。
// 
//
// 示例 3: 
//
// 
//输入: s = "pwwkew"
//输出: 3
//解释: 因为无重复字符的最长子串是 "wke"，所以其长度为 3。
//     请注意，你的答案必须是 子串 的长度，"pwke" 是一个子序列，不是子串。
// 
//
// 
//
// 提示： 
//
// 
// 0 <= s.length <= 5 * 10⁴ 
// s 由英文字母、数字、符号和空格组成 
// 
// Related Topics 哈希表 字符串 滑动窗口 👍 7522 👎 0


//leetcode submit region begin(Prohibit modification and deletion)
//class Solution {
//    public int lengthOfLongestSubstring(String s) {
//        if (s == null) {
//            return 0;
//        }
//        if (s.length() <= 1) {
//            return s.length();
//        }
//
//        // 设定两个光标移动，endIdx每向右移动一步，则判断endIdx到startIdx中是否有c，若有则重置startIdx
//        int startIdx = 0;
//        int endIdx = 0;
//        int longestSubstringLength = 0;
//        // 当子串剩余长度比longestSubstringLength小的时候，不需要再算了
//        for (; endIdx < s.length() && s.length() - startIdx > longestSubstringLength; endIdx++) {
//            char c = s.charAt(endIdx);
//            for (int i = endIdx - 1; i >= startIdx; i--) {
//                if (s.charAt(i) == c) {
//                    startIdx = i + 1;
//                    break;
//                }
//            }
//            longestSubstringLength = Math.max(longestSubstringLength, (endIdx - startIdx) + 1);
//        }
//        return longestSubstringLength;
//    }
//}
//leetcode submit region end(Prohibit modification and deletion)
