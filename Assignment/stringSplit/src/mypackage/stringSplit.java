package mypackage;
import java.util.List;

public class StringSplit {
    public void splitList() {
        List<String> employees = List.of(
            "武藤敬司, 61, 男, NE",
            "長州力, 73, 男, SE",
            "天龍源一郎, 75, 男, PG",
            "蝶野正洋, 61, 男, FE",
            "棚橋弘至, 48, 男, BE",
            "中邑真輔, 45, 男, CE",
            "オカダ・カズチカ, 37, 男, QA",
            "タイガーマスク（佐山サトル）, 66, 男, PM"
        );

        for(int i = 0; i < employees.size(); i++) {
            String employee = employees.get(i);
            String[] person = employee.split(", ");
            System.out.print("名前: " + person[0] + " ");
            System.out.print("年齢: " + person[1] + "歳 ");
            System.out.print("性別: " + person[2]+ " ");

            String post = person[3];

            switch (post) {
                case "NE" -> post = "ネットワークエンジニア";
                case "SE" -> post = "システムエンジニア";
                case "PG" -> post = "プログラマー";
                case "FE" -> post = "フロントエンドエンジニア";
                case "BE" -> post = "バックエンドエンジニア";
                case "CE" -> post = "クラウドエンジニア";
                case "QA" -> post = "QAエンジニア";
                case "PM" -> post = "プロジェクトマネージャー";
                default -> {
                    post = "未割り当て";
                }
            }

            System.out.print("職業: " + post);
            System.out.println("");
        }
    }
}
