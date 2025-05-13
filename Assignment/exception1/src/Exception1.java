public class Exception1 {
    public static void main(String[] args) throws Exception {
        String s = null;

        try{
            System.out.println(s.length());
        }catch(NullPointerException e){
            System.out.println(e.getMessage());
        } finally {
            System.out.println("プログラムの実行を終了します。");
        }
    }
}
