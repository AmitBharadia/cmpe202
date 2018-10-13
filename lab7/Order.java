import java.util.ArrayList;
import java.util.List;

public class Order {
    List<IBurger> burgerList;

    Order() {
        burgerList = new ArrayList<>();
    }

    public void addBurger(IBurger burger) {
        burgerList.add(burger);
    }

    public void removeBurger(IBurger burger) {
        burgerList.remove(burger);
    }

}
