import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("--- Banking System ---");
        Scanner sc = new Scanner(System.in);
        char c;
        Bank bank = new Bank();

        do {
            int opt;
            System.out.println("1. Create Account\n2. Deposit Money\n3. Withdraw Money\n4. Transfer Money\n5. View Account Details");
            System.out.print("Enter the option: ");
            opt = sc.nextInt(); sc.nextLine();

            switch (opt) {
                case 1:
                    System.out.print("Enter account holder name: ");
                    String accName = sc.nextLine();
                    System.out.print("Enter account type (savings || current): ");
                    String accType = sc.nextLine();
                    System.out.println(bank.create(accName, accType));
                    break;
                case 2:
                    System.out.print("Enter bank account no: ");
                    int accNo1 = sc.nextInt();sc.nextLine();
                    System.out.print("Enter amount to deposit: ");
                    double amt1 = sc.nextDouble();sc.nextLine();
                    System.out.println(bank.deposit(accNo1, amt1));
                    break;
                case 3:
                    System.out.print("Enter bank account no: ");
                    int accNo2 = sc.nextInt();sc.nextLine();
                    System.out.print("Enter amount to withdraw: ");
                    double amt2 = sc.nextDouble();sc.nextLine();
                    System.out.println(bank.withdraw(accNo2, amt2));
                    break;
                case 4:
                    System.out.print("Enter From account no: ");
                    int accNo3 = sc.nextInt();sc.nextLine();
                    System.out.print("Enter To account no: ");
                    int accNo4 = sc.nextInt();sc.nextLine();
                    System.out.print("Enter amount to transfer: ");
                    double amt3 = sc.nextDouble();sc.nextLine();
                    System.out.println(bank.transfer(accNo3, accNo4, amt3));
                    break;
                case 5:
                    System.out.print("Enter bank account no: ");
                    int accNo5 = sc.nextInt();sc.nextLine();
                    System.out.println(bank.view(accNo5));
                    break;
                default:
                    break;
            }

            System.out.print("Continue? (Y || y): ");
            c = sc.nextLine().charAt(0);
        } while(c == 'Y' || c == 'y');

        sc.close();
    }
}