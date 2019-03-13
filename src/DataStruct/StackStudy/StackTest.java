package DataStruct.StackStudy;

import DataStruct.QueueConstructor.QueueStack;

public class StackTest {
    QueueStack stack;

    public StackTest() {
        stack = new QueueStack();
    }

    public void test() {
        stack.push(1);
        stack.push(2);
        stack.push(3);
        print(stack.pop());
        stack.push(4);
        stack.push(5);
        print(stack.size());
        print(stack.pop());
        print(stack.pop());
    }

    private void print(int item) {
        System.out.println("stack:" + item);
    }

}
