// luck checker
import java.util.Scanner;

public class stringAndMath {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.print("名前を入力: ");
        String name = scanner.nextLine();
        scanner.close();

        int luckPoint = (int) (Math.random() * 10) + 1;
        if(name.length() > 10){
            luckPoint += 10;
        } else if(name.length() > 5) {
            luckPoint += 5;
        } else if(name.length() > 3) {
            luckPoint += 3;
        } else if(name.length() > 1) {
            luckPoint += 1;
        }

        String luck;

        if (luckPoint >= 80) {
            luck = "大吉";
        } else if (luckPoint >= 50) {
            luck = "中吉";
        } else if (luckPoint >= 20) {
            luck = "小吉";
        } else {
            luck = "凶";
        }
        System.out.println(name + "さんの運勢は" + luck + "です。");
    }
}
