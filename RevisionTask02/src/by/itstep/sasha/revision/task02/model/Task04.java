package by.itstep.sasha.revision.task02.model;

public class Task04 {
    public static boolean isItInARectangularPuddle(int width, int length, int a, int b) {
        if (width <= 0 || length <= 0 || a <= 0 || b <= 0) {
            return false;
        }

        return width <= a && length <= b;
    }
}
