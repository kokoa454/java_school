public class SleepExample {
    public static void main(String[] args) throws Exception {
        for(int i = 0; i < 10; i++) {
            try{
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
            System.out.println("*");
        }
    }
}
