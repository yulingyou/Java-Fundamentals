package bites.examples;

public class ProgrammingLanguage {
    String name;
    Integer yearOfCreation;
    String creator;

    public ProgrammingLanguage(String name, Integer yearOfCreation, String creator){
        this.name = name;
        this.yearOfCreation = yearOfCreation;
        this.creator = creator;
    }
    public String getName(){
        return this.name;
    }

    public Integer getYearOfCreation(){
        return this.yearOfCreation;
    }

    public String getCreator(){
        return this.creator;
    }


    public static void main(String[] args) {
        ProgrammingLanguage programmingLanguage1 = new ProgrammingLanguage("Happy Language",2024,"Daisy");
        System.out.println(programmingLanguage1.getName());
        System.out.println(programmingLanguage1.getYearOfCreation());
        System.out.println(programmingLanguage1.getCreator());
        ProgrammingLanguage programmingLanguage2 = new ProgrammingLanguage("Sad Language",2024,"Daisy");
        System.out.println(programmingLanguage2.getName());
        System.out.println(programmingLanguage2.getYearOfCreation());
        System.out.println(programmingLanguage2.getCreator());
        ProgrammingLanguage programmingLanguage3 = new ProgrammingLanguage("Awesome Language",2024,"Daisy");
        System.out.println(programmingLanguage3.getName());
        System.out.println(programmingLanguage3.getYearOfCreation());
        System.out.println(programmingLanguage3.getCreator());
    }

}
