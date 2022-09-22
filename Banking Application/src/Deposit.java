import java.util.ArrayList;
import java.util.Scanner;

public class Deposit {
    ArrayList<Integer> userAmount = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);
    private int depositedAmount;
    private int withdrawAmount;

    public void withdrawAccount() {
        System.out.println("Enter amount to withdraw:");
        withdrawAmount = scanner.nextInt();
        if (withdrawAmount > depositedAmount) {
            System.out.println("Insufficient money to make transaction.");
        } else if (withdrawAmount <= depositedAmount || withdrawAmount == 0) {
            System.out.println("The amount you withdrew is " + withdrawAmount);
            System.out.println("Your new balance is " + (depositedAmount-withdrawAmount));
        }
    }
    public void amountDeposited() {
        System.out.println("Please enter amount to deposit:");
        depositedAmount = scanner.nextInt();
        userAmount.add(depositedAmount);
        System.out.println("The amount you deposited is " + depositedAmount);
    }
}

