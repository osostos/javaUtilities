package pargol;

public class Overloading {
    Overloading(){

    }

    public int Adition(int s1, int s2, int s3){
        return s1 + s2 + s3;
    }
    public double Adition(double s1, double s2, double s3){
        return s1 + s2 + s3;
    }

    public static void main(String[] args) {
        Overloading s = new Overloading();
        s.Adition(8,9,0);
        s.Adition(5.8,6, 9);
    }
}
