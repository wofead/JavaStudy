package Algorithm.TowNumberSum;


import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @Author: jow
 * @Date: 2019/3/11 23:31
 * @Description
 * @Version 1.0
 */
public class TwoNumberSum {
    public int[] sumTwoNum(int[] nums, int target) {
        int [] result = new int[2];
        Arrays.sort(nums);
        int head = 0;
        int tail = nums.length - 1;
        while (head < tail){
            if (nums[head] + nums[tail] == target){
                result[0] = head;
                result[1] = tail;
                break;
            }else if (nums[head] + nums[tail] > target){
                tail --;
            }else{
                head ++;
            }
        }
        System.out.println(result[0] + "  " + result[1]);
        return result;
    }

    public int[] sumTwoNumHash(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        HashMap<Integer,Integer> hashMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            hashMap.put(nums[i],i);
        }
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement) && map.get(complement) != i) {
                return new int[] { i, map.get(complement) };
            }
        }
        throw new IllegalArgumentException("No two sum solution");
    }
}
