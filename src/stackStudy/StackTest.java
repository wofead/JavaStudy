package stackStudy;

public class StackTest {
    StackConstruct stack;

    public StackTest() {
        stack = new StackConstruct();
    }

    public void test() {
        stack.push(1);
        stack.push(2);
        print(stack.length());
        print(stack.peek());
        print(stack.pop());
        print(stack.pop());
        print(stack.pop());
    }

    private void print(int item) {
        System.out.println("stack:" + item);
    }

}
