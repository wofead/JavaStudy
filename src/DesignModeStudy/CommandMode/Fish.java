package DesignModeStudy.CommandMode;

/**
 * @Author: jow
 * @Date: 2019/3/9 21:35
 * @Description
 * @Version 1.0
 */
public class Fish extends CommandMode {
    private Chef chef;
    public Fish(Chef chef){
        this.chef = chef;
    } 
    @Override
    public void excute() {
        chef.fish();
    }
}
