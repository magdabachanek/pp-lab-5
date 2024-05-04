import company.beans.Person;
import company.exceptions.InvalidAgeException;
import company.implementations.EmailMessenger;
import company.utils.MathUtils;

public class Main {
    public static void main(String[] args) {
        Person[] people = new Person[5];
        final int b = 10;

        try {
            people[0] = new Person("John Doe", 30);
            people[1] = new Person("Anthony Hopkins", 58);
            people[2] = new Person("Clint Estwood", 53);
            people[3] = new Person("Tom Hanks", 39);
            people[4] = new Person("Johnny Depp", 64);
        } catch (InvalidAgeException e) {
            System.out.println("Incorrect age: " + e.getMessage());
        }

        EmailMessenger emailMessenger = new EmailMessenger();

        for (Person person : people) {
            if (person != null) {
                int value = MathUtils.add(person.getAge(), b);
                emailMessenger.sendMessage(person.getName() + " value is: " + value);
            }
        }
    }
}