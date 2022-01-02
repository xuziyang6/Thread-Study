package Thread;

public class AccountThread01 extends Thread {
    private Account act;

    private ThreadTest01 test01;


    public AccountThread01() {
    }

    public AccountThread01(Account act) {
        this.act = act;
    }
    public AccountThread01(Account act, ThreadTest01 test01) {
        this.act = act;
        this.test01 = test01;
    }
    public void run(){
        double money = 5000;
        try {
            //synchronized (act){
                System.out.println("开始唤醒");
                act.notify();

            act.withdraw(money);
        //}
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
