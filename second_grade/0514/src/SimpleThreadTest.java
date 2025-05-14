class MyThread extends Thread {
    public void run() {
        for(int i = 0; i < 100; i++) {
            System.out.println("MyThreadのrunメソッド(" + i + ")");
        }
    }
}

public class SimpleThreadTest {
    public static void main(String[] args) throws Exception {
        MyThread myThread = new MyThread();
        myThread.start();

        for(int i = 0; i < 100; i++) {
            System.out.println("SimpleThreadTestのmainメソッド(" + i + ")");
        }
    }
}
