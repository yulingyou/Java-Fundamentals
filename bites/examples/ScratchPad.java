package bites.examples;

import java.util.HashMap;

public class ScratchPad {
    public static void main(String[] args) {
        HashMap<String, Integer> scores = new HashMap<String, Integer>();

        scores.put("team 1", 5);
        scores.put("team 2", 11);
        scores.put("team 3", 8);

        System.out.println(scores.get("team 1"));
        System.out.println(scores.get("team 2"));
        System.out.println(scores.get("team 3"));
    }
}
