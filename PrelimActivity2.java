public class PrelimActivity2 {
    public static void main(String[] args) {
        Person p = new Person("Jhun Mark M. Romano", 20, 2023, 2002);

        p.Age();

        System.out.println("Name: " + p.getName());
        System.out.println("Birth Year: " + p.getBirthyear());
        System.out.println("Year Today: " + p.getYeartoday());
        System.out.println("Age: " + p.getage());
    }
}
