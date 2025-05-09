class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}

class Person{
    int age;
    void setAge(int age) throws InvalidAgeException {
        if(age < 0){
            throw new InvalidAgeException("年齢にマイナスの値が指定されました");
        }
        this.age = age;
    }
}

public class MyExceptionExample {
    public static void main(String[] args) throws Exception {
        Person p = new Person();
        try{
            p.setAge(-5);
        } catch(InvalidAgeException e){
            System.out.println(e);
        }
    }
}
