package Algorithm.SortAlgorithm.BubbuleSort;

import Algorithm.SortAlgorithm.SortArray;

/**
 * @Author: jow
 * @Date: 2019/3/13 23:18
 * @Description
 * @Version 1.0
 */
public class BubleSortTest  {
    public void sort(){
        BubbleSortClass bubbleSortClass = new BubbleSortClass();
        SortArray.printArray(SortArray.INTEGERARRAY);
        bubbleSortClass.sort(SortArray.INTEGERARRAY);
    }
}
