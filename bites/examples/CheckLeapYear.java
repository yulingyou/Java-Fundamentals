package bites.examples;

import java.util.ArrayList;
import java.util.List;

public class CheckLeapYear {
    public static void main(String[] args) {
        List<Integer> listLeapYear = new ArrayList<>();
        Integer year = 2010;
        while (year <=2024){
            if(isLeapYear(year)){
                listLeapYear.add(year);
            }
//            System.out.println(CheckLeapYear.isLeapYear(year));
            year ++;
        }
        System.out.println(listLeapYear);
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
