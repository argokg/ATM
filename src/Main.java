import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Banknote hundred = new Banknote(100, 5);
        Banknote fiveHundred = new Banknote(500, 10);
        Banknote thousand = new Banknote(1000, 3);
        Banknote fiveThousand = new Banknote(5000, 5);

        ATM atm = new ATM("kievskaya",new Banknote[]{hundred, fiveHundred, thousand, fiveThousand});
        User user = new User("david", "david", "pass", new Account(21342445L, 5000));


        withdrawal(user, atm);
    }
    static void withdrawal(User user, ATM atm){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите логин: ");
        String login = scanner.next();
        System.out.println();
        System.out.println("Введите пароль: ");
        String pass = scanner.next();
        if(user.isAuthorized(login,pass)){
            System.out.println("введите сумму: ");
            double sum= scanner.nextDouble();
            if(user.isEnoughMoney(sum)) {
                if (atm.getCash(sum)) {
                    System.out.println("Возьмите деньги! " + sum);
                }
                else{
                    System.out.println("Банкомат временно не работает");
                }
            }else{
                System.out.println("На вашем счету не достанточно средств");
            }
        }else {
            System.out.println("Иди отсюда мошенник");
        }

    }
}