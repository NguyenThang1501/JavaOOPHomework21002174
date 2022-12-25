public class RunningNumSequence {
    public static void main(String[] args) {
        System.out.println(len(12));
    }

    public static int len(int n) {
        if (n == 1) {
            return 1;
        }
        return len(n - 1) + (n + "").length();
    }

}
