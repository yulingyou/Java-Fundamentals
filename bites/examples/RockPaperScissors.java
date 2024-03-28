package bites.examples;

import java.util.HashMap;

public class RockPaperScissors {

    enum Result {
        Player1Win,
        Player2Win,
        Draw
    }

    enum Move {
        Rock,
        Paper,
        Scissors
    }

    public static void main(String[] args) {
        // literal hashmap java
        HashMap<Move,Result> rockMap = new HashMap<>();

        rockMap.put(Move.Rock,Result.Draw);
        rockMap.put(Move.Scissors,Result.Player1Win);
        rockMap.put(Move.Paper,Result.Player2Win);

        HashMap<Move,Result> paperMap = new HashMap<>();

        paperMap.put(Move.Rock,Result.Player1Win);
        paperMap.put(Move.Scissors,Result.Player2Win);
        paperMap.put(Move.Paper,Result.Draw);

        HashMap<Move,Result> scissorsMap = new HashMap<>();

        scissorsMap.put(Move.Rock,Result.Player2Win);
        scissorsMap.put(Move.Scissors,Result.Draw);
        scissorsMap.put(Move.Paper,Result.Player1Win);

        HashMap<Move,HashMap<Move,Result>> rules = new HashMap<>();

        rules.put(Move.Rock, rockMap);
        rules.put(Move.Paper, paperMap);
        rules.put(Move.Scissors, scissorsMap);

        System.out.println(rules.get(Move.Rock).get(Move.Paper));
        System.out.println(rules.get(Move.Paper).get(Move.Paper));
        System.out.println(rules.get(Move.Scissors).get(Move.Paper));
    }

}
