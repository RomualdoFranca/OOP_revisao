package constructorsPart1;

public class Application {

    public static void main(String[] args) {

        BankAccount client1 = new BankAccount();
        client1.setAccountNumber("001");
        client1.setBalance(100.00);
        System.out.println("Saldo inicial: " + client1.getBalance());
        client1.setCustomerName("Romualdo França");
        client1.setPhoneNumber("8199999999");
        client1.setEmail("romualdo@email");
        client1.deposit(50.00);


    }
}
