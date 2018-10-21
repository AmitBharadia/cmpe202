
public class OrganicBison extends BurgerPriceDecorator {

    public OrganicBison(String d){
        super(d);
    }


    public OrganicBison(Burger burger){
        super(burger);
    }

    @Override
    public String getDescription() {
        if (burger.getDescription() != null)
            return burger.getDescription() + " + Organic Bison";
        else {
            return "Organic Bison";
        }
    }

    public Double getPrice() {
            return burger.getPrice()+ 4;
    }
}
