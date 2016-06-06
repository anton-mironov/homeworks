package New_HWs.Database;

import java.util.*;

public class DatabaseManager {
    Map<String, Integer> map = new HashMap<>();

    public void add(String key, Integer value) {
        map.put(key, value);
    }

    public void remove(String key) {
        map.remove(key);
    }

    public void remove(String key, Integer value) {
        map.remove(key, value);
    }

    public void replace(String key, Integer value) {
        map.replace(key, value);
    }

    public void replace(String key, Integer value, Integer newValue) {
        map.replace(key, value, newValue);
    }

    public void sort() {
        this.map = new TreeMap<>(map);
    }

    public TreeMap<String, Integer> sortByValue() {
        Comparator<String> comparator = new ValueComparator(map);
        TreeMap<String, Integer> sortedMap = new TreeMap<>(comparator);
        sortedMap.putAll(map);
        return sortedMap;
    }

    @Override
    public String toString() {
        return "" + map;
    }
}