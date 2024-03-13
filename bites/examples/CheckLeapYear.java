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
        System.out.println(listLeapYear.set(1,1000));
        System.out.println(listLeapYear.get(1));
        System.out.println(listLeapYear);
        System.out.println(listLeapYear.remove(1));
        System.out.println(listLeapYear);
        System.out.println(listLeapYear.add(2025));
        System.out.println(listLeapYear);
        for (Integer element : listLeapYear) {
            System.out.println(element);
        }
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
