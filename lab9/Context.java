package Command;

import Composite.Composite;

public class Context {
    public static void main(String arg[]){
        Invoker remote=new Invoker();
        Fan fan=new Fan();
        Light light=new Light();

        remote.addAction(() -> light.setOn());
        remote.addAction(() -> fan.setFanOn());
        remote.pressButton();
        System.out.println("===================================");
        remote.addAction(() -> light.setOff());
        remote.addAction(() -> fan.setFanOff());
        remote.pressButton();




//        remote.pressButton(new FanOnCommand(fan));
//        remote.pressButton(new FanOffCommand(fan));
//
//        remote.pressButton(new LightOnCommand(light));
//        remote.pressButton(new LightOffCommand(light));
//
//        CompositeCommand allOn=new CompositeCommand();
//        //Adding Interface implementation at run time
//        allOn.addComponents(new ICommand() {
//            @Override
//            public void execute() {
//                light.setOn();
//            }
//
//            @Override
//            public void addComponents(ICommand command) {
//
//            }
//        });
//        //Adding Interface implementation at run time
//        allOn.addComponents(new ICommand() {
//            @Override
//            public void execute() {
//                fan.setFanOn();
//            }
//
//            @Override
//            public void addComponents(ICommand command) {
//
//            }
//        });
//
//        remote.pressButton(allOn);
//
//        CompositeCommand allOff=new CompositeCommand();
//        allOff.addComponents(new LightOffCommand(light));
//        allOff.addComponents(new FanOffCommand(fan));
//
//        remote.pressButton(allOff);

    }
}
