public class testSuper {
    public static void main(String[] args) {
        BalanceAccount ba = new BalanceAccount();
        ba.keep();
    }
}


class Account{
    private String id;
    private double score;

    public Account() {
    }

    public Account(String id, double score) {
        this.id = id;
        this.score = score;
    }

    public void change(){
        System.out.println("Account 的change方法");
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}

class BalanceAccount extends Account{
    private double balance;

    public BalanceAccount(){}
    public BalanceAccount(double balance) {
        this.balance = balance;
    }

    public BalanceAccount(String id, double score, double balance) {
        super(id, score);
        this.balance = balance;
    }

    public void change(){
        System.out.println("BalanceAccount 的change方法");
    }

    public void keep(){
        this.change();
        change();
        super.change();
    }
}