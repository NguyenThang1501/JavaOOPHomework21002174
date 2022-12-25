package exercise2_5;

public class TestMain {
    public static void main(String[] args) {
        Customer customer1 = new Customer(1, "Nguyen A", 'm');
        System.out.println(customer1);
        Account account1 = new Account(1, customer1, 25.12);
        System.out.println(account1);
        System.out.println(account1.deposit(10));
        System.out.println(account1.withdraw(12));

    }


}
