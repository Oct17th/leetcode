//package cn;
////设计一种算法，打印 N 皇后在 N × N 棋盘上的各种摆法，其中每个皇后都不同行、不同列，也不在对角线上。这里的“对角线”指的是所有的对角线，不只是平分整
////个棋盘的那两条对角线。
////
//// 注意：本题相对原题做了扩展
////
//// 示例:
////
////  输入：4
//// 输出：[[".Q..","...Q","Q...","..Q."],["..Q.","Q...","...Q",".Q.."]]
//// 解释: 4 皇后问题存在如下两个不同的解法。
////[
//// [".Q..",  // 解法 1
////  "...Q",
////  "Q...",
////  "..Q."],
////
//// ["..Q.",  // 解法 2
////  "Q...",
////  "...Q",
////  ".Q.."]
////]
////
//// Related Topics 数组 回溯 👍 141 👎 0
//
//import java.util.ArrayList;
//import java.util.LinkedHashMap;
//import java.util.List;
//import java.util.Map;
//
////leetcode submit region begin(Prohibit modification and deletion)
//class Solution {
//
//    public List<List<String>> solveNQueens(int n) {
//        /**
//         思路：假设一个点x,y上有皇后，则y'=y，x'=x，y'=-x'+(x+y)，y'=x'-(x-y)函数上的都不能放皇后
//         */
//        List<List<String>> solution = new ArrayList<List<String>>();
//        Map<Integer, Integer> choosePoint = new LinkedHashMap<>();
//        backTrace(solution, choosePoint, 0, n);
//        return solution;
//    }
//
//    /**
//     * 回溯法
//     *
//     * @param solution          路径
//     * @param choosePoint       选择列表
//     * @param x                 行
//     * @param n                 皇后个数
//     */
//    public void backTrace(List<List<String>> solution, Map<Integer, Integer> choosePoint, int x, int n) {
//        if (x > n) {
//            // 没找到解决方案
//            return;
//        }
//        if (choosePoint.size() == n) {
//            // 找到一个解决方案
//            solution.add(copyChooseSolution(choosePoint));
//            return;
//        }
//        for (int y = 0; y < n; y++) {
//            // 遍历一行的点
//            // 判断能否放皇后，不能放则不处理
//            if (cantAttack(choosePoint, x, y)) {
//                continue;
//            }
//            // 选择该点做皇后
//            choosePoint.put(x, y);
//            // 回溯，看下一行如何处理
//            // cantAttack判断和x+1都属于剪枝处理，每行只能放一个皇后，本行这列放了，后面的列都不用看了，直接跳到下行处理
//            backTrace(solution, choosePoint, x + 1, n);
//            // 取消选择该点做皇后，看有没有别的解法
//            choosePoint.remove(x);
//        }
//    }
//
//    public List<String> copyChooseSolution(Map<Integer, Integer> choosePoint) {
//        int n = choosePoint.size();
//        List<String> oneSolution = new ArrayList<String>(choosePoint.size());
//        for (int x = 0; x < n; x++) {
//            Integer y = choosePoint.get(x);
//            String row = "";
//            while (row.length() < n) {
//                row += row.length() == y ? "Q" : ".";
//            }
//            oneSolution.add(row);
//        }
//        return oneSolution;
//    }
//
//    public boolean cantAttack(Map<Integer, Integer> choosePoint, int x, int y) {
//        if (choosePoint.containsKey(x)) {
//            return true;
//        }
//        for (Integer px : choosePoint.keySet()) {
//            Integer py = choosePoint.get(px);
//            if (py == y || Math.abs(px - x) == Math.abs(py - y)) {
//                return true;
//            }
//        }
//        return false;
//    }
//}
//
////leetcode submit region end(Prohibit modification and deletion)
