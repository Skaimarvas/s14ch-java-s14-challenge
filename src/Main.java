public class Main {
    public static void main(String[] args) {

        System.out.println("_______________Hamburger_________________");
        Hamburger hamburger = new Hamburger("Basic", 3.56, BreadRollType.WRAP);
        hamburger.addHamburgerAddition1("Tomato", 0.27);
        hamburger.addHamburgerAddition2("Lettuce", 0.75);
        hamburger.addHamburgerAddition3("Cheese",1.13);
        hamburger.itemizeHamburger();

        System.out.println("_______________Vegan_Burger_______________");
        HealthyBurger healthyBurger = new HealthyBurger("Vegan Burger", 5.67, BreadRollType.SANDWICH);
        healthyBurger.addHealthyExtra1("Egg", 5.43);
        healthyBurger.addHealthyExtra2("Lentils", 3.41);
        healthyBurger.itemizeHamburger();


        System.out.println("______________Deluxe_Burger__________________");
        DeluxeBurger db = new DeluxeBurger("Deluxe", 24, BreadRollType.SANDWICH);
        db.addHamburgerAddition3("Should not do this", 50.53);
        db.itemizeHamburger();
    }
}