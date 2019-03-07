package ObserverMode;

import java.util.Observable;
//observable 可观察
public class Boss extends Observable {
    public Boss(){

    }

    public void smoking(){
//        必须setchanged
        super.setChanged();

        super.notifyObservers("smoking");

    }

    public void work(){
        super.setChanged();
        super.notifyObservers("work");
    }

    public void run(){
        super.setChanged();
        super.notifyObservers("run");
    }

}
