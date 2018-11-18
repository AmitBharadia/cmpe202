package Command;

import java.util.ArrayList;
import java.util.List;

public class Invoker {
    List<ICommand> commandList;
    Invoker(){
        commandList=new ArrayList<>();
    }

    public void pressButton(){
        commandList.forEach(ICommand::execute);
        commandList=new ArrayList<>();
    }
    public void addAction(ICommand command){
        commandList.add(command);
    }

}
