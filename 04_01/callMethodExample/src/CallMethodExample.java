public class CallMethodExample {
    public static void countdown(){
        System.out.println("カウンドダウンをします");
        for(int i = 5; i >= 0; i--){
            System.out.println(i);
        }
    }
    public static void main(String[] args) {
        countdown();
    }
}
