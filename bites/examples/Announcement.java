package bites.examples;

public class Announcement {
    public static void main(String[] args) {
        System.out.println(
                Announcement.celebration()
        );
        System.out.println(
                Announcement.changeOfPlan()
        );
        System.out.println(
                Announcement.apology()
        );
        System.out.println(
                Announcement.politeNotice()
        );
        System.out.println(
                Announcement.helpNeeded()
        );
    }
    public static String celebration(){
        return "Hi, it's time to celebrate";
    }
    public static String changeOfPlan(){
        return "Hi, we need to change our plan";
    }
    public static String apology(){
        return "Hi, I am so sorry";
    }
    public static String politeNotice(){
        return "Hi, it's a kind reminder";
    }
    public static String helpNeeded(){
        return "Hi, I need some help";
    }
}
