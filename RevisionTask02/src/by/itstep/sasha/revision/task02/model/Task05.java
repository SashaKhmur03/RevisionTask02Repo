package by.itstep.sasha.revision.task02.model;

public class Task05 {
    public static String findThePrice(int a, int b, int n) {
        if (a < 0 || b <= 0 || n <= 0) {
            return "error";
        }

        int totalRubles = a * n;
        int totalKopecks = b * n;
        int extraRubles = totalKopecks / 100;
        totalRubles += extraRubles;
        int remainingKopecks = totalKopecks % 100;
        return totalRubles + " " + remainingKopecks;
    }
}
