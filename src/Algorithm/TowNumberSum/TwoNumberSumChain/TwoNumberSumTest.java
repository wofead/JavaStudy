package Algorithm.TowNumberSum.TwoNumberSumChain;

import Algorithm.TowNumberSum.TowNumberArray.TwoNumberSum;

/**
 * @Author: jow
 * @Date: 2019/3/14 21:06
 * @Description
 * @Version 1.0
 */
public class TwoNumberSumTest {
    public void test(){
        ListNode l1 = new ListNode(3);
        l1.next = new ListNode(7);
//        l1.next.next = new ListNode(9);
        ListNode l2 = new ListNode(9);
        l2.next = new ListNode(2);
//        l2.next.next = new ListNode(4);
        ListNode result;
        TwoNumberSumm twoNumberSumm = new TwoNumberSumm();
        result = twoNumberSumm.addTwoNumbers(l1,l2);
        while (result != null){
            System.out.println(result.val);
            result = result.next;
        }
    }
}
