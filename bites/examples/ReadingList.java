package bites.examples;

import java.util.Arrays;

public class ReadingList {
    String[] unread = new String[4];

    public static void main(String[] args) {
        // creating reading list array
        ReadingList readingList = new ReadingList();
        readingList.add("book 1");
        readingList.add("book 2");
        readingList.add("book 3");
        System.out.println(readingList.unread[0]);
        System.out.println(readingList.unread[1]);
        System.out.println(readingList.unread[2]);
        System.out.println(readingList.unread[3]);
        System.out.println(Arrays.toString(readingList.unread));

    }

    private void add(String book) {
        Boolean continueSearch = true;
        Integer index = 0;
        while(continueSearch){
            if(this.unread[index] == null){
                this.unread[index] = book;
                continueSearch = false;
            }else{
                index++;
            }
        }
    }
}
