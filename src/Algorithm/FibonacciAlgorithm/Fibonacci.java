package Algorithm.FibonacciAlgorithm;

/**
 * @Author: jow
 * @Date: 2019/3/13 23:35
 * @Description
 * @Version 1.0
 */
public class Fibonacci {
    private int count = 0;
    public int fibonacciAl(int n){
        if (n == 1 || n == 2){
            return 1;
        }
        count ++;
        return fibonacciAl(n - 1) + fibonacciAl(n - 2);
    }

    public int getCount(){
        return this.count;
    }
}
