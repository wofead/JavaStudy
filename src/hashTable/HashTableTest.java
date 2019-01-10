package hashTable;

public class HashTableTest {
    public HashTableTest() {
    }
    public void test(){
        HashTableConstructor hashTable = new HashTableConstructor();
        hashTable.put(1,10);
        hashTable.put(2,20);
        hashTable.put(5,50);
        print(hashTable.getLength());
        print(hashTable.getSize());
        print(hashTable.getUse());
        hashTable.put(3,30);
        hashTable.put(4,40);
        print(hashTable.getLength());
        hashTable.put(6,60);
        hashTable.put(7,70);
        print(hashTable.getLength());
        print(hashTable.getValue(1));
        print(hashTable.getValue(3));
        print(hashTable.getValue(5));
        print(hashTable.getValue(6));
        hashTable.delete(3);
        hashTable.delete(5);
        print(hashTable.getValue(3));
        print(hashTable.getValue(1));
        print(hashTable.getValue(5));
    }

    private void print(int item) {
        System.out.println("HashTable:" + item);
    }
}
