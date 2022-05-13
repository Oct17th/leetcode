package cn;
//森林中有未知数量的兔子。提问其中若干只兔子 "还有多少只兔子与你（指被提问的兔子）颜色相同?" ，将答案收集到一个整数数组 answers 中，其中
//answers[i] 是第 i 只兔子的回答。 
//
// 给你数组 answers ，返回森林中兔子的最少数量。 
//
// 
//
// 示例 1： 
//
// 
//输入：answers = [1,1,2]
//输出：5
//解释：
//两只回答了 "1" 的兔子可能有相同的颜色，设为红色。 
//之后回答了 "2" 的兔子不会是红色，否则他们的回答会相互矛盾。
//设回答了 "2" 的兔子为蓝色。 
//此外，森林中还应有另外 2 只蓝色兔子的回答没有包含在数组中。 
//因此森林中兔子的最少数量是 5 只：3 只回答的和 2 只没有回答的。
// 
//
// 示例 2： 
//
// 
//输入：answers = [10,10,10]
//输出：11
// 
//
// 
//
// 提示： 
//
// 
// 1 <= answers.length <= 1000 
// 0 <= answers[i] < 1000 
// 
// Related Topics 贪心 数组 哈希表 数学 👍 218 👎 0

import java.util.HashMap;
import java.util.Map;

//leetcode submit region begin(Prohibit modification and deletion)
//class Solution {
//    public int numRabbits(int[] answers) {
//        // 感觉这题是脑筋急转弯，数组里answers[i]相同的兔子才有可能是同色的，但当answers[i]相同的个数大于answers[i]值+1的时候，又可能是不同的颜色
//
//        if (answers == null || answers.length == 0) {
//            return 0;
//        }
//
//        // key:同色个数 value:该回答的个数
//        Map<Integer,Integer> map = new HashMap<>();
//        for (int i = 0; i < answers.length; i++) {
//            int num = answers[i]; // 加上自己
//            map.put(num,map.getOrDefault(num,0)+1);
//        }
//
//        int sum = 0;
//        // 相同同色个数的回答，如果大于该回答的个数，则可能是不同色
//        for (Integer answer:map.keySet()) {
//            Integer count = map.get(answer);
//            sum += (answer + count) / (answer + 1) * (answer + 1);
//        }
//        return sum;
//    }
//}
//leetcode submit region end(Prohibit modification and deletion)
