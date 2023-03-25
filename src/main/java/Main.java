import java.util.Scanner;

public class Main {
    private static final BankService bankService = new BankService();

    public static void main(String[] args) {
        Account account = BankService.input();
        BankService.depositAndWithdraw(account);
    }
}
