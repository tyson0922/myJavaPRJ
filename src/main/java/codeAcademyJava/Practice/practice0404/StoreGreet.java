package codeAcademyJava.Practice.practice0404;

public class StoreGreet {
    // instance fields
    String productType;

    // constructor method
    public StoreGreet(String product) {
        productType = product;
    }
    public void greetCustomer(String customer){
        System.out.println("Welcome to the store, " + customer + "!");
    }
    // advertise method
    public void advertise() {
        String message = "Selling " + productType + "!";
        System.out.println(message);
    }

    // main method
    public static void main(String[] args) {
        StoreGreet lemonadeStand = new StoreGreet("Lemonade");
        lemonadeStand.greetCustomer("Bart Simpson");
    }
}