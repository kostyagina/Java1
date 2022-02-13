package homework2;

import static java.lang.System.out;

public class homework2 {
    public static void main(String[] args) {
        boolean result = Sum10to20();
        out.println(result ? "true" : "false");
        out.println(" ");
        PositiveOrNegativeInt();
        NegativeOrPositiveInt();
        // boolean result = Negative();
        // out.println(result? "true" : "false");
        printStringAnyTimes();
    }

    static boolean Sum10to20() {
        int a;
        int b;
        a = 2;
        b = 15;
        int sum = a + b;
        if (sum >= 10 && sum <= 20) {
            return true;
        } else {
            return false;
        }
    }

    public static void PositiveOrNegativeInt() {
        int a = 10;
        if (a >= 0) {
            out.println("Положительное число");
        } else {
            out.println("Положительное число");
        }
        out.println(" ");
    }

    public static void NegativeOrPositiveInt() {
        int a = -10;
        if (a < 0) {
            out.println("true");
        } else {
            out.println("false");
        }
        out.println(" ");
    }

    public static void printStringAnyTimes() {
        for (int i = 0; i < 3; i++) {
        out.println("woman");
            }
    }
}
