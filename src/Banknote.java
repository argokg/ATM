public class Banknote {
private int nominal;
private int count;

    public Banknote() {
    }

    public Banknote(int nominal, int count) {
        this.nominal = nominal;
        this.count = count;
    }

    public int getNominal() {
        return nominal;
    }

    public void setNominal(int nominal) {
        this.nominal = nominal;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

}
