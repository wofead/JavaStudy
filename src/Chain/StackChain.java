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
    public void headInsert(int data) {
        if (checkFull()) {
            System.out.println("the chain is full");
            return;
        }
        ChainNode temp = chainNodes[unused];
        int cur = temp.getCur();
        temp.setData(data);
        if (checkEmpty()) {
            head = tail = unused;
            temp.setCur(-1);
        } else {
            temp.setCur(head);
            head = unused;
        }
        unused = cur;
        size++;
    }


    public void tailInsert(int data) {
        if (checkFull()) {
            System.out.println("the chain is full");
            return;
        }
        ChainNode temp = chainNodes[unused];
        int cur = temp.getCur();
        temp.setData(data);
        temp.setCur(-1);
        chainNodes[tail].setCur(unused);
        tail = unused;
        unused = cur;
        size++;
    }

    //    在指定数据之后插入
    public void innerInsert(int data) {
        if (checkFull()) {
            System.out.println("the chain is full");
            return;
        }
        ChainNode temp = chainNodes[unused];
        temp.setData(data);
        int cur = temp.getCur();
        int index = checkElement(data);
        if (index == -1) return;
        temp.setCur(chainNodes[index].getCur());
//        中间插入注意可能会改变tail的值
        if (index == tail) {
            tail = unused;
        }
        chainNodes[index].setCur(unused);
        unused = cur;
        size++;
    }


    //    查找某个元素的index
    public int checkElement(int data) {
        if (checkEmpty()) {
            System.out.println("链表为空");
            return -1;
        }
        int cur = head;
        do {
//            死循环
            if (chainNodes[cur].getData() == data) {
                return cur;
            }else{
                cur = chainNodes[cur].getCur();
            }
        } while (cur != -1);
        System.out.println("不存在元素：" + data);
        return -1;
    }

    //   根据cur查找前一个cur
    public int getPreCur(int cur) {
        if (checkEmpty()) {
            System.out.println("链表为空");
            return -1;
        }
        int temp = head;
        do {
            if (chainNodes[temp].getCur() == cur) {
                return temp;
            }
        } while (temp != -1);
        return -1;
    }

    //    删除
    public void deletTheElement(int data) {
        if (checkEmpty()) {
            System.out.println("链表为空");
            return;
        }
        int index = checkElement(data);
        if (index == -1) return;
        if (index == head) {
            head = chainNodes[head].getCur();
        } else {
            int preCur = getPreCur(index);
            chainNodes[preCur].setCur(chainNodes[index].getCur());
        }
        chainNodes[index].setCur(unused);
        unused = index;
        size --;
    }

    public int getElements() {
        return size;
    }

    public boolean checkEmpty() {
        if (size == 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean checkFull() {
        return size == chainNodes.length;
    }
}
