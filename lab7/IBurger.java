import java.util.List;

public interface IBurger {
    String getName();

    List<ITopping> getToppings();

    double getCost();

    void displayTopping(IDisplayStrategy strategy);
}
