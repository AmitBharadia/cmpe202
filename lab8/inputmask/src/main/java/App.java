/* (c) Copyright 2018 Paul Nguyen. All Rights Reserved */

/**
 *  Main App Class for Displaying Screen.
 */
public class App {

    private Screen screen;
    private CreditCardNum num;
    private CreditCardExp exp;
    private CreditCardCVC cvc;
    private int count;

    public App() {

        screen = new Screen();
        num = new CreditCardNum();
        exp = new CreditCardExp();
        cvc = new CreditCardCVC();
//        CountryCode cc=new CountryCode();
//        CountryName cn=new CountryName();
//        PhoneNumber pn=new PhoneNumber();
//        InputMachine im=new InputMachine();

        screen.addSubComponent(num);
        screen.addSubComponent(exp);
        screen.addSubComponent(cvc);

//        //Observer For InputMachine
//        im.registerObserver(cc);
//        im.registerObserver(pn);
//
//        //countryCode observer
//        cc.registerObserver(cn);
//        cc.registerObserver(im);
//        cc.registerObserver(pn);
//        count = 0;

    }

    public String display() {
        String output = "";
        output += "========================================\n";
        output += screen.name() + "\n";
        output += "========================================\n";
        output += "\n\n\n\n";
        output += screen.display() + "\n";
        output += "\n\n\n\n";
        output += "========================================\n";
        return output;
    }

    public void key(String ch) {
        count++;
        screen.key(ch, count);
    }

}

