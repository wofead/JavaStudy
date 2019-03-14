package Algorithm.TowNumberSum.TwoNumberSumChain;

/**
 * @Author: jow
 * @Date: 2019/3/14 20:38
 * @Description
 * @Version 1.0
 */
public class TwoNumberSumm {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result;
        ListNode l1Next = l1;
        ListNode l2Next = l2;
        int carry = 0;
//        放到里面new会更好这样当有进位的时候最后new 而不是一直new  最后还有遍历一次
//        通过设置头就可以
        result = new ListNode(0);
        ListNode resultNext = result;
//        更好的方法应该是两个都为空才结束 然后 为空的赋值为0
        while (l1Next != null && l2Next != null){
//            算进位的时候数加数还要加进位
            resultNext.val = (l1Next.val + l2Next.val + carry) % 10;
            carry = (l1Next.val + l2Next.val  + carry) / 10;
            l1Next = l1Next.next;
            l2Next = l2Next.next;
            resultNext.next = new ListNode(carry);
            resultNext = resultNext.next;
        }

        if (l1Next == null){
            l1Next = l2Next;
        }
        while (l1Next != null){
//            别忘记还有可能带进位
            resultNext.val = (l1Next.val + resultNext.val) % 10;
            carry = (l1Next.val + carry) / 10;
            l1Next = l1Next.next;
            resultNext.next = new ListNode(carry);
            resultNext = resultNext.next;
        }
        resultNext = result;
        ListNode curNext = result;
        while (resultNext.next != null){
            curNext = resultNext;
            resultNext = resultNext.next;
        }
//        去除最后一位0
        if (resultNext.val == 0) curNext.next = null;
        return result;
    }

    public ListNode addTwoNumberIm(ListNode l1, ListNode l2) {
        ListNode p = l1,q = l2,listHead = new ListNode(0),cur = listHead;
        int carry = 0,val1 = 0,val2 = 0,sum = 0;
        while (p != null || q != null){
//            赋值的时候别忘记加括号
            val1 = ((p != null) ? p.val:0);
            val2 = ((q != null) ? q.val:0);
            sum = val1 + val2 + carry;
            carry = sum / 10;
            cur.next = new ListNode(sum % 10);
//            别忘记接着递归下去
            cur = cur.next;
            if (p != null) p = p.next;
            if (q != null) q = q.next;
        }
        if (carry != 0) cur.next = new ListNode(carry);
        return listHead.next;
    }
}
