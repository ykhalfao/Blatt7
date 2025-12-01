package h1;
public class Zahl {
    boolean evan;
    boolean small;
    boolean positive;
    int num;

    public int getNum(int i){
        num=i;
        return num;
    }
    public void setEvan(){
        if (num<0) {
            num = -1*num;
        }
        if (num % 2 == 0){
            evan = true;
        }else {
            evan = false;
        }
    }
    public void setSmall(){
        if (num<100){
            small = true;
        }else {
            small= false;
        }
    }
    public void setPositive(){
        if (num>0){
            positive = true;
        }else {
            positive = false;
        }
    }
}
