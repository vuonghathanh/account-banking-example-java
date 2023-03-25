import java.util.Scanner;

public class BankService {
    enum Type {
        DEPOSIT,
        WITHDRAW
    }

    public static Account input() {
        Account account = new Account();
        Scanner scanner = new Scanner(System.in);
        boolean valid = false;

        while (!valid) {
            System.out.println(" Customer code (5 characters): ");
            String code = scanner.nextLine();

            if (code.length() != 5) {
                System.out.println("Customer code must be 5 characters long");
                continue;
            }
            valid = true;
            account.setCustomerCode(code);
        }

        System.out.println("Enter customer name: ");
        String name = scanner.nextLine();
        account.setCustomerName(name);


        valid = false;
        while (!valid) {
            System.out.println("Enter account number (6 digits starting with 100): ");
            String accountNumber = scanner.nextLine();
            int accNumber;

            try {
                accNumber = Integer.parseInt(accountNumber);
            } catch (NumberFormatException e) {
                System.out.println("Account number is not a number");
                continue;
            }

            if (accountNumber.length() != 6 && !accountNumber.startsWith("100")) {
                System.out.println("Account number must be 6 digits starting with 100");
                continue;
            }
            valid = true;
            account.setAccNumber(accNumber);
        }

        return account;
    }

    public static void depositAndWithdraw(Account account) {
        Scanner scanner = new Scanner(System.in);
        boolean valid = false;
        Type type = null;
        long money = 0;

        while(!valid) {
            try {
                System.out.println("Enter type (DEPOSIT or WITHDRAW): ");
                type = Type.valueOf(scanner.nextLine());
                valid = true;
            } catch (IllegalArgumentException e) {
                System.out.println("Invalid type");
            }
        }

        valid = false;
        while (!valid) {
            try {
                System.out.println("Enter money: ");
                money = Long.parseLong(scanner.nextLine());
                valid = true;
            } catch (NumberFormatException e) {
                System.out.println("Invalid money");
            }
        }


        switch (type) {
            case DEPOSIT:
                if (money > 0) {
                    account.setAmount(account.getAmount() + money);
                } else {
                    System.out.println("Deposit amount must be greater than 0");
                }
                break;
            case WITHDRAW:
                if (money > 0 && money <= account.getAmount()) {
                    account.setAmount(account.getAmount() - money);
                } else {
                    System.out.println("Withdraw amount must be greater than 0 and less than or equal to the current balance");
                }
                break;
            default:
                System.out.println("Invalid type");
        }
        System.out.println(account.toString());
    }
}
