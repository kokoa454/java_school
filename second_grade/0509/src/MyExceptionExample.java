class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}

public class MyExceptionExample {
    public static void main(String[] args) throws Exception {
        int age = -10;

        try{
            if (age < 0) {
                throw new InvalidAgeException("年齢にマイナスの値が指定されました");
            } 

            System.out.println("年齢:" + age);
        }catch(InvalidAgeException e) {
            System.out.println("例外をキャッチしました");
            System.out.println(e);
        }
    }
}
