package CommandMode;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: jow
 * @Date: 2019/3/9 20:05
 * @Description
 * @Version 1.0
 */
public class Waiter {
    private List<CommandMode> commandModes = new ArrayList<CommandMode>();
    public void setOrder(CommandMode commandMode){
        commandModes.add(commandMode);
    }
    public void removeOrder(CommandMode commandMode){
        commandModes.remove(commandMode);
    }
    public void notifyChef(){
        for (CommandMode com :
                commandModes) {
            com.excute();
        }
    }
}
