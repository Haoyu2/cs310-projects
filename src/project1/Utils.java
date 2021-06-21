package project1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Utils {

    public static Integer[] toObjectArray(int[] arr){
        /*
        *  code
        * */
        return null;
    }

    public static Double[] toObjectArray(double[] arr) {
        /*
         *  code
         * */
        return null;
    }

    public static int[] toPrimitiveArray(Integer[] arr){
        /*
         *  code
         * */
        return null;
    }

    public static double[] toPrimitiveArray(Double[] arr){
        /*
         *  code
         * */
        return null;
    }

    public static int[][] to2DArray(List<Integer>[] lists){
        /*
         *  code
         * */
        return null;
    }
    public static void main(String[] args) {
        List<Integer>[] lists = new List[2];
        lists[1] = new ArrayList<>(){{add(1);}};
        lists[1].add(1);
        lists[0] = new ArrayList<>(){{add(1);}};
        System.out.println(Arrays.deepToString(to2DArray(lists)));
    }
}
