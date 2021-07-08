package project2.coinchanging;

import java.util.Comparator;

public class ChangesComparator implements Comparator<int[]> {

    @Override
    public int compare(int[] changes1, int[] changes2) {
        /*
         *  code
         * */
        return 0;
    }

    public static void main(String[] args) {
        ChangesComparator changesComparator = new ChangesComparator();
        System.out.println(changesComparator.compare(new int[]{1,0,1}, new int[]{0,2,0}));
    }
}
