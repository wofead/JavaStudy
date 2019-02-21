package Chain;

/**
 * @Author: jow
 * @Date: 2019/2/22 0:17
 * @Description
 * @Version 1.0
 */
public class StackChainTesi {
    public void test(){
        StackChain stackChain = new StackChain(6);
        stackChain.headInsert(1);
        stackChain.headInsert(2);
        stackChain.headInsert(3);
        stackChain.headInsert(4);
        stackChain.headInsert(5);
        stackChain.headInsert(6);
        stackChain.deletTheElement(6);
        stackChain.innerInsert(2);
        System.out.println("链表长度："+ stackChain.getElements());
    }
}
