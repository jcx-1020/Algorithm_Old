package leetcode;

import java.util.HashMap;

/**
 * 给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那 两个 整数，并返回他们的数组下标。
 * 你可以假设每种输入只会对应一个答案。但是，你不能重复利用这个数组中同样的元素。
 * 示例:
 *      给定 nums = [2, 7, 11, 15], target = 9
 *      因为 nums[0] + nums[1] = 2 + 7 = 9
 *      所以返回 [0, 1]
 */
public class TowSum {

    public static int[] twoSum(int[] nums,int target){
        //创建map放nums中数据和下标
        HashMap<Integer, Integer> map = new HashMap<>();
        //遍历数组
        for (int i = 0; i < nums.length; i++) {
            //定义一个变量存放target与数组中值相减结果
            int temp = target - nums[i];
            //判断结果是否存在于map中，若存在返回查找去的value和当前遍历到值的下标
            if (map.containsKey(temp)){
                return new int[]{map.get(temp),i};
            }
            //把值和下标加入map中
            map.put(nums[i],i);
        }
        //没找到，抛出非法参数异常
        throw new IllegalArgumentException("数组中没有符合条件的两个数");
    }
}
