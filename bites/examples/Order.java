package bites.examples;

public class Order {
    Integer total = 0;
    public static void main(String[] args) {
        String greeting = "Hello";
        String name = "Daisy";
        Order order = new Order();
        order.addAmount(10);
        order.addDiscount(1);
        String friendlyTotal = order.friendlyTotal(greeting,name);
        System.out.println(friendlyTotal);
    }
    public void addAmount(Integer amount){
        this.total += amount;
    }
    public void addDiscount(Integer amount){
        this.total -= amount;
    }

    public Integer getTotal(){
        return this.total;
    }

    private String friendlyTotal(String greeting, String name){
        return String.format(" %1$s, %1$s Thanks! %2$s The total value of your order is %3$s", greeting, name, this.total);
    }
}
