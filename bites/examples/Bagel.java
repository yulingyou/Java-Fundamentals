package bites.examples;

public class Bagel {
    public static void main(String[] args) {
        Bagel myBagel = new Bagel();
        System.out.println(myBagel.seeds());
        System.out.println(myBagel.filling());
        System.out.println(myBagel.price());
    }
    public String seeds(){
        return "Sesame seeds";
    }
    public String filling(){
        return "Peanut butter";
    }
    public Integer price(){
        return 20;
    }
}
