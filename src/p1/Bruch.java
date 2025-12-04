package p1;

public class Bruch {
        int z;
        int n;

        public Bruch(int zaehler, int nenner) {
            z = zaehler;
            n = nenner;
        }

        public String toString() {
        String bruch = z + ":" + n;
            return bruch;
        }
    }
