package project3;


import java.awt.event.KeyEvent;
import java.util.*;

import edu.princeton.cs.algs4.Point2D;
import edu.princeton.cs.algs4.StdDraw;
import edu.princeton.cs.algs4.StdRandom;
import static project3.Points.randGen;

public class ConvexHull {


    public static void sortByPA(Point2D[] points) {
        /*
         *  code
         * */
    }


    public static Point2D[] get(Point2D[] points) {
        /*
         *  code
         * */
        return null;
    }

    public static void main(String[] args) {
        Point2D[] points = randGen(StdRandom.uniform(10, 100));
        System.out.println(Arrays.toString(points));
        StdDraw.enableDoubleBuffering();
        StdDraw.setCanvasSize(800, 800);
        StdDraw.setScale(-.05, 1.1);

        while (true) {
            if (StdDraw.isKeyPressed(KeyEvent.VK_N))
                points = randGen(StdRandom.uniform(10, 100));
            StdDraw.clear();
            Point2D[] convP = get(points);
            StdDraw.setPenRadius(0.005);
            StdDraw.setPenColor(StdDraw.RED);
            for (int i = 0; i < convP.length - 1; i++)
                StdDraw.line(convP[i].x(), convP[i].y(), convP[i + 1].x(), convP[i + 1].y());
            StdDraw.setPenColor(StdDraw.BLACK);
            StdDraw.setPenRadius(0.01);
            for (Point2D point : points) point.draw();
            StdDraw.show();
            StdDraw.pause(40);
        }

    }
}
