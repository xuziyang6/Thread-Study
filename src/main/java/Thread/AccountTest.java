package Thread;

public class AccountTest {
    public static void main(String[] args) {
        Account act = new Account("act-001",15000);
ThreadTest01 threadTest01 = new ThreadTest01();
        //ThreadTest01 threadTest02 = new ThreadTest01();
        Thread t1 = new AccountThread(act);
        //Thread t2 = new AccountThread01(act);
        Thread t3 = new AccountThread(act);
    t1.setName("t1");
    //t2.setName("t2");
        t3.setName("t3");
        t1.start();
    //t2.start();


        t3.start();
    }
}