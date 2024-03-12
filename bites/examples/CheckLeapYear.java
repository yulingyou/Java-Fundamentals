package bites.examples;

public class CheckLeapYear {
    public static void main(String[] args) {
        System.out.println(CheckLeapYear.isLeapYear(2000));
        System.out.println(CheckLeapYear.isLeapYear(1970));
        System.out.println(CheckLeapYear.isLeapYear(1900));
        System.out.println(CheckLeapYear.isLeapYear(1988));
        System.out.println(CheckLeapYear.isLeapYear(1500));
    }
    private static boolean isLeapYear(Integer year){
    if ( year % 400 == 0){
        return true;
    } else if ( year % 100 == 0 ) {
        return false;
    } else if ( year % 4 == 0 ){
        return true;
    } else {
        return false;
    }
    }
}
