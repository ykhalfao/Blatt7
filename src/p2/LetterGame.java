package p2;

public class LetterGame {
        String keyString = "FRANZ JAGT IM KOMPLETT VERWAHRLOSTEN TAXI QUER DURCH BAYERN!";
        String word ="";
        int[] a;
        public void setWord(int[]a){
            word ="";

            for (int index : a){
                char c = keyString.charAt(index);
                word += c;
            }
        }
        public void findCode(String s){
            a = new int[s.length()];
            for (int i = 0; i < s.length(); i++){
                int b = keyString.indexOf(s.charAt(i));
                a[i] = b;
            }
        }
    }

