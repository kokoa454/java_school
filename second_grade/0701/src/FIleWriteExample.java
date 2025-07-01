import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;

public class FIleWriteExample {
    public static void main(String[] args) throws Exception {
        System.out.println("あなたの名前を入力してください:");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println("こんにちは、" + name + "さん!");

        try{
            File file = new File("test.txt");
            FileWriter fw = new FileWriter(file);
            fw.write("こんにちは、" + name + "さん!");
            fw.close();
        }catch(Exception e){
            System.out.println(e);
        }

        scanner.close();
    }
}
