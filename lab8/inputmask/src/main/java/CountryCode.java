import java.util.ArrayList;
import java.util.List;

public class CountryCode implements IKeyEventHandler, IDisplayComponent, ICountryCodeSubject, IInputObserver{

    IKeyEventHandler nextIKeyEventHandler;

    List<ICountryCodeObserver> countryCodeObserverList;

    String countryCode="";
    boolean setCountryCode=false;
    CountryCode(){
        countryCodeObserverList=new ArrayList<>();
    }
    public String display() {
        return countryCode;
    }

    public void addSubComponent(IDisplayComponent c) {

    }

    public void key(String ch, int cnt) {
        if(nextIKeyEventHandler !=null)
            nextIKeyEventHandler.key(ch,cnt);
    }

    public void setNext(IKeyEventHandler next) {
        nextIKeyEventHandler=next;
    }

    public void registerObserver(ICountryCodeObserver obj) {
        countryCodeObserverList.add(obj);
    }

    public void removeObserver(ICountryCodeObserver obj) {
        countryCodeObserverList.remove(obj);
    }

    public void notifyAlertToObserver(String code,boolean setCountryCode) {
        for(ICountryCodeObserver obj: countryCodeObserverList){
            obj.setCountryName(code,setCountryCode);
        }
    }

    public void setInput(String cc, String number) {
       if(cc.equals("X")){
           if(countryCode.length()==1){
               countryCode="";
               setCountryCode=false;
           }else{
               countryCode=countryCode.substring(0,1);
           }
       }
       else if(!setCountryCode){
           countryCode+=cc;
       }
        if(countryCode.length()==1 && countryCode.charAt(0)=='1'){
            setCountryCode=true;
        }else if(countryCode.length()>1 && countryCode.equals("44")){
            setCountryCode=true;
        }
        notifyAlertToObserver(countryCode, setCountryCode);
    }
}
