package h3;

public class H3_main {
    public static void main(String[] args) {
        Mensch Elsa = new Mensch();
        Elsa.setGebJahr(2010);
        Elsa.setName("Elsa");
        Elsa.setAlter();
        System.out.println(Elsa.getName());
        System.out.println("Geboren:  "+Elsa.getGebJahr());
        System.out.println("Alter:    "+Elsa.getAlter());

    }
}
