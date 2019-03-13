package DesignModeStudy.FlyWeight;

/**
 * @Author: jow
 * @Date: 2019/3/10 1:00
 * @Description
 * @Version 1.0
 */
public class Website extends FlyweightMode {
    private String name;
    public Website(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
    public void use(UserWebsite user) {
        System.out.println(String.format("网站分类：%s，用户：%s",name,user.getName()));
    }
}
