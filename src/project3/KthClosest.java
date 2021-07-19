package project3;

import edu.princeton.cs.algs4.Point2D;

public class KthClosest {

    public static Point2D get(Point2D[] points, int k) {
        /*
         *  code
         * */
        return null;
    }

    public static void main(String[] args) {
        int[][] arr = new int[][]{{1, 1}, {1, 2}, {1, 3}, {1, 4}, {1, 5}};
        Point2D[] point2DS = new Point2D[arr.length];
        for (int i = 0; i < point2DS.length; i++) {
            point2DS[i] = new Point2D(arr[i][0], arr[i][1]);
        }

        System.out.println(get(point2DS, 1).toString());//(1.0, 1.0)
        System.out.println(get(point2DS, 2).toString());//(1.0, 2.0)

    }

}
