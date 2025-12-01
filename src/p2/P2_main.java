package p2;     //Fragen: warum muss ich ueberall string schreiben damit der code funktioniert und bitte nochmal den ganzen objekt und attribute kram erklaeren lassen. VLt auch erklaeren lassen warum der code so funktioniert (war ja mit viel "hilfe")
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
    }
    public static class LetterGame{
        static String keyString = "FRANZ JAGT IM KOMPLETT VERWAHRLOSTEN TAXI QUER DURCH BAYERN!";
        static String word ="";
    public static void setWord(int[]a){
        word ="";

        for (int index : a){
            char c = keyString.charAt(index);
            word += c;
        }
    }
    }
}
