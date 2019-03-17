package Algorithm.MiddleNumber;

import java.util.Arrays;

/**
 * @Author: jow
 * @Date: 2019/3/17 10:29
 * @Description
 * @Version 1.0
 */
public class MiddleNum {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        double result = 0.0;
        int[] temp1;
        int[] temp2;
        if (nums1 == null || nums2 == null) {
            if (nums1 == null) temp1 = nums2;
            else temp1 = nums1;
            int temp = temp1.length / 2;
            if (temp1.length % 2 == 0) {
                result = (temp1[temp] + temp1[temp + 1]) / 2 * 1.0;
                return result;
            } else {
                result = temp1[temp] * 1.0;
                return result;
            }
        }
        temp1 = nums1;
        temp2 = nums2;

        while (temp1.length + temp2.length > 2) {
            int middle1 = temp1.length / 2;
            int middle2 = temp2.length / 2;
            if (temp1[middle1] > temp2[middle2]) {
                temp1 = Arrays.copyOfRange(temp1,0,middle1);
                temp2 = Arrays.copyOfRange(temp2,middle2,temp2.length);
            }else{
                temp2 = Arrays.copyOfRange(temp2,0,middle1);
                temp1 = Arrays.copyOfRange(temp1,middle1,temp1.length);
            }
        }


        return 0.5;
    }
}
