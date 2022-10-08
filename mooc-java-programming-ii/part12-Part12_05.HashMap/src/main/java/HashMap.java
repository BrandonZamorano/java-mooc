
import java.util.ArrayList;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author brandonwebdev
 */
public class HashMap<K, V> {

//    private List<Pair<K, V>>[] values;
    private List<List<Pair<K, V>>> values;
//    private int firstFreeIndex;

    public HashMap() {
//        this.values = new List[32];
        this.values = new ArrayList<>();
//        this.firstFreeIndex = 0;
    }

    public V get(K key) {
        int hashValue = Math.abs(key.hashCode() % this.values.size());
//        if (this.values[hashValue] == null) {
        if (this.values.get(hashValue) == null) {
            return null;
        }

        List<Pair<K, V>> valuesAtIndex = this.values.get(hashValue);

        for (int i = 0; i < valuesAtIndex.size(); i++) {
            if (valuesAtIndex.get(i).getKey().equals(key)) {
                return valuesAtIndex.get(i).getValue();
            }
        }

        return null;
    }

    public void add(K key, V value) {
        List<Pair<K, V>> valuesAtIndex = getListBasedOnKey(key);
        int index = getIndexOfKey(valuesAtIndex, key);

        if (index < 0) {
            valuesAtIndex.add(new Pair<>(key, value));
        } else {
            valuesAtIndex.get(index).setValue(value);
        }
    }

    private List<Pair<K, V>> getListBasedOnKey(K key) {
        int hashValue = Math.abs(key.hashCode() % values.size());
        if (values.get(hashValue) == null) {
//            values[hashValue] = new List<>();
            values.add(hashValue, new ArrayList<>());
        }

        return values.get(hashValue);
    }

    private int getIndexOfKey(List<Pair<K, V>> myList, K key) {
        for (int i = 0; i < myList.size(); i++) {
            if (myList.get(i).getKey().equals(key)) {
                return i;
            }
        }
        return -1;
    }

//    public void grow() {
//        // create array
//        List<Pair<K, V>>[] newValues = new List[this.values.size() * 2];
//
//        //copy the values of the old array into the new one
//        for (int i = 0; i < this.values.length; i++) {
//            copy(newValues, i);
//        }
//
//        // replace the old array with the new one
//        this.values = newValues;
//    }
//
//    private void copy(List<Pair<K, V>>[] newArray, int fromIdx) {
//        for (int i = 0; i < this.values[fromIdx].size(); i++) {
//            Pair<K, V> value = this.values[fromIdx].value(i);
//
//            int hashValue = Math.abs(value.getKey().hashCode() % newArray.length);
//            if (newArray[hashValue] == null) {
//                newArray[hashValue] = new List<>();
//            }
//
//            newArray[hashValue].add(value);
//        }
//    }

    public V remove(K key) {
        List<Pair<K, V>> valuesAtIndex = getListBasedOnKey(key);
        if (valuesAtIndex.size() == 0) {
            return null;
        }

        int index = getIndexOfKey(valuesAtIndex, key);
        if (index < 0) {
            return null;
        }

        Pair<K, V> pair = valuesAtIndex.get(index);
        valuesAtIndex.remove(pair);
        return pair.getValue();
    }
}
