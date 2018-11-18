package Command;

public class Fan implements IReciever{
    @Override
    public String getName() {
        return "Fan";
    }

    public void setFanOn(){
        System.out.println("Fan is on");
    }

    public void setFanOff(){
        System.out.println("Fan is off");
    }
}
