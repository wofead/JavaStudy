package ObserverMode;

import java.util.Observable;
import java.util.Observer;

//Employer 雇主 Employee 雇员
public class Employee implements Observer {
    public Employee() {
    }

    @Override
    public void update(Observable o, Object arg) {
        System.out.println("老板的行为：" + arg);
    }
}
