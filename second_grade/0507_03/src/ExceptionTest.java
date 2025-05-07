public class ExceptionTest {
    public static void main(String[] args) throws Exception {
        int[] scores = new int[2]; 
        
        try{
            scores[0] = 2; 
            scores[1] = 4; 
            scores[2] = 6;
        } catch(ArrayIndexOutOfBoundsException e){
            System.out.println("例外をキャッチしました");
            System.out.println(e);
            return;
        } finally{
            System.out.println("ExceptionTestの実行を終了します");
        }
    }
}
