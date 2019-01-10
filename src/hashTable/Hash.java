package hashTable;

public class Hash {

    public static int hash(int key,int length){
//        key += ~(key << 15);
//        key ^= (key >>> 10);
//        key += (key << 3);
//        key ^= (key >>> 6);
//        key += ~(key << 11);
//        key ^= (key >>> 16);
        key = key % length;
        return key;
    }

    public static int hash(String key){
        int h = 0;
        int off = 0;
        int len = key.length();
        for (int i = 0; i < len; i++) {
            h = 31 * h + key.charAt(off++);
        }
        return h;
    }
}
