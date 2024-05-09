package by.itstep.sasha.revision.task02.model;

public class Task06 {
    public static boolean iSTriangle(int a, int b, int c) {
        if (a <= 0 || b <= 0 || c <= 0) {
            return false;
        }

        return (a + b > c) && (a + c > b) && (b + c > a);
    }
}
