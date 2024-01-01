public class Main {
    public static void main(String[] args) {
        Customer c1 = new Customer(1, "Mustafa akgül", 'm');
        System.out.println(c1);  // Customer's toString()

        Account a1 = new Account(1, c1, 1000);
        System.out.println(a1);  // Account's toString()

        a1.deposit(1000);
        System.out.println(a1);  // Account's toString()

        a1.withdraw(500);
        System.out.println(a1);  // Account's toString()

        a1.setBalance(1000);
        System.out.println(a1);  // Account's toString()

        a1.withdraw(5000); //this makes an error
        System.out.println(a1);  // Account's toString()

    }
}