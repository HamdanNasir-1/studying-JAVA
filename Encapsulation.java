
public class Encapsulation {

    public static void main(String[] args) {
        Bank bank = new Bank();
        bank.deposit(400);
        bank.withdraw(400);
    }
}

class Bank {

    private double balance = 0;

    public void deposit(int Amount) {
        balance += Amount;
        System.out.println(Amount+" Deposited succesfully");
    }

    public void withdraw(int Amount) {
        balance -= Amount;
        System.out.println(Amount+" Withdrawn succesfully");
    }

    public double getBalance() {
        return balance;
    }
}
