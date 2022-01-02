package Thread;

public class AccountThread extends Thread {
    private Account act;

    private ThreadTest01 test01;


    public AccountThread() {
    }

    public AccountThread(Account act) {
        this.act = act;
    }
    public AccountThread(Account act,ThreadTest01 test01) {
        this.act = act;
        this.test01 = test01;
    }
    public void run(){
        double money = 5000;
        try {
            //synchronized (act){
                System.out.println("开始取钱");
                //act.wait();

            act.withdraw(money);
        //}
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
