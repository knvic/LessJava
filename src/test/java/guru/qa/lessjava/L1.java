package guru.qa.lessjava;

import java.io.IOException;

public class L1 {

    public static void main(String[] args) {

        short s1 = Short.MAX_VALUE;
        System.out.println("Short.MAX_VALUE " + Short.MAX_VALUE);
        byte bytemax = Byte.MAX_VALUE;
        System.out.println("Byte.MIN_VALUE " + Byte.MIN_VALUE);
        System.out.println("Long.MIN_VALUE " + Long.MAX_VALUE);

        System.out.println("Произойдет автоматическое приведение к int - " + (bytemax + 1));
        byte overflow = (byte) (bytemax + 1);
        System.out.println("А тут бедет Overflow так как приводим к byte - " + overflow);

        int imax = Integer.MAX_VALUE;
        int imin = Integer.MIN_VALUE;
        System.out.println("Integer.MAX_VALUE " + imax);
        System.out.println("Integer.MIN_VALUE " + imin);
        System.out.println("Ошибка " + s1);

        boolean a = true;
        boolean b = false;
        System.out.println("a&&b -  " + (a && b));
        System.out.println("a||b -  " + (a || b));

        System.out.println(a ? "1" : "2");
        if (a != b) {
            System.out.println("нет");
        } else {
            System.out.println("да");
        }

        int x = 3;
        int y = 2;
        System.out.println(x / y);
        System.out.println(x * y);
        System.out.println(x ^ y);
        float x1 = 5.2f;
        System.out.println(x1 * y);

        int c = 4;
        double d = 6.55;
        System.out.println(c / d);
    }
}
