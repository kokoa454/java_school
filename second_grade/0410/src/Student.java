public class Student {
    public static void main(String[] args) throws Exception {
        class StudentCard{
            int id;
            String name;
    
            public StudentCard(int id, String name) {
                this.id = id;
                this.name = name;
            }
    
            void printInfo(){
                System.out.println(id);
                System.out.println(name);
            }
        }
    
        class IStudentCard extends StudentCard{
            String nationality;
    
            public IStudentCard(int id, String name, String nationality) {
                super(id, name);
                this.nationality = nationality;
            }
    
            void printInfo(){
                System.out.println(id);
                System.out.println(name);
                System.out.println(nationality);
            }
        }

        StudentCard studentA = new StudentCard(1, "Inari");
        studentA.printInfo();

        IStudentCard studentB = new IStudentCard(2, "John", "American");
        studentB.printInfo();
    }
}
