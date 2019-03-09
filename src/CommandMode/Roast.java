package CommandMode;

/**
 * @Author: jow
 * @Date: 2019/3/9 21:35
 * @Description
 * @Version 1.0
 */
public class Roast extends CommandMode {
    private Chef chef;
    public Roast(Chef chef){
        this.chef = chef;
    }
    @Override
    public void excute() {
        chef.roast();
    }
}
