
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static Scanner scanner = new Scanner(System.in);
    public static ArrayList<String> users = new ArrayList<>();

    public static void main(String[] args) {
        System.out.println("Please enter username:");
        String userName = scanner.nextLine();
        users.add(userName);
        System.out.println("Please enter userID:");
        String userID = scanner.nextLine();
        users.add(userID);

        System.out.println("Welcome " + userName + ". Your ID number is: " + userID);
        System.out.println("Please enter a choice:");

        Deposit userDeposit = new Deposit();

        while (true) {
            instructions();
            int choice = 1;
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    infoAccount();
                    break;
                case 2:
                    userDeposit.amountDeposited();
                    break;
                case 3:
                    userDeposit.withdrawAccount();
                    break;
                case 4:
                    System.exit(0);
                    break;
            }
            if (choice > 4)
                System.out.println("Choice not found.");
        }
    }

    public static void instructions() {
        System.out.println();
        System.out.println("Press 1 for account information.");
        System.out.println("Press 2 to make a deposit.");
        System.out.println("Press 3 to withdraw from your account.");
        System.out.println("Press 4 to cancel all transactions.");
        System.out.println();
    }

    public static void infoAccount() {
        String userName = users.toString();
        for (int i = 0; i < users.size(); i++) {
            users.get(i + 1).equals(userName);
            System.out.println("Your account information is " + userName);
        }
    }
}
