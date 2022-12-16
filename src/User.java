public class User {
    private String fio;
    private String login;
    private String password;
    private Account account;

    public User() {
    }

    public User(String fio, String login, String password, Account account) {
        this.fio = fio;
        this.login = login;
        this.password = password;
        this.account = account;
    }

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }


    public boolean isAuthorized(String log, String pass){
        return login.equals(log)&&password.equals(pass);
    }

    public boolean isEnoughMoney(double sum){
        return account.getBalance()>=sum;
    }
}
