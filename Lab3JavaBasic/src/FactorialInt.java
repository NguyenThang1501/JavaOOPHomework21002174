public class FactorialInt {
    public static void main(String[] args) {
        int factorial=1;
        int n=1;
        int max=Integer.MAX_VALUE;
        while ((double)(max / factorial) > (n+1)){
            factorial= factorial*n;
            System.out.println("The factorial of "+n+" is "+factorial);
            n++;
        }
        System.out.println("The factorial of "+n+" is out of range");
    }
}
