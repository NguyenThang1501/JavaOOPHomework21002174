import java.util.*;

public class Maps {
    public static int count(Map<Integer, Integer> map) {
        return map.size();
    }

    public static void empty(Map<Integer, Integer> map) {
        map.clear();
    }

    public static boolean contains(Map<Integer, Integer> map, int key) {
        return map.containsKey(key);
    }

    public static boolean containsKeyValue(Map<Integer, Integer> map, int value, int key) {
        return true;
    }

    public static Set<Integer> keySet(Map<Integer, Integer> map) {
        return map.keySet();
    }

    public static Collection<Integer> values(Map<Integer, Integer> map) {
        return map.values();
    }

    public static String getColor(int value) {
        Map<String, Integer> color = new HashMap<String, Integer>();
        color.put("black", 0);
        color.put("white", 1);
        color.put("red", 2);
        Set<String> set = color.keySet();
        for (String key : set) {
            if (color.get(key) == value) {
                return key;
            }
        }
        return "";
    }
}
