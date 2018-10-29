public class DateDecorator implements IDecorator {

    public String display(String s) {

        if(s.length()>2)
            return s.substring(0,2) +"/"+s.substring(2);
        return s;
    }
}
