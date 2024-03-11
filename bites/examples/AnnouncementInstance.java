package bites.examples;

public class AnnouncementInstance {
    public static void main(String[] args) {
            AnnouncementInstance myAnnouncementInstance =  new AnnouncementInstance();
        System.out.println(
                myAnnouncementInstance.celebration()
        );
        System.out.println(
                myAnnouncementInstance.changeOfPlan()
        );
        System.out.println(
                myAnnouncementInstance.apology()
        );
        System.out.println(
                myAnnouncementInstance.politeNotice()
        );
        System.out.println(
                myAnnouncementInstance.helpNeeded()
        );
    }
    public String celebration(){
        return "Hi, it's time to celebrate";
    }
    public String changeOfPlan(){
        return "Hi, we need to change our plan";
    }
    public String apology(){
        return "Hi, I am so sorry";
    }
    public String politeNotice(){
        return "Hi, it's a kind reminder";
    }
    public String helpNeeded(){
        return "Hi, I need some help";
    }
}
