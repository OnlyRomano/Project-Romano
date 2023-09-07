public class Person {
    private String name;
    private int age, YT, BY;

    public Person(String name, int age, int YT, int BY) {
        this.age = age;
        this.BY = BY;
        this.YT = YT;
        this.name = name;
    }

    public void Age() {
        age = YT - BY;
    }

    public String getName() {
        return name;
    }

    public int getage() {
        return age;
    }

    public int getYeartoday() {
        return YT;
    }

    public int getBirthyear() {
        return BY;
    }
}
