package DesignModeStudy.CommandMode;

/**
 * @Author: jow
 * @Date: 2019/3/9 20:10
 * @Description
 * @Version 1.0
 */
//厨师
public class Chef {
    public Chef(){}
    public void roast(){
        System.out.println("烤肉");
    }
    public void noodle(){
        System.out.println("面条");
    }
    public void fish(){
        System.out.println("鱼");
    }
}
