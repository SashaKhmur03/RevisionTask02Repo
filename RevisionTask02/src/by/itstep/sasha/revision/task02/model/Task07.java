package by.itstep.sasha.revision.task02.model;

public class Task07 {
    public static int findSumma(int number) {
        if (number < -9999 || number > 9999) {
            return 0;
        }

        number = Math.abs(number);

        int sum = 0;
        while (number > 0) {
            sum += number % 10;
            number /= 10;
        }

        return sum;
    }
}
