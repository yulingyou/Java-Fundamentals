package bites.examples;

public class FizzBuzz {
    public static void main(String[] args) {
        // for loop from 1 to 100
//        for(Integer counter = 1; counter <= 100 ; counter++){
//            System.out.println(FizzBuzz.play(counter));
//        }
        // while loop from 1 to 100
//        Integer counter = 0;
//        while(counter <= 100){
//            System.out.println(play(counter));
//            counter ++;
//        }
        for(Integer counter = 100; counter >= 1; counter--){
            System.out.println(play(counter));
        }

    }

    private static String play(Integer number) {
        if(number % 15 == 0){
            return "FizzBuzz";
        } else if (number % 5 == 0) {
            return "Buzz";
        } else if (number % 3 == 0) {
            return "Fizz";
        } else {
            return number.toString();
        }
    }
}
