package Demo2;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Account account = new Account("001", "Hiên", 120000);
        System.out.println(account.toString());
        PersonAccount personAccount = new PersonAccount("001", "Hien", 120000, 10000);
        System.out.println(personAccount.toString());
        SavingAccount savingAccount = new SavingAccount("001", "Hiên", 120000, 5f / 100, 1);
        System.out.println(savingAccount.toString());
        float tiengui = personAccount.withDraw();
        System.out.println("Số tiền lãi bạn nhận:" +
                savingAccount.checkInteres(tiengui, account.getBalance()));
        System.out.println("Bạn có muốn rút tiền không? yes/no");
        String chose = sc.nextLine();
        if (chose.equals("yes")) {
            personAccount.deposite();
        }
    }
}
