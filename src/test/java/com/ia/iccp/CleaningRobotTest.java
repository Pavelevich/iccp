package com.ia.iccp;

import com.ia.iccp.losung.CleaningRobot;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

public class CleaningRobotTest {
    public static void main(String[] args) {

        System.out.println("Test Case 1:");
        List<CleaningRobot.Rectangle> rectangles1 = Arrays.asList(
                new CleaningRobot.Rectangle(1, 1, 4, 4),
                new CleaningRobot.Rectangle(5, 5, 7, 7)
        );
        int[] times1 = {1, 2, 3, 4, 5};
        List<int[]> result1 = CleaningRobot.simulateCleaning(2, rectangles1, times1);
        for (int[] pos : result1) {
            System.out.println(Arrays.toString(pos));
        }


        System.out.println("\nTest Case 2:");
        List<CleaningRobot.Rectangle> rectangles2 = Arrays.asList(
                new CleaningRobot.Rectangle(100, 100, 200, 200),
                new CleaningRobot.Rectangle(300, 300, 400, 400)
        );
        int[] times2 = {10, 20, 30, 40, 50};
        List<int[]> result2 = CleaningRobot.simulateCleaning(2, rectangles2, times2);
        for (int[] pos : result2) {
            System.out.println(Arrays.toString(pos));
        }


        System.out.println("\nTest Case 3:");
        List<CleaningRobot.Rectangle> rectangles3 = Arrays.asList(
                new CleaningRobot.Rectangle(1, 1, 10, 10),
                new CleaningRobot.Rectangle(20, 20, 30, 30),
                new CleaningRobot.Rectangle(40, 40, 50, 50)
        );
        int[] times3 = {5, 15, 25, 35, 45};
        List<int[]> result3 = CleaningRobot.simulateCleaning(3, rectangles3, times3);
        for (int[] pos : result3) {
            System.out.println(Arrays.toString(pos));
        }


        System.out.println("\nTest Case 4:");
        List<CleaningRobot.Rectangle> rectangles4 = Arrays.asList(
                new CleaningRobot.Rectangle(1, 1, 5, 5),
                new CleaningRobot.Rectangle(6, 6, 10, 10),
                new CleaningRobot.Rectangle(11, 11, 15, 15),
                new CleaningRobot.Rectangle(16, 16, 20, 20)
        );
        int[] times4 = {1, 10, 20, 30, 40};
        List<int[]> result4 = CleaningRobot.simulateCleaning(4, rectangles4, times4);
        for (int[] pos : result4) {
            System.out.println(Arrays.toString(pos));
        }


        System.out.println("\nTest Case 5:");
        List<CleaningRobot.Rectangle> rectangles5 = Arrays.asList(
                new CleaningRobot.Rectangle(100, 100, 200, 200),
                new CleaningRobot.Rectangle(150, 150, 250, 250),
                new CleaningRobot.Rectangle(300, 300, 400, 400)
        );
        int[] times5 = {50, 100, 150, 200, 250};
        List<int[]> result5 = CleaningRobot.simulateCleaning(3, rectangles5, times5);
        for (int[] pos : result5) {
            System.out.println(Arrays.toString(pos));
        }


        System.out.println("\nTest Case 6:");
        List<CleaningRobot.Rectangle> rectangles6 = List.of(
                new CleaningRobot.Rectangle(1, 1, 1000, 1000)
        );
        int[] times6 = {100, 200, 300, 400, 500};
        List<int[]> result6 = CleaningRobot.simulateCleaning(1, rectangles6, times6);
        for (int[] pos : result6) {
            System.out.println(Arrays.toString(pos));
        }

    }
}
