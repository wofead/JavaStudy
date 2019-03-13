package Algorithm.FibonacciAlgorithm;

/**
 * @Author: jow
 * @Date: 2019/3/13 23:59
 * @Description
 * @Version 1.0
 */
public class FibonacciImprome {
    public int fibonacciAl(int n){
        int result = 0;
        int temp1 = 1;
        int temp2 = 1;
        if (n == 1 || n == 2){
            return 1;
        }
        while (n > 2){
            result = temp1 + temp2;
            n --;
            temp1 = temp2;
            temp2 = result;
        }
        return result;
    }
}
