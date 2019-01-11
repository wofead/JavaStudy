package QueueConstructor;

import stackStudy.StackConstruct;

public class StackQueue {
    private StackConstruct stack1;
    private StackConstruct stack2;

    public StackQueue() {
        stack1 = new StackConstruct();
        stack2 = new StackConstruct();
    }

    public void push(int item) {
        stack1.push(item);
    }

    public int pop() {
        if (stack2.getSize() == 0) {
            popAll();
        }
        return stack2.pop();
    }

    public int getSize(){
        return stack1.getSize() + stack2.getSize();
    }

    private void popAll() {
        int item;
        while ((item = stack1.pop()) != -1) {
            stack2.push(item);
        }
    }


}
