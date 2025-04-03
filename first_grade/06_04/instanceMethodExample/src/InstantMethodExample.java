public class InstantMethodExample {
    public static void main(String[] args) {
        StudentCard a = new StudentCard(1234, "鈴木太郎");
        StudentCard b = new StudentCard(1235, "佐藤花子");
        a.printfInfo();
        b.printfInfo();
    }
}

class StudentCard{
    int id;
    String name;

    StudentCard(int id, String name){
        this.id = id;
        this.name = name;
    }

    void printfInfo(){
        System.out.println("学籍番号: " + this.id);
        System.out.println("氏名: " + this.name);
    }
}