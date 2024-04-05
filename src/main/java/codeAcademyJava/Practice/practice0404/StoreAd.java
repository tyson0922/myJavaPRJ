package codeAcademyJava.Practice.practice0404;

public class StoreAd {
    // instance fields
    String productType;

    // constructor method
    public StoreAd(String product) {
        productType = product;
    }

    // advertise method
    public void advertise() {
        System.out.println("Selling " + productType + "!");
        System.out.println("Come spend some money!");
    }

    // main method
    public static void main(String[] args) {
        StoreAd lemonadeStand = new StoreAd("Lemonade");
        lemonadeStand.advertise();
        lemonadeStand.advertise();
        lemonadeStand.advertise();

    }
}