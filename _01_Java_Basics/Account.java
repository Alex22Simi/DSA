package _01_Java_Basics;

public class Account {
    //Instace variables(Non-statis fields)
    private String name;
    private double balance;

    //Class variables(statis fields)
    private static int totalAcounts = 0;

    //Contructor with parameters
    public Account(String name, double balance) {
        this.name = name;
        this.balance = balance;
        totalAcounts++;
    }

    //Method deposit
    public void deposit(double amount) {
        this.balance += amount;
        //this.balance = this.balance + amount;
        System.out.println("Depozit efectuat cu succes!" + " S-a depus suma de: " + amount + "!");
    }

    //Method: withdraw
    public void withdraw(double amount) {
        if(this.balance > amount) {
            balance -= amount;
            System.out.println("Ati retras cu succes suma de " + amount + " !");
        } else {
            System.out.println("Fonduri insuficiente!");
        }
    }
    public void displayInfo() {
        System.out.println("Nume titularului de card: " + this.name);
        System.out.println("Suma din conte: " + balance);
        System.out.println("Numarul contului: " + totalAcounts);
    }

    public static void main(String[] args) {
        Account account1 = new Account("Costel", 2500);
        account1.displayInfo();
        Account account2 = new Account("Mirel", 3500);
        account1.deposit(1500);
        account1.withdraw(1000);
        account1.displayInfo();

        Account account3 = new Account("Maria", 2999);
        account2.displayInfo();
    }
}


