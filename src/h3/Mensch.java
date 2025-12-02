package h3;

public class Mensch {
    public String name ="";
    public int gebJahr;
    public int alter;


    public void setName(String s){
        name =  s;
    }
    public void setGebJahr(int i) {
        gebJahr = i;
    }
    public void setAlter() {
        alter = 2025 - gebJahr;
    }
    public String getName() {
        return  name;
    }
    public int getGebJahr() {
        return gebJahr;
    }
    public int getAlter() {
        return alter;
    }
}
