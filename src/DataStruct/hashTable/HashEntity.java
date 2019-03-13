package DataStruct.hashTable;

public class HashEntity {
    public int key;
    public int value;
    public HashEntity nextEntity;

    public HashEntity(int key, int value, HashEntity nextEntity) {
        this.key = key;
        this.value = value;
        this.nextEntity = nextEntity;
    }
}
