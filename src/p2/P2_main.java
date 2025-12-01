package p2;

import java.util.Arrays;

public class P2_main {
    public static void main(String[] args){
        LetterGame g = new LetterGame();

        int[] a1 = {0, 1, 2, 43};
        g.setWord(a1);
        System.out.println(g.word);  // FRAU

        int[] a2 = {6, 7, 23, 7};
        g.setWord(a2);
        System.out.println(g.word);

        int[] a3 = {14, 2, 0, 0, 19, 19};
        g.setWord(a3);
        System.out.println(g.word);

        String s = "UNI";
        g.findCode(s);
        System.out.println("findCode("+s+"):"+ Arrays.toString(g.a));

        int[] a4 = g.a;
        g.setWord(a4);
        System.out.println("a4: "+g.word);
    }

}
