public class halflb extends BurgerPriceDecorator {

    halflb(String d){
        super(d);
    }

    public halflb(Burger burger) {
        super(burger);
    }

    public String getDescription() {
        return burger.getDescription() + " + 1/2lb";
    }


    public Double getPrice() {
        return burger.getPrice()+12;
    }
}
