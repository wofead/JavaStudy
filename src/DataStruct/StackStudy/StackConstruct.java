package DataStruct.StackStudy;

import java.util.Arrays;

public class StackConstruct {
    private int size = 0;
    private int[] array;

    public StackConstruct() {
        this(10);
    }

    public StackConstruct(int init) {
        if (init < 10) {
            init = 10;
        }
        array = new int[init];
    }

    public void push(int item) {
        if (array.length == size) {
            array = Arrays.copyOf(array, size * 2);
        }
        this.array[size++] = item;
    }

    public int pop() {
        int item = peek();
        if(item == -1){
            return -1;
        }
        size --;
        return item;
    }

    public int getSize() {
        return this.size;
    }

    public int peek() {
        if(size == 0){
            return -1;
//            throw new IndexOutOfBoundsException("栈里已经空");
        }
        return array[size - 1];
    }

    public  boolean isFull(){
        if (size == array.length){
            return true;
        }else{
            return false;
        }
    }

}
