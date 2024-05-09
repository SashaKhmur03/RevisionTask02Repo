package by.itstep.sasha.revision.task02.model;

public class Task03 {
    public static boolean isInPuddle(int width, int length, int side) {
        if (width <= 0 || length <= 0 || side <= 0) {
            return false;
        }

        int maxPuddleSide = Math.min(width, length);
        return maxPuddleSide <= side;
    }
}
