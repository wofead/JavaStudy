package Chain;

//静态链表
public class StackChain {
    private ChainNode[] chainNodes;
    private int head;
    private int tail;
    private int size = 0;
    private int unused = 0;

    public StackChain(int length) {
        chainNodes = new ChainNode[length];
        for (int i = 0; i < length; i++) {
            chainNodes[i] = new ChainNode();
            chainNodes[i].setCur(i + 1);
        }
        chainNodes[length - 1].setCur(-1);
    }

//    操作包含增删改查
//    增加
    public void headInsert(int data){
        if (checkEmpty()){
            head = tail = unused;
            unused = chainNodes[unused].getCur();
        }
    }

    //    查找
    public boolean checkElement(int data) {
        return false;
    }

    public int getElementByIndex(int index) {
        return 0;
    }

    public boolean checkEmpty() {
        return size == 0;
    }
}
