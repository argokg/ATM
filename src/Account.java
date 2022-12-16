public class Account {
    private long num;
    private double balance;

    public Account() {
    }

    public Account(long num, double balance) {
        this.num = num;
        this.balance = balance;
    }

    public long getNum() {
        return num;
    }

    public void setNum(long num) {
        this.num = num;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
