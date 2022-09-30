package constructorsPart1;

public class Application {

    public static void main(String[] args) {

        BankAccount client1 = new BankAccount("001", 0.00,
                "Romualdo", "romualdo@email", "987654" ); // 'BankAccount()' executa o construtor automaticamente

        // Fazendo o output das variaveis de instacias ja que não ha nenhum 'sout' dentro dos getters,
        System.out.println(client1.getAccountNumber());
        System.out.println(client1.getCustomerName());
        // Nao precisa 'sout' aqui pois ja estao contidos nos metodos na classe BankAccount
        client1.deposit(500.00);
        client1.withdrawal(140.0);

        // Atribuindo os valores nas variaveis de instancia sem construtor
//        client1.setAccountNumber("001");
//        client1.setBalance(100.00);
//        System.out.println("Saldo inicial: " + client1.getBalance());// Usa-se o .get para 'pegar' o valor e fazer o output
//        client1.setCustomerName("Romualdo França");
//        client1.setPhoneNumber("8199999999");
//        client1.setEmail("romualdo@email");

        // Chamado o metodo de deposito. O valor atribuido aqui, vai ser guardado na variavel 'depositAmount'
//        client1.deposit(50.00);
//        client1.withdrawal(140.0);




    }
}
