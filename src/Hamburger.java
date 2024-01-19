public class Hamburger {
  private String name;
  private String meat;
  private BreadRollType breadRollType;
  private double price;

    private Addition addition1;

    private Addition addition2;

    private Addition addition3;
    private Addition addition4;

    public Hamburger(String name, double price, BreadRollType breadRollType ) {
        this.name = name;
        this.meat = "Normal";
        this.breadRollType = breadRollType;
        this.price = price;
    }

    public void addHamburgerAddition1(String name, double price){
        this.addition1 = new Addition(name,price);
    }

    public void addHamburgerAddition2(String name, double price){
        this.addition2 = new Addition(name,price);
    }
    public void addHamburgerAddition3(String name, double price){
        this.addition3 = new Addition(name,price);
    }
    public void addHamburgerAddition4(String name, double price){
        this.addition4 = new Addition(name,price);
    }

    public String getMeat() {
        return meat;
    }



    public double itemizeHamburger(){
        double totalPrice = this.price;
        //Else if kullandığım için diğer koşulları sağlayamadım.
        System.out.println("Name: " + this.name);
        System.out.println("Meat: " +  getMeat());
        System.out.println("BreadRollType: " + this.breadRollType);
        if(addition1 != null){
            System.out.println("Addition1: " + this.addition1.getName());
            totalPrice += this.addition1.getPrice();
        }
        if(addition2 != null){
            System.out.println("Addition2: " + this.addition2.getName());
            totalPrice += this.addition2.getPrice();
        }
        if(addition3 != null){
            System.out.println("Addition3: " + this.addition3.getName());
            totalPrice += this.addition3.getPrice();
        }
        if(addition4 != null){
            System.out.println("Addition4: " + this.addition4.getName());
            totalPrice += this.addition4.getPrice();
        }

        System.out.println("Price: " + totalPrice);
        return totalPrice;
    }
}
