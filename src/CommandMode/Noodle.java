package CommandMode;

/**
 * @Author: jow
 * @Date: 2019/3/9 21:35
 * @Description
 * @Version 1.0
 */
public class Noodle extends CommandMode {
    private Chef chef;
    public Noodle(Chef chef){
        this.chef = chef;
    } 
    @Override
    public void excute() {
        chef.noodle();
    }
}
