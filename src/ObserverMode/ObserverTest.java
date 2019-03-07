package ObserverMode;

public class ObserverTest {
    public ObserverTest() {
    }
    public void test(){

        Boss boss = new Boss();
        Employee employee = new Employee();
        boss.addObserver(employee);
        boss.run();
        boss.smoking();
        boss.work();


    }
}
