package pargol;

public class GeterSeter {
    private int numDoor = 0;
    private double price = 0;


    public GeterSeter() {
        this.numDoor = 2;
        this.price = 10000;
        System.out.println("Constructor");
    }

    public GeterSeter(int numDoor, double price) {
        this.numDoor = numDoor;
        this.price = price;
    }

    public GeterSeter(double price) {
        this.price = price;
    }


    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if(price > 400 && price < 100000)
         this.price = price;
        else
          System.out.println("Price not allowed");
    }

    public int getNumDoor() {
        return numDoor;
    }

    public void setNumDoor(int nd) {
        if(nd>1 && nd<5)
        this.numDoor = nd;
    }


    public void showInfo(){
        System.out.println("the car as " + this.numDoor + " his price is:" + price);
    }

    @Override //este metodo lo puedo generar solo
    public String toString() {
        return "GeterSeter{" +
                "numDoor=" + numDoor +
                ", price=" + price +
                '}';
    }

    public boolean compareVehicles(GeterSeter v){ //no se puede hace runa comparacio v1==v2 porque son dos objetsos diferentes a pesar que sus propiedades sean la smismas
        if((numDoor == v.numDoor) && (price == v.price)) {
            System.out.println("Both are equal");
            return true;
        }
        System.out.println("They are not equal");
        return false;
    }

    public static void main(String[] args) {

        GeterSeter gt1 = new GeterSeter();
        GeterSeter gt2 = new GeterSeter();
        GeterSeter gt3 = new GeterSeter();

        gt1.setPrice(10000);
        gt1.setNumDoor(4);
        System.out.print("Info vehicle 1: ");
        gt1.showInfo();

        gt2.setPrice(20000);
        gt2.setNumDoor(3);
        System.out.print("Info vehicle 2: ");
        gt2.showInfo();

        gt3.setPrice(10000);
        gt3.setNumDoor(4);
        System.out.print("Info vehicle 3: ");
        gt3.showInfo();


        gt1.compareVehicles(gt3);
        System.out.println(gt1.toString());
    }
}
