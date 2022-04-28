//package cn;
////n 皇后问题 研究的是如何将 n 个皇后放置在 n × n 的棋盘上，并且使皇后彼此之间不能相互攻击。
////
//// 给你一个整数 n ，返回 n 皇后问题 不同的解决方案的数量。
////
////
////
////
////
//// 示例 1：
////
////
////输入：n = 4
////输出：2
////解释：如上图所示，4 皇后问题存在两个不同的解法。
////
////
//// 示例 2：
////
////
////输入：n = 1
////输出：1
////
////
////
////
//// 提示：
////
////
//// 1 <= n <= 9
////
////
////
//// Related Topics 回溯 👍 357 👎 0
//
//import java.util.HashSet;
//import java.util.Set;
//
////leetcode submit region begin(Prohibit modification and deletion)
//public class Solution {
//
//    int solution = 0;
//
//    public int totalNQueens(int n) {
//        backTrace(new HashSet<>(n),new HashSet<>(n),new HashSet<>(n),0, n);
//        return solution;
//    }
//
//    /**
//     * 回溯法
//     *
//     * @param attackY           能攻击的Y轴
//     * @param attackIncrOffset  能攻击的递增函数 offset
//     * @param attackDecrOffset  能攻击的递减函数 offset
//     * @param x
//     * @param n
//     */
//    public void backTrace(Set<Integer> attackY, Set<Integer> attackIncrOffset, Set<Integer> attackDecrOffset, int x, int n) {
//        if (x == n) {
//            // 找到一个解决方案
//            solution++;
//            return;
//        }
//        for (int y = 0; y < n; y++) {
//            // 遍历一行的点
//            // 判断能否放皇后，不能放则不处理
//            if (attackY.contains(y) || attackIncrOffset.contains(y-x) || attackDecrOffset.contains(y+x)) {
//                continue;
//            }
//            // 选择该点做皇后
//            attackY.add(y);
//            attackIncrOffset.add(y-x);
//            attackDecrOffset.add(y+x);
//            // 回溯，看下一行如何处理
//            // cantAttack判断和x+1都属于剪枝处理，每行只能放一个皇后，本行这列放了，后面的列都不用看了，直接跳到下行处理
//            backTrace(attackY, attackIncrOffset, attackDecrOffset, x + 1, n);
//            // 取消选择该点做皇后，看有没有别的解法
//            attackY.remove(y);
//            attackIncrOffset.remove(y-x);
//            attackDecrOffset.remove(y+x);
//        }
//    }
//}
////leetcode submit region end(Prohibit modification and deletion)
