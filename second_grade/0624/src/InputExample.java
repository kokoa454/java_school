import java.io.BufferedReader;
import java.io.InputStreamReader;

public class InputExample {
    public static void main(String[] args) throws Exception {
        System.out.print("あなたのお名前は？: ");
        InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(in);

        try{
            String name = reader.readLine();
            System.out.println("こんにちは、" + name + "さん");
            reader.close();
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
