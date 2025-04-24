import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        String str = "いなりを食べたい。";
        System.out.println(str);

        System.out.println(str.contains("いなり"));
        System.out.println(str.contains("ハンバーグ"));

        List<String> array = List.of(str.split("を"));
        for(int i = 0; i < array.size(); i++){
            if(array.get(i).equals("を")){
                array.remove(i);
            }
        }

        for(int i = 0; i < array.size(); i++){
            System.out.println(array.get(i));
        }

        String str2 = str.replace("いなり", "ハンバーグ");
        System.out.println(str2);
    }
}
