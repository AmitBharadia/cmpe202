import java.util.Comparator;
import java.util.List;

public class PackingSlipStrategy  implements IDisplayStrategy{

    public List<ITopping> sort(List<ITopping> toppings) {
        toppings.sort(Comparator.comparing(ITopping::getIndex));
        return toppings;
    }
}
