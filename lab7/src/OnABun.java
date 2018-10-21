public class OnABun extends BurgerPriceDecorator {

    OnABun(String d) {
        super(d);
    }

    public OnABun(Burger b) {
        super(b);
    }

    @Override
    public String getDescription() {
        if (burger != null)
            return burger.getDescription() + " + On A Bun";
        else {
            return "On A Bun";
        }
    }

    public Double getPrice() {
            return burger.getPrice() + 0;
    }
}
