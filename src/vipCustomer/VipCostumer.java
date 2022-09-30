package vipCustomer;

public class VipCostumer {

    private String name;
    private double creditLimit;
    private String emailAddress;

//  Os 3 construtores foram criados na ordem inversa
    public VipCostumer() {
        this("Default name", 10000.0, "Default address");
    }
//  Esse construtor guarda os valores nas instancias 'name' e 'creditLimit'. A instancia 'email' é atribuida um valor default
    public VipCostumer(String name, double creditLimit) {
        this(name, creditLimit, "unkown@email.com");
    }
//  Para criar um construtor vazio, é necessario cria um construtor com todas as instancias
    public VipCostumer(String name, double creditLimit, String emailAddress) { // esse construtor salva os valores das instancias
        this.name = name;
        this.creditLimit = creditLimit;
        this.emailAddress = emailAddress;
    }

    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmailAddress() {
        return emailAddress;
    }
}
