package hashTable;

import java.util.Arrays;

public class HashTableConstructor {
    /*初始的散列表长度*/
    private final static int DEFAULT_INITIAL_CAPACITY = 4;
    /*扩充因子*/
    private final static float LOAD_FACTOR = 0.75f;
    /*散列表数组*/
    private HashEntity[] entities;

    private int size = 0;//当前元素的个数
    private int use = 0;//当前数组地址占用的个数

    public HashTableConstructor() {
        entities = new HashEntity[DEFAULT_INITIAL_CAPACITY];
    }

    /*
     * 键值的添加或修改
     * */
    public void put(int key, int value) {
        int index = Hash.hash(key, entities.length);
        HashEntity newEntity = new HashEntity(key, value, null);
        if (entities[index] == null) {
            entities[index] = newEntity;
            size++;
            use++;
            resize();
        } else {
            HashEntity entity = entities[index];
            while (entity.nextEntity != null) {
                if (entity.key == key) {
                    entity.value = value;
                    return;
                }
                entity = entity.nextEntity;
            }
            entity.nextEntity = newEntity;
            size++;
        }
    }

    /*键值的获取*/
    public int getValue(int key) {
        int index = Hash.hash(key, entities.length);
        HashEntity entity = entities[index];
        if (entity == null) return -1;
        if (entity.key == key) return entity.value;
        /*这里注意没有判断上面的*/
        while (entity.nextEntity != null) {
            if (entity.key == key) {
                return entity.value;
            }
            entity = entity.nextEntity;
        }
        return -1;
    }
    /*获取元素总数*/
    public int getSize() {
        return size;
    }
    /*获取table地址占用个数*/
    public int getUse(){
        return use;
    }
    /*获取table表长*/
    public int getLength(){
        return entities.length;
    }

    public void delete(int key) {
        int index = Hash.hash(key, entities.length);
        HashEntity entity = entities[index];
        if (entity != null && entity.key == key) {
            entities[index] = null;
            return;
        }
        HashEntity preEntity = entities[index];
        if (entity != null && preEntity != null) {
            while (entity != null) {
                if (entity.key == key) {
                    preEntity.nextEntity = entity.nextEntity;
                    return;
                }
                preEntity = entity;
                entity = entity.nextEntity;
            }
        }
    }

    /*扩容  传入引起扩容的元素*/
    private void resize() {
        if (use * 1.0 >= entities.length * 0.75f) {
            HashEntity[] oldTables = new HashEntity[entities.length];
            oldTables = entities;
//          entities = new HashEntity[entities.length * 2];
            /*这里注意copyof不行的*/
            /*Arrays.copyOf()方法返回的数组是新的数组对象，原数组对象仍是原数组对象，不变，该拷贝不会影响原来的数组*/
            entities = Arrays.copyOf(entities,entities.length * 2);
            Arrays.fill(entities, null);
            rehash(oldTables);
        }
    }

    /*再hash*/
    private void rehash(HashEntity[] oldEntities) {
        for (int i = 0; i < oldEntities.length; i++) {
            HashEntity entity = oldEntities[i];
            while (entity != null) {
                put(entity.key, entity.value);
                entity = entity.nextEntity;
            }
        }
    }

}
