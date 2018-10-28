public class PhoneNumber implements IKeyEventHandler, IDisplayComponent, IInputObserver, ICountryCodeObserver{

    IKeyEventHandler nextIKeyEventHandler;
    IDisplayStartegy currStrategy;

    PhoneNumber(){
        currStrategy=new UKStrategy();
    }

    String number="";
    public String display() {
        return currStrategy.display(number);
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

    @Override
    public void setInput(String cc, String number) {
        System.out.print("Number added"+ this.number);
        if(number.equals("X")){
            if(this.number.length()>0){
                this.number=this.number.substring(0,this.number.length()-1);
            }else{

            }
        }
        else if(currStrategy instanceof  USStrategy && this.number.length()<10){
            this.number+=number;
        } else if(currStrategy instanceof  UKStrategy && this.number.length()<14){
            this.number+=number;
        }

    }

    public void setCountryName(String code, boolean setCountryCode) {
        if(code.length()<1){
        }else{
            if(code.charAt(0)=='1'){
               currStrategy = new USStrategy();
            }else{
                currStrategy=new UKStrategy();
            }
        }
    }
}
