package h1;
public class H1_main {
    public static void main(String[] args) {
        // keine ahnung was man hier machen soll oder wie ich Klasse Zahl hier testen soll
    Zahl meineZahl = new Zahl();
    meineZahl.num =-100;
    meineZahl.setEven();
    meineZahl.setSmall();
    meineZahl.setPositive();

        System.out.println("Nummer: "+meineZahl.num);
        System.out.println("Gerade: "+meineZahl.even);
        System.out.println("Klein: "+meineZahl.small);
        System.out.println("Positiv: "+meineZahl.positive);
    }
}
