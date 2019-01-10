package QueueConstructor;

public class QueueTest {
    public QueueTest() {
    }

    public void test() {
        QueueBuilder queue = new QueueBuilder();
        queue.push(1);
        queue.push(2);
        queue.push(3);
        queue.push(4);
        queue.push(5);
        queue.push(6);
        queue.push(7);
        queue.push(8);
        queue.push(9);
        queue.push(10);
        queue.push(11);
        queue.push(12);
    }

    private void print(int item) {
        System.out.println("Queue:" + item);
    }
}
