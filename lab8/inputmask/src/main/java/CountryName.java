public class CountryName implements IKeyEventHandler, IDisplayComponent, ICountryCodeObserver{

    IKeyEventHandler nextIKeyEventHandler;
    String countryName="";

    public String display() {
        return  countryName;
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

    public void setCountryName(String code,boolean setCountryCode) {
        if(code.length()<1){
            if(!setCountryCode){
                countryName="";
            }
        }else{
            if(code.charAt(0)=='1'){
                countryName="US ";
            }else{
                countryName="UK ";
            }
        }

    }
}
