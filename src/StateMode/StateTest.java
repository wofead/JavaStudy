package StateMode;

public class StateTest {
    public StateTest(){}
    public void test(){
        WorkMode workMode = new WorkMode();
        workMode.setHour(10);
        workMode.state();
        workMode.setHour(12);
        workMode.state();
        workMode.setHour(14);
        workMode.state();
        workMode.setHour(16);
        workMode.state();
        workMode.setFinish(true);
        workMode.setHour(20);
        workMode.state();
    }

}
