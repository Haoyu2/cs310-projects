package project1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Graph {

    /**
     *
     * @param n number of nodes in a graph
     * @param edges all the edges in a graph
     * @return adjacent list representation of the graph in 2D array
     */
    public static int[][] edges2adj(int n, int[][] edges) {
        /*
         *  code
         * */
        return null;
    }

    public static int numComponent(int[][] adj) {
        /*
         *  code
         * */
        return 1;
    }




    public static boolean containsCycle(int[][] adj) {
        /*
         *  code
         * */
        return false;
    }



    public static boolean isBipartite(int[][] adj) {
        /*
         *  code
         * */
        return false;
    }

    public static void main(String[] args) {

        int n = 5;
        int[][] edges1 = new int[][]{{0, 1}, {1, 2}, {3, 4}};
        int[][] edges2 = new int[][]{{0, 1}, {1, 2}, {2, 3}, {3, 4}, {3, 0}};
        int[][] edges3 = new int[][]{{0, 1}, {1, 2}, {2, 3}, {3, 4}, {4, 0}};
        int[][] adj1 = edges2adj(n, edges1);
        int[][] adj2 = edges2adj(n, edges2);
        int[][] adj3 = edges2adj(n, edges3);
        System.out.println(Arrays.deepToString(edges2adj(n, edges1)));
        System.out.println(numComponent(edges2adj(n, edges1)));
        System.out.println(numComponent(edges2adj(n, edges2)));

        System.out.println(containsCycle(adj1));
        System.out.println(containsCycle(adj2));

        System.out.println(isBipartite(adj1));
        System.out.println(isBipartite(adj2));
        System.out.println(isBipartite(adj3));

        int[][] edj4 = new int[][]{{3,4,6},{3,6},{3,6},{0,1,2,5},{0,7,8},{3},{0,1,2,7},{4,6},{4},{}};
        System.out.println(isBipartite(edj4)); // should be true



    }
}
