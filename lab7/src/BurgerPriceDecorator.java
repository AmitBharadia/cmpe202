public abstract class BurgerPriceDecorator extends Burger{
    Burger burger;

    BurgerPriceDecorator(String d){
        super(d);
    }

    public  BurgerPriceDecorator(Burger burger){
        super("New Burger Decorator");
        this.burger=burger;
    }


}
