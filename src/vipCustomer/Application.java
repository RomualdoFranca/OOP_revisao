package vipCustomer;

public class Application {
    public static void main(String[] args) {

        VipCostumer lula = new VipCostumer();
        System.out.println(lula.getName());

        VipCostumer gary = new VipCostumer("Gary", 0.01);
        System.out.println(gary.getName());

        VipCostumer bobSponja = new VipCostumer("Bob Sponja", 10000.00, "fendadobequina@email.com");
        System.out.println(bobSponja.getName());


    }


}
