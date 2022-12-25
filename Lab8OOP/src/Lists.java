import java.util.*;

public class Lists {
    public static void insertFirst(ArrayList<Integer> list, int value) {
        list.add(0, value);
    }

    public static void insertLast(ArrayList<Integer> list, int value) {
        list.add(value);
    }

    public static void replace(ArrayList<Integer> list, int value) {
        list.set(2, value);
    }

    public static void removeThird(ArrayList<Integer> list, int value) {
        list.remove(2);
    }

    public static void removeEvil(ArrayList<Integer> list) {
        list.remove(Integer.valueOf(666));
    }

    public static ArrayList<Integer> generateSquare() {
        ArrayList<Integer> listSquare = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            listSquare.set(i, i * i);
        }
        return listSquare;
    }

    public static boolean contains(ArrayList<Integer> list, int value) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == value) {
                return true;
            }
        }
        return false;
    }

    public static void copy(ArrayList<Integer> source, ArrayList<Integer> target) {
        target.clear();
        target.addAll(source);
    }

    public static void reverse(ArrayList<Integer> list) {
        Collections.reverse(list);
    }

    public static void reverseManual(ArrayList<Integer> list) {
        ArrayList<Integer> reverseArray = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            reverseArray.add(0, list.get(i));
        }
        list.clear();
        list.addAll(reverseArray);
    }

    public static void insertBeginningEnd(LinkedList<Integer> list, int value) {
        list.addFirst(value);
        list.addLast(value);
    }

}
