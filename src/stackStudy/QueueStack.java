package stackStudy;

import QueueConstructor.QueueBuilder;

public class QueueStack {
    private QueueBuilder queue1;
    private QueueBuilder queue2;
    //最近一次往哪个队列里面push了值 1代表queue1  2 代表queue2
    private int flag;
    //最近一次往哪个队列pop了值 1代表queue1  2 代表queue2
    private int popFlag;

    public QueueStack() {
        queue1 = new QueueBuilder();
        queue2 = new QueueBuilder();
        flag = 1;
    }

    public void push(int item){
        if (queue1.isEmpty() || queue2.isEmpty()){
            if (queue1.isEmpty()){
                queue1.push(item);
                flag = 1;
            }else if (queue2.isEmpty()){
                queue2.push(item);
                flag = 2;
            }
        }else{
            if (flag == 1){
                add(queue1,queue2);
                queue2.push(item);
                flag = 2;
            }else{
                add(queue2,queue1);
                queue1.push(item);
                flag = 1;
            }
        }
    }

    public int pop(){
        if (flag == 1){
            add(queue1,queue2);
            return queue1.pop();
        }else{
            add(queue2,queue1);
            return queue2.pop();
        }
    }

    public int size(){
        return queue1.getSize() + queue2.getSize();
    }
    private void add(QueueBuilder queue1,QueueBuilder queeu2){
        int item;
        while ((item = queeu2.pop()) != -1){
            queue1.push(item);
        }
    }
}
