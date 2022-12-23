import java.util.Scanner;
import java.lang.*;

public class PhoneKeyPad {

    //Program use (a) a nested-if.
    public static void PhoneKeyPadA(String inChar) {
        String[] chars = inChar.split("");
        for (int i = 0; i < chars.length; i++) {
            if (chars[i].equals("a") || chars[i].equals("b") || chars[i].equals("c")) {
                System.out.print("2");
            } else if (chars[i].equals("d") || chars[i].equals("e") || chars[i].equals("f")) {
                System.out.print("3");
            } else if (chars[i].equals("g") || chars[i].equals("h") || chars[i].equals("i")) {
                System.out.print("4");
            } else if (chars[i].equals("j") || chars[i].equals("k") || chars[i].equals("l")) {
                System.out.print("5");
            } else if (chars[i].equals("m") || chars[i].equals("n") || chars[i].equals("o")) {
                System.out.print("6");
            } else if (chars[i].equals("p") || chars[i].equals("q") || chars[i].equals("r") || chars[i].equals("s")) {
                System.out.print("7");
            } else if (chars[i].equals("t") || chars[i].equals("u") || chars[i].equals("v")) {
                System.out.print("8");
            } else {
                System.out.print("9");
            }

        }
    }

    //Program use (b) a switch-case-default.
    public static void PhoneKeyPadB(String inChar) {
        String[] chars = inChar.split("");
        for (int i = 0; i < chars.length; i++) {
            switch (chars[i]) {
                case "a":
                case "b":
                case "c":
                    System.out.print("2");
                    break;
                case "d":
                case "e":
                case "f":
                    System.out.print("3");
                    break;
                case "g":
                case "h":
                case "i":
                    System.out.print("4");
                    break;
                case "j":
                case "k":
                case "l":
                    System.out.print("5");
                    break;
                case "m":
                case "n":
                case "o":
                    System.out.print("6");
                    break;
                case "p":
                case "q":
                case "r":
                case "s":
                    System.out.print("7");
                    break;
                case "t":
                case "u":
                case "v":
                    System.out.print("8");
                    break;
                case "w":
                case "x":
                case "y":
                case "z":
                    System.out.print("9");
                    break;
                default:
                    System.out.println(" ");
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String inChar = sc.next().toLowerCase();

        PhoneKeyPadA(inChar);
        System.out.println();
        PhoneKeyPadB(inChar);
    }
}
