/* (c) Copyright 2018 Paul Nguyen. All Rights Reserved */

public class CreditCardNum implements IDisplayComponent, IKeyEventHandler {

    private IKeyEventHandler nextHandler;
    private String number = "";
    private IDecorator wrapper;

    public void setNext(IKeyEventHandler next) {
        this.nextHandler = next;
    }

    public void wrap(IDecorator wrapper) {
        this.wrapper = wrapper;
    }

    public String display() {
        if (number.equals(""))
            return "[4444 4444 4444 4444]" + "  ";
        else
            return "[" + wrapper.display(number) + "]" + "  ";
    }

    public void key(String ch, int cnt) {
        System.out.println("cnt" + cnt);
        if (cnt <= 16)
            if (ch.equals("x")) {
                number = number.substring(0, number.length() - 1);
            } else {
                number += ch;
            }

        if (nextHandler != null)
            nextHandler.key(ch, cnt);
    }

    public void addSubComponent(IDisplayComponent c) {
        return; // do nothing
    }


}