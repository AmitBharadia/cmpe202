/* (c) Copyright 2018 Paul Nguyen. All Rights Reserved */

public class CreditCardExp implements IDisplayComponent, IKeyEventHandler {
    private IKeyEventHandler nextHandler;
    private String date = "";
    private IDecorator wrapper;

    public void setNext(IKeyEventHandler next) {
        this.nextHandler = next;
    }

    public void wrap(IDecorator wrapper) {
        this.wrapper = wrapper;
    }

    public String display() {
        if (date.equals(""))
            return "[MM/YY]" + "  ";
        else
            return "[" + wrapper.display(date) + "]" + "  ";
    }

    public void key(String ch, int cnt) {
        System.out.println("cnt" + cnt);

        if (cnt >= 17 && cnt <= 20)
            if (ch.equals("x")) {
                date = date.substring(0, date.length() - 1);
            } else {
                date += ch;
            }
        if (nextHandler != null)
            nextHandler.key(ch, cnt);
    }

    public void addSubComponent(IDisplayComponent c) {
        return; // do nothing
    }

}