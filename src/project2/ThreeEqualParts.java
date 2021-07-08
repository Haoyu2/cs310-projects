package project2;

public class ThreeEqualParts {
    public static boolean equals(int[] arr){
        /*
         *  code
         * */
        return true;
    }

    public static void main(String[] args) {
        int[] arr1 =  new int[]{0,2,1,-6,6,-7,9,1,2,0,1};// true
        int[] arr2 = new int[]{0,2,1,-6,6,7,9,-1,2,0,1};// false
        int[] arr3 = new int[]{3,3,6,5,-2,2,5,1,-9,4};// true
        int[] arr4 = new int[]{6,6,0,0,0, 6,0,0,0};// true
        System.out.println(equals(arr1));
        System.out.println(equals(arr2));
        System.out.println(equals(arr3));
        System.out.println(equals(arr4));
    }
}
