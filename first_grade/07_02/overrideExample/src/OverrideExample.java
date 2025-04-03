class StudentCard{
    int id;
    String name;

    void printInfo(){
        System.out.println("学籍番号: " + this.id);
        System.out.println("氏名: " + this.name);
    }
}

class IStudentCard extends StudentCard{
    String nationality;

    void printInfo(){
        System.out.println("学籍番号: " + this.id);
        System.out.println("氏名: " + this.name);
        System.out.println("国籍: " + this.nationality);
    }
}

public class OverrideExample {
    public static void main(String[] args) {
        StudentCard a = new StudentCard();
        a.id = 1234;
        a.name = "鈴木太郎";
        a.printInfo();

        IStudentCard b = new IStudentCard();
        b.id = 2345;
        b.name = "John Smith";
        b.nationality = "The UK";
        b.printInfo();
    }
}