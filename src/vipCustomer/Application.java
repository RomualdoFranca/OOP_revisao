package vipCustomer;

public class Application {
    public static void main(String[] args) {

        VipCostumer lula = new VipCostumer();
        VipCostumer bobSponja = new VipCostumer("Bob Sponja", 10000.00, "fendadobequina@email.com");
        System.out.println(bobSponja.getName());
        System.out.println(lula.getCreditLimit());
        System.out.println(lula.getEmailAddress());

    }


}
