package project3;
import edu.princeton.cs.algs4.Point2D;
import edu.princeton.cs.algs4.StdRandom;


public class Points {
    public static Point2D[] randGen(int num) {
        Point2D[] points = new Point2D[num];
        for (int i = 0; i < num; i++) {
            points[i] = new Point2D(StdRandom.uniform(), StdRandom.uniform());
        }
        return points;
    }

    public static Point2D[] copy(Point2D[] points){
        Point2D[] copy = new Point2D[points.length];
        for (int i = 0; i < points.length; i++) {
            copy[i] = new Point2D(points[i].x(), points[i].y());
        }
        return copy;
    }

    public static String toString(Point2D[] points){
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < points.length; i++) {
            sb.append(points[i].toString());
        }
        return sb.toString();
    }

}
