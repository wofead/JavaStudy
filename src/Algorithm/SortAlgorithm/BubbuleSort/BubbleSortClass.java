package Algorithm.SortAlgorithm.BubbuleSort;

/**
 * @Author: jow
 * @Date: 2019/3/13 23:05
 * @Description
 * @Version 1.0
 */
public class BubbleSortClass {
    public int[] sort(int[] nums){
        if (nums.length == 1) return nums;
        int key;
        for (int i = 0; i < nums.length; i++) {
            key = i;
            for (int j = 1 + i; j < nums.length; j++) {
                if (nums[key] < nums[j]){
                    int temporary = nums[key];
                    nums[key] = nums[j];
                    nums[j] = temporary;
                }
            }
        }
        return nums;
//        throw new IllegalArgumentException();
    }
}
