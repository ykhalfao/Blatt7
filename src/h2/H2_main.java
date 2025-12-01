package h2;

import java.util.Arrays;

public class H2_main {
    public static void main(String[] args) {
        int[] a = {2,7,1,9};
        int[] b = {2,7,1,9};
        System.out.println(Arrays.toString(change(a,b,3,4)));
    }
    static public int[] change (int[]a,int[]b,int start,int end){
        if (end > start && Arrays.compare(a,b) != 0){
            int[] gleichA = a;
            return gleichA;
        }
        else if (Arrays.compare(a,b) == 0 && end > start){
            Arrays.sort(a);
        int[] neuesA = Arrays.copyOfRange(a,start,end);
        return neuesA;
        }
        else if (end <= start){
        int[] c = new int[0];
        return c;
        }
    return a;
    }

}
