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
    }
}
