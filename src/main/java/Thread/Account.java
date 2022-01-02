package Thread;

public class Account {
    private String actno;

    public Account(String actno, double balance) {
        this.actno = actno;
        this.balance = balance;
    }

    public void setActno(String actno) {
        this.actno = actno;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    private double balance;



    public void withdraw(double money) throws InterruptedException {
synchronized (this){
       double before = this.balance;
        double after = before-money;
        //Thread.sleep(1000);
        this.setBalance(after);
        System.out.println("线程"+Thread.currentThread().getName()+"账户"+ actno +"取款成功,余额"+balance);
    }}

























}
