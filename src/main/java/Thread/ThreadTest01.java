package Thread;

public class ThreadTest01 {
    public static void main(String[] args) {
Thread myThread = new MyThread();
myThread.start();

        for (int i = 0; i < 1000; i++) {
            System.out.println("主线程--->"+i);
        }
    }
}

class MyThread extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            System.out.println("分支线程--->"+i);
        }
    }
}