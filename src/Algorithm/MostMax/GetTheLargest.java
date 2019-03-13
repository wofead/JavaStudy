package Algorithm.MostMax;

/*
 * 优先加上最小的
 * 然后达到目标值
 * */
public class GetTheLargest {
    private static final int ONE = 25;
    private static final int TWO = 50;
    private static final int THREE = 100;
    private static final int[] items = {ONE, TWO, THREE};
    private  int[] itemsNumber = {0, 0, 0};

    public GetTheLargest(int oneNumber, int twoNumber, int threeNumber) {
        this.itemsNumber[0] = oneNumber;
        this.itemsNumber[1] = twoNumber;
        this.itemsNumber[2] = threeNumber;
    }

    public int[] getUsage(int aim) {
        int item = items.length - 1;
        int remainAim = aim;
        int [] result = new int[itemsNumber.length];
        while (item != 0){
            item = getMax(remainAim);
            result[item] = getMaxCost(remainAim,item);
            remainAim -= items[item] * result[item];
        }
        return result;
    }

    private int getMax(int aim) {
        int exp = 0;
        int result = 0;
        for (int i = 0; i < 3; i++) {
            exp += items[i] * itemsNumber[i];
            if (exp >= aim) {
                result = i;
                break;
            }
        }
        if (exp >= aim) return result;
        else return -1;
    }

    private int getMaxCost(int aim, int max) {
        int exp = 0;
        int result = 0;
        for (int i = 0; i < max - 1; i++) {
            exp += items[i] * itemsNumber[i];
        }
        for (int j = 0; j < itemsNumber[max]; j++) {
            exp += items[max];
            if (exp >= aim) {
                result = j + 1;
                break;
            }
        }
        return result;
    }
}
