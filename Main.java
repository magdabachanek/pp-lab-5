import company.implementations.EmailMessenger;
import company.utils.MathUtils;

public class Main {
    public static void main(String[] args) {
        int result = MathUtils.add(8, 4);
        System.out.println("Wyniki: " + result);

        EmailMessenger emailMessenger = new EmailMessenger();
        emailMessenger.sendMessage("Wyniki: " + result);
    }
}