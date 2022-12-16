public class ATM {
    private String name;
    private double balance;
    private Banknote[] banknotes;

    public ATM() {
    }

    public ATM(String name, Banknote[] banknotes) {
        this.name = name;
        this.balance = balanceSum(banknotes);
        this.banknotes = banknotes;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBalance() {
        return balance;
    }



    public Banknote[] getBanknotes() {
        return banknotes;
    }

    public void setBanknotes(Banknote[] banknotes) {
        this.banknotes = banknotes;
    }

    private double balanceSum(Banknote[] banknotes){
        double sum = 0;
        for (Banknote b: banknotes) {
            sum+=b.getCount()*b.getNominal();
        }

        return sum;
    }
    public boolean getCash(double sum){
        if(balance>sum){
            balance-=sum;
            return true;
        }
        return false;
    }

    public Banknote[] cash(double sum){
        if(sum<=5000){

        }
        return null;
    }


}
