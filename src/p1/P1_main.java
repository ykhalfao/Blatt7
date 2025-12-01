package p1;

public class P1_main {
    public static void main(String[] args) {
        multFrac(5, 2, 3, 4);
        Bruch a = new Bruch(5, 2);
        Bruch b = new Bruch(3, 4);
        multFrac(a, b);

    }
    public static class Bruch {
        int z;
        int n;

        public Bruch(int zaehler, int nenner) {
            z = zaehler;
            n = nenner;
        }

        public String toString() {
            return z + ":" + n;
        }
    }
    static public void multFrac(int z1, int n1, int z2, int n2) {
        int AusgabeZ = z1 * z2;
        int AusgabeN = n1 * n2;
        System.out.println(AusgabeZ + ":" + AusgabeN);
    }

    public static void multFrac(Bruch a, Bruch b) {
        int ergZ = a.z * b.z;
        int ergN = a.n * b.n;

        Bruch ergebnis = new Bruch(ergZ, ergN);
        System.out.println(ergebnis);
    }
}
