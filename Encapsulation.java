
public class Encapsulation {

    public static void main(String[] args) {
        Bank bank = new Bank();
        bank.depositMoney(400);
    }
}

class Bank {

    private double balance = 0;

    public void depositMoney(int Amount) {
        balance += Amount;
        System.out.println(Amount+" Deposited succesfully");
    }

    public void withdrawMoney(int Amount) {
        balance -= Amount;
    }

    public double getBalance() {
        return balance;
    }
}
