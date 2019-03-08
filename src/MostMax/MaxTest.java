package MostMax;

public class MaxTest {
    public MaxTest() {
    }

    public void test() {
        GetTheLargest getTheLargest = new GetTheLargest(2, 1, 1);
        int[] result = getTheLargest.getUsage(150);
        for (int item:result){
            System.out.println(item);
        }
    }
}

