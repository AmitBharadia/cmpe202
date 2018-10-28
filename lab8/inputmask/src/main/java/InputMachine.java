import java.util.ArrayList;
import java.util.List;

public class InputMachine implements IKeyEventHandler, IDisplayComponent,  IInputSubject, ICountryCodeObserver {
    IKeyEventHandler nextIKeyEventHandler;
    boolean countryCodeSet;
    int count=0;
    List<IInputObserver> iInputObserverList;
    String countryCode="";

    InputMachine() {
        countryCodeSet = false;
        iInputObserverList = new ArrayList<>();
    }

    public void setCountryName(String code, boolean countryCodeSet) {
        System.out.println("countryCodeSet"+countryCodeSet);
        this.countryCodeSet=countryCodeSet;
        this.countryCode = code;
    }

    public void key(String ch, int cnt) {
        if(ch.equals("X")){
            System.out.println(" countryCode "+ this.countryCode + " count "+count);
            if(this.countryCode == "1" && count <2)
            {
                updateInput("X","");
                countryCodeSet = false;
            }
            else
            {
                updateInput("","X");
                countryCodeSet = true;
            }

            if(this.countryCode == "44" && count <3)
            {
                updateInput("X","");
                countryCodeSet = false;
            }

        }
        else if (!countryCodeSet) {
            updateInput(ch, "");
            count++;
        } else {
            System.out.println("ch" +ch);
            updateInput("", ch);
            count++;
        }
    }

    public void setNext(IKeyEventHandler next) {
        nextIKeyEventHandler = next;
    }

    @Override
    public void registerObserver(IInputObserver obj) {
        iInputObserverList.add(obj);
    }

    @Override
    public void removeObserver(IInputObserver obj) {
        iInputObserverList.remove(obj);
    }

    @Override
    public void updateInput(String cc, String phoneNumber) {
        for (IInputObserver obj : iInputObserverList) {
            obj.setInput(cc, phoneNumber);
        }
    }

    public String display() {
        return "";
    }

    public void addSubComponent(IDisplayComponent c) {

    }
}
