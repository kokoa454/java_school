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

public class InheritanceExample {
    public static void main(String[] args) {
        IStudentCard a = new IStudentCard();
        a.id = 2345;
        a.name = "John Smith";
        a.nationality = "The UK";
        a.printInfo();
    }
}
