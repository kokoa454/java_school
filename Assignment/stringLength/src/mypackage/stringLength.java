package mypackage;
import java.util.Scanner;

public class StringLength {
    public void checkPassword() {
        Scanner scanner = new Scanner(System.in);

        while(true){
            System.out.print("パスワードを入力: ");
            String password = scanner.nextLine();

            if (password.length() < 8) {
                System.out.println("ERROR: パスワードは8文字以上でなければいけません。");
            } else {
                System.out.println("パスワードは有効です。");
                break;
            }
        }

        scanner.close();
    }
}
