public class App {
    public static void main(String[] args) throws Exception {
        int a = 4;
        int b = 0;

        try{
            int c = a / b;
            System.out.println("cの値は" + c);
        } catch (ArithmeticException e) {
            System.out.println("例外をキャッチしました");
        } finally{
            System.out.println("プログラムを終了します");
        }
    }
}
