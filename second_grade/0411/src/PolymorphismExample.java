public class PolymorphismExample {
    public static void main(String[] args) throws Exception {
        class Person{
            void work(){
                System.out.println("人です。仕事をします。");
            }
        }

        class Student extends Person{
            void work(){
                System.out.println("学生です。勉強します。");
            }
        }

        class Teacher extends Person{
            void work(){
                System.out.println("教員です。授業をします。");
            }

            void makeTest(){
                System.out.println("試験問題を作ります。");
            }
        }

        Person[] people = new Person[3];

        people[0] = new Person();
        people[1] = new Student();
        people[2] = new Teacher();

        for(int i = 0; i < people.length; i++){
            people[i].work();

            if(people[i] instanceof Teacher){
                ((Teacher)people[i]).makeTest();
            }
        }
    }
}
