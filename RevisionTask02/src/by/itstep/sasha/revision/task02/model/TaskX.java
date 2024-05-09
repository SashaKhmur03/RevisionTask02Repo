package by.itstep.sasha.revision.task02.model;

public class TaskX {
    public static int findTheAmountOfSnowCover(int a, int b) {
        if (a <= 0 || b <= 0) {
            return -1;
        }

        if (b < a) {
            int temp = a;
            a = b;
            b = temp;
        }

        int heightA = 0;
        int heightB = 0;


        for (int i = 1; i <= a; i++) {
            heightA += i;
        }

        for (int i = 1; i <= b; i++) {
            heightB += i;
        }

        return Math.abs(heightB - heightA) - 1;
    }
}
