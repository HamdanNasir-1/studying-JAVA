
public class Encapsulation {

    public static void main(String[] args) {
        Bank bank = new Bank();
        bank.deposit(400);
        bank.withdraw(66);
        bank.getBalance();
    }
}

class Bank {

    private double balance = 0;

    public void deposit(int Amount) {
        balance += Amount;
        System.out.println(Amount + " Deposited succesfully");
    }

    public void withdraw(int Amount) {
        if (balance < Amount) {
            System.out.println("Insufficient balance.....");
        } else {
            balance -= Amount;
            System.out.println(Amount + " Withdrawn succesfully");
        }
    }

    public void getBalance() {
        System.out.println("You have : "+balance+" rs");
    }
}
