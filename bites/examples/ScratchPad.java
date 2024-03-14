package bites.examples;

import java.util.HashMap;

public class ScratchPad {
    public static void main(String[] args) {
        HashMap<String, Integer[]> scores = new HashMap<String, Integer[]>();

        scores.put("team 1", new Integer[] {1,3,5});
        scores.put("team 2",  new Integer[] {7,3,5});
        scores.put("team 3",  new Integer[] {5,7,0});

        System.out.println(scores.get("team 1")[0]);
        System.out.println(scores.get("team 2")[1]);
        System.out.println(scores.get("team 3")[2]);
    }
}
