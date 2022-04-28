package cn;//n 皇后问题 研究的是如何将 n 个皇后放置在 n×n 的棋盘上，并且使皇后彼此之间不能相互攻击。
//
// 给你一个整数 n ，返回所有不同的 n 皇后问题 的解决方案。 
//
// 
// 
// 每一种解法包含一个不同的 n 皇后问题 的棋子放置方案，该方案中 'Q' 和 '.' 分别代表了皇后和空位。 
//
// 
//
// 示例 1： 
//
// 
//输入：n = 4
//输出：[[".Q..","...Q","Q...","..Q."],["..Q.","Q...","...Q",".Q.."]]
//解释：如上图所示，4 皇后问题存在两个不同的解法。
// 
//
// 示例 2： 
//
// 
//输入：n = 1
//输出：[["Q"]]
// 
//
// 
//
// 提示： 
//
// 
// 1 <= n <= 9 
// 
// 
// 
// Related Topics 数组 回溯 👍 1285 👎 0

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {

    public List<List<String>> solveNQueens(int n) {
        /**
         1. 用一个数组记录皇后的横纵坐标
         2. 递归判断下一个节点是否能放皇后
         3. 如果放的皇后数达到n个，则该组数组为一个解决方案
         */
        List<ArrayList<QueenPosition>> existSolution = new ArrayList<ArrayList<QueenPosition>>();
        ArrayList<QueenPosition> solution = new ArrayList<QueenPosition>();
        findSolution(existSolution, solution, 0, 0, n);

        return convertResultList(existSolution, n);
    }

    public List<List<String>> convertResultList(List<ArrayList<QueenPosition>> existSolution, int n) {
        if (existSolution == null) {
            return null;
        }
        List<List<String>> result = new ArrayList<List<String>>();
        for (ArrayList<QueenPosition> solution : existSolution) {
            List<String> list = new ArrayList<String>();
            for (int x = 0; x < n; x++) {
                String s = "";
                for (int y = 0; y < n; y++) {
                    if (isQueen(solution, x, y)) {
                        s += "Q";
                    } else {
                        s += ".";
                    }
                }
                list.add(s);
            }
            result.add(list);
        }
        Collections.sort(result, new Comparator<List<String>>() {
            public int compare(List<String> o1, List<String> o2) {
                return o2.get(0).compareTo(o1.get(0));
            }
        });
        return result;
    }

    public boolean isQueen(ArrayList<QueenPosition> solution, int x, int y) {
        for (QueenPosition p : solution) {
            if (p.x == x && p.y == y) {
                return true;
            }
        }
        return false;
    }

    public void findSolution(List<ArrayList<QueenPosition>> existSolution, ArrayList<QueenPosition> thisSolution, int x, int y, int n) {
        /**
         递归的两个退出条件：
         1. x或y>=n
         2. thisSolution.size()==n
         */

        // copy一份thisSolution
        ArrayList<QueenPosition> solution = new ArrayList<QueenPosition>();
        for (QueenPosition p : thisSolution) {
            solution.add(p);
        }
        if (solution.size() == n) {
            existSolution.add(solution);
            // 找到一个解决方案
            return;
        }
        int nextX = y == n - 1 ? x + 1 : x;
        int nextY = y == n - 1 ? 0 : y + 1;
        if (x == n) {
            // 已经没有下一个节点了
            return;
        }
        boolean cantAttack = cantAttack(solution, x, y);
        findSolution(existSolution, solution, nextX, nextY, n);
        if (!cantAttack) {
            // 不能攻击的话，尝试一下在这个位置放皇后
            solution.add(new QueenPosition(x, y));
            findSolution(existSolution, solution, nextX, nextY, n);
        }
    }

    public boolean cantAttack(ArrayList<QueenPosition> solution, int x, int y) {
        for (QueenPosition p : solution) {
            if (p.x == x || p.y == y || Math.abs(p.x - x) == Math.abs(p.y - y)) {
                return true;
            }
        }
        return false;
    }

    class QueenPosition {
        private int x;
        private int y;

        public QueenPosition(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
}
//leetcode submit region end(Prohibit modification and deletion)
