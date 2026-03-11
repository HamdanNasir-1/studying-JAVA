
public class Encapsulation {

    public static void main(String[] args) {

    }
}

class Bank {

    private double balance = 0;

    public void submitMoney(int Amount) {
        balance += Amount;
    }

    public void withdrawMoney(int Amount) {
        balance -= Amount;
    }

    public double getBalance() {
        return balance;
    }
}
