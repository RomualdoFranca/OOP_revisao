package constructorsPart1;

public class BankAccount {

    private String accountNumber;
    private double balance;
    private String customerName;
    private String email;
    private String phoneNumber;

//  O construtor serve para iniciar o objeto que foi criado
    public BankAccount() {
        System.out.println("Empty constructor called");
    }
    public BankAccount(String accountNumber, double balance, String customerName,
                       String email, String phoneNumber) {

        System.out.println("Account constructor with parameters called");
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

//  Esse metodo nao retorna nenhum valor. Apenas atualiza o atributo 'balance'
// O metodo 'void' atualiza as variaveis de instancia
    public void deposit(double depositAmount) {
         this.balance += depositAmount;
        System.out.println("Deposit of " + depositAmount + " made. New balance is " + this.balance);
    }
    public void withdrawal(double withdrawlAmount) {
//  A conta nao pode ser zerada. Se o valor do saque for maior ou igual ao saldo, o saque nao sera realizado
        if (withdrawlAmount >= this.balance) {
            System.out.println("Insuficient found");
        }
        else {
            this.balance -= withdrawlAmount;
            System.out.println("Saldo após saque: " + this.balance);
        }

    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }




}
