package by.itstep.sasha.revision.task02.controller;

import by.itstep.sasha.revision.task02.model.*;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input two numbers: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int n = scanner.nextInt();
        int wight = scanner.nextInt();
        int length = scanner.nextInt();
        int side = scanner.nextInt();
        int number = scanner.nextInt();

        System.out.println("Max number is " + Task01.maximumNumber(a, b));
        System.out.println("The number is " + Task02.twoNumbers(a, b));
        System.out.println("Does the base of the pig fit completely" +
                " into this puddle? - " + Task03.isInPuddle(
                wight, length, side));
        System.out.println("Is the pig in a puddle? - "
                + Task04.isItInARectangularPuddle(wight, length, a, b));
        System.out.println("Price is " + Task05.findThePrice(a, b, n));
        System.out.println("Is triangle? - " + Task06.iSTriangle(a, b, c));
        System.out.println("The amount is equal " + Task07.findSumma(number));
        System.out.println("The amount of snow cover " +
                TaskX.findTheAmountOfSnowCover(a, b));


//        String msg = TaskTester.testingTask01();
//        msg += "\n" + TaskTester.testingTask02();
//        msg += "\n" + TaskTester.testingTask03();
//        msg += "\n" + TaskTester.testingTask04();
//        msg += "\n" + TaskTester.testingTask05();
//        msg += "\n" + TaskTester.testingTask06();
//        msg += "\n" + TaskTester.testingTask07();
//        msg += "\n" + TaskTester.testingTaskX();
//        System.out.println(msg);
    }
}