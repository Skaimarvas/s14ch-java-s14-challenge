public class DeluxeBurger extends Hamburger{
    private String meat;
    public DeluxeBurger(String name, double price, BreadRollType breadRollType) {
        super("DELUXE BURGER", 19.10, BreadRollType.DOUBLE_SANDWICH);
        super.addHamburgerAddition1("chips", 0);
        super.addHamburgerAddition2("drink", 0);
        this.meat = "Double";

    }

    @Override
    public void addHamburgerAddition1(String name, double price) {
        System.out.println("You can't add additional items on Deluxe Burger Menu");
    }

    @Override
    public void addHamburgerAddition2(String name, double price) {
        System.out.println("You can't add additional items on Deluxe Burger Menu");
    }

    @Override
    public void addHamburgerAddition3(String name, double price) {
        System.out.println("You can't add additional items on Deluxe Burger Menu");
    }

    @Override
    public void addHamburgerAddition4(String name, double price) {
        System.out.println("You can't add additional items on Deluxe Burger Menu");
    }

    @Override
    public String getMeat() {
        return meat;
    }
}

