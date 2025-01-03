package com.ia.iccp.losung;

import java.util.*;


public class CleaningRobot {

    public static class Rectangle {
        int x1, y1, x2, y2;

        public Rectangle(int x1, int y1, int x2, int y2) {
            this.x1 = x1;
            this.y1 = y1;
            this.x2 = x2;
            this.y2 = y2;
        }

        boolean containsPoint(int x, int y) {
            return x >= x1 && x <= x2 && y >= y1 && y <= y2;
        }

        // return the clockwise
        List<int[]> getEdges() {
            List<int[]> edges = new ArrayList<>();
            for (int i = x1; i <= x2; i++) edges.add(new int[]{i, y1}); // Top edge
            for (int i = y1 + 1; i <= y2; i++) edges.add(new int[]{x2, i}); // Right edge
            for (int i = x2 - 1; i >= x1; i--) edges.add(new int[]{i, y2}); // Bottom edge
            for (int i = y2 - 1; i > y1; i--) edges.add(new int[]{x1, i}); // Left edge
            return edges;
        }
    }

    public static List<int[]> simulateCleaning(int n, List<Rectangle> rectangles, int[] times) {
        List<int[]> trajectory = new ArrayList<>();
        List<int[]> fullPath = new ArrayList<>();

        List<Rectangle> mutableRectangles = new ArrayList<>(rectangles);

        mutableRectangles.sort(Comparator.comparingInt(r -> r.x1));

        for (int i = 0; i < mutableRectangles.size(); i++) {
            Rectangle rectangle = mutableRectangles.get(i);
            fullPath.addAll(rectangle.getEdges());


            if (i < mutableRectangles.size() - 1) {
                Rectangle nextRectangle = mutableRectangles.get(i + 1);
                fullPath.addAll(createTransition(rectangle, nextRectangle));
            }
        }

        int time = 0, index = 0;
        Map<Integer, int[]> timeMap = new HashMap<>();
        while (time <= Arrays.stream(times).max().getAsInt() && index < fullPath.size()) {
            timeMap.put(time, fullPath.get(index));
            time++;
            index = (index + 1) % fullPath.size();
        }

        for (int t : times) {
            trajectory.add(timeMap.getOrDefault(t, fullPath.get(0)));
        }
        return trajectory;
    }


    private static List<int[]> createTransition(Rectangle from, Rectangle to) {
        List<int[]> transition = new ArrayList<>();
        int x = from.x2, y = from.y2;

        while (x != to.x1) {
            x += (to.x1 > x) ? 1 : -1;
            transition.add(new int[]{x, y});
        }

        while (y != to.y1) {
            y += (to.y1 > y) ? 1 : -1;
            transition.add(new int[]{x, y});
        }

        return transition;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Rectangle> rectangles = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int x1 = sc.nextInt();
            int y1 = sc.nextInt();
            int x2 = sc.nextInt();
            int y2 = sc.nextInt();
            rectangles.add(new Rectangle(x1, y1, x2, y2));
        }

        int[] times = new int[5];
        for (int i = 0; i < 5; i++) {
            times[i] = sc.nextInt();
        }

        List<int[]> result = simulateCleaning(n, rectangles, times);
        for (int[] position : result) {
            System.out.println(position[0] + " " + position[1]);
        }
    }
}
