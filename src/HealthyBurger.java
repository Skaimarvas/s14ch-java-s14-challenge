public class HealthyBurger extends Hamburger{
   private Addition healthyExtra1;
   private Addition healthyExtra2;

   private String meat;

    public HealthyBurger(String name, double price, BreadRollType breadRollType) {
        super(name, price, breadRollType);
        this.meat = "Tofu";

    }

    public void  addHealthyExtra1(String name, double price){
        this.healthyExtra1 = new Addition(name, price);
    }
    public void  addHealthyExtra2(String name, double price){
        this.healthyExtra2 = new Addition(name, price);
    }

    @Override
    public String getMeat() {
        return meat;
    }

    @Override
    public double itemizeHamburger() {
        double totalPrice = super.itemizeHamburger();

        if(healthyExtra1 != null){
            System.out.println("HealthyExtra1: " + this.healthyExtra1.getName());
            totalPrice += this.healthyExtra1.getPrice();
        } if(healthyExtra2 != null){
            System.out.println("HealthyExtra2: " + this.healthyExtra2.getName());
            totalPrice += this.healthyExtra2.getPrice();
        }

        System.out.println("Price: " + totalPrice);
        return totalPrice;

    }
}
