import java.util.Map;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashMap;
import java.io.IOException;

public class HashMapAsk {
    Map<String, HData> map = new HashMap<>();

    void start(){
        readData();
        search("緑田");
    }

    void readData(){
        String entry;
        double weight = 0;
        double height = 0;
        String name = null;
        try(BufferedReader din = new BufferedReader(new FileReader("listdata.txt"))){
            while((entry = din.readLine()) != null){
                Scanner sc = new Scanner(entry);
                if(sc.hasNext()){
                    name = sc.next();
                }
                if(sc.hasNextDouble()){
                    weight = sc.nextDouble();
                }
                if(sc.hasNextDouble()){
                    height = sc.nextDouble();
                }
                map.put(name, new HData(name, weight, height));
                sc.close();
            }
        }
        catch(IOException e){
            System.out.println("IOエラー発生");
            e.printStackTrace();
            System.exit(1);
        }
    }

    void search(String name){
        HData r = map.get(name);
        if(r != null){
            System.out.println(name + "さんのデータはありません");
        }
        else{
            System.out.println(r);
        }
    }

    class HData{
        String name;
        double weight;
        double height;

        HData(String name, double weight, double height){
            this.name = name;
            this.weight = weight;
            this.height = height;
        }
        @Override
        public String toString(){
            return("(" + name + ", " + weight + ", " + height + ")");
        }
    }
    
    public static void main(String[] args) throws Exception {
        new HashMapAsk().start();
    }
}
