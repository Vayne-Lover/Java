import java.util.*;

class Receipt{
    private double tax = 0.06;
    private double total = 0.0;
    private Formatter f = new Formatter(System.out);
    public void printTitle(){
        f.format("%-15s %5s %10s\n", "Item", "Qty", "Price");
        f.format("%-15s %5s %10s\n", "----", "----", "----");
    }

    public void printItem(String str, int qty, double price){
        f.format("%-15s %5d %10.2f\n", str, qty, price);
        total += price;
    }

    public void printTotal(){
        f.format("%-15s %5s %10.2f\n", "Tax", "", total * tax);
        f.format("%-15s %5s %10s\n", "----", "", "----");
        f.format("%-15s %5s %10.2f\n", "Toal", "", total *= (1 + tax));

    }
    public static void main(String[] args){
        Receipt receipt = new Receipt();
        receipt.printTitle();
        receipt.printItem("Apple", 20, 10.33);
        receipt.printItem("Banana", 30, 12.12);
        receipt.printItem("Peach", 50, 5.81);
        receipt.printTotal();
    }
}