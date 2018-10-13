public class Main {

    public static void main(String[] args) {

        IBurger LBB = new LittleBaconBurger();
        ((LittleBaconBurger) LBB).addTopping(new Bacon());
        ((LittleBaconBurger) LBB).addTopping(new Lettuce());
        ((LittleBaconBurger) LBB).addTopping(new Tomato());
        ((LittleBaconBurger) LBB).addTopping(new GOnions());
        ((LittleBaconBurger) LBB).addTopping(new GJalapeno());
        System.out.println("************Payment Slip********");
        ((LittleBaconBurger) LBB).display(new PaymentReceiptStrategy());
        System.out.println("************Packing Slip********");
        ((LittleBaconBurger) LBB).display(new PackingSlipStrategy());
    }
}
