package bites.examples;

import java.util.ArrayList;
import java.util.Arrays;

public class Queue {
    ArrayList<String> people =new ArrayList<>();
    public static void main(String[] args) {

        Queue queue = new Queue();
        Queue queue1 = new Queue();
        queue.add("Mary");
        queue.add("Henry");
        queue.next();
        queue.add("Jimmy");
        queue.state();
        System.out.println(queue.people);
        queue1.add("Happy");
        queue1.state();
    }

    private void state() {
        System.out.println(people);
    }

    private void next() {
        if (people.get(0) != null){
            people.remove(0);
        }
    }

    private void add(String personName) {
        this.people.add(personName);
    }

}
