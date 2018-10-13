import java.util.ArrayList;
import java.util.List;

public class LittleBaconBurger implements IBurger {
    List<ITopping> toppingList;

    LittleBaconBurger() {
        toppingList = new ArrayList<>();
    }

    public String getName() {
        return "LBB";
    }

    public List<ITopping> getToppings() {
        return toppingList;
    }

    public void addTopping(ITopping topping) {
        toppingList.add(topping);
    }

    public void removeTopping(ITopping topping) {
        toppingList.remove(topping);
    }

    public double getCost() {
        return 5.59;
    }

    public void display(IDisplayStrategy strategy){
        System.out.println(this.getName());
        displayTopping(strategy);
    }

    public void displayTopping(IDisplayStrategy strategy) {
        strategy.sort(toppingList);
        for(ITopping topping : toppingList ){
            if(topping.getIndex()==3){
                System.out.println("{{{{" + topping.getName() + "}}}}");
            }else if(topping.getIndex()==2){
                System.out.println("->|"+topping.getName());
            }else{
                System.out.println(topping.getName());
            }
        }
    }
}
