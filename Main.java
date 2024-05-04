import company.beans.Person;

public class Main {
    public static void main(String[] args) {
        try {
            Person person = new Person("Klaudia", 14);
            System.out.println("Name: " + person.getName());
            System.out.println("Age: " + person.getAge());
        } catch (Exception ex) {
            System.out.println(ex);
        }

        try {
            Person person = new Person("Piotr", 138);
            System.out.println("Name: " + person.getName());
            System.out.println("Age: " + person.getAge());
        } catch (Exception ex) {
            System.out.println(ex);
        }

    }
}