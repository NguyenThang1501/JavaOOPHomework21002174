import java.util.*;
import java.lang.*;

public class Sets {
    public static Set<Integer> intersectionManual(Set<Integer> first, Set<Integer> second) {
        Set<Integer> intersectionSet = new HashSet<>();
        Iterator<Integer> iterator = first.iterator();
        while (iterator.hasNext()) {
            int element = iterator.next();
            if (second.contains(element)) {
                intersectionSet.add(element);
            }
        }
        return intersectionSet;
    }

    public static Set<Integer> unionManual(Set<Integer> first, Set<Integer> second) {
        Set<Integer> unionSet = first;
        Iterator<Integer> iterator = second.iterator();
        while (iterator.hasNext()) {
            int element = iterator.next();
            if (!first.contains(element)) {
                unionSet.add(element);
            }
        }
        return unionSet;
    }

    public static Set<Integer> intersection(Set<Integer> first, Set<Integer> second) {
        first.retainAll(second);
        return first;
    }

    public static Set<Integer> union(Set<Integer> first, Set<Integer> second) {
        first.addAll(second);
        return first;
    }

    public static List<Integer> toList(Set<Integer> source) {
        List<Integer> arr = new ArrayList<>();
        arr.addAll(source);
        return arr;
    }

    public static List<Integer> removeDuplicates(List<Integer> source) {
        List<Integer> result = new ArrayList<>();
        Set<Integer> set = new HashSet<>();
        set.addAll(source);
        result.addAll(set);
        return result;
    }

    public static List<Integer> removeDuplicatesManual(List<Integer> source) {
        List<Integer> newList = new ArrayList<>();
        for (int element : source) {
            for (int temp : newList) {
                if (element == temp) {
                    break;
                }
                newList.add(element);
            }
        }
        return newList;
    }

    public static String firstRecurringCharacter(String s) {
        Set<Character> characters = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (characters.contains(c)) {
                return String.valueOf(c);
            } else {
                characters.add(c);
            }
        }
        return "";
    }

    public static Set<Character> allRecurringChars(String s) {
        Set<Character> recurringChars = new HashSet<>();
        Set<Character> test = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (test.contains(c)) {
                recurringChars.add(c);
            } else {
                test.add(c);
            }
        }
        return recurringChars;
    }

    public Integer[] toArray(Set<Integer> source) {
        return source.stream().toArray(Integer[]::new);
    }

    public static int getFirst(TreeSet<Integer> source) {
        return source.first();
    }

    public static int getLast(TreeSet<Integer> source) {
        return source.last();
    }

    public static int getGreater(TreeSet<Integer> source, int value) {
        return source.ceiling(value);
    }
}
