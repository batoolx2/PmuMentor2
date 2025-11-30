import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        UserService service = new UserService();

        System.out.println("1. Create Account");
        System.out.println("2. Login");
        System.out.print("Choose: ");

        int choice = input.nextInt();
        input.nextLine(); // consume newline

        System.out.print("Email: ");
        String email = input.nextLine();

        System.out.print("Password: ");
        String password = input.nextLine();

        if (choice == 1) {
            service.createAccount(email, password);
        } else if (choice == 2) {
            service.login(email, password);
        } else {
            System.out.println("Invalid choice");
        }

        input.close();
    }
}
