package bites.examples;

public class Discounter {
    Integer discount;
    public static void main(String[] args) {
        Discounter discounter = new Discounter(20);
        System.out.println("After discount:" + discounter.applyTo(100));
        System.out.println("After discount:" + discounter.applyTo(200));
    }

    public Discounter(Integer discount){
        this.discount = discount;
    }
    public Integer applyTo(Integer amount){
       System.out.println("Original price: " + amount);
       return amount -= discount;
    }
}
