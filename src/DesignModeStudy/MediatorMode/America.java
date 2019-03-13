package DesignModeStudy.MediatorMode;

/**
 * @Author: jow
 * @Date: 2019/3/10 0:30
 * @Description
 * @Version 1.0
 */
public class America extends Country {
    public America(MediatorMode union) {
        super(union);
    }

    public void Declare(String string){
        super.union.declare(string, this);
    }

    public void  getMessage(String message){
        System.out.println("美国获取到消息：" + message);
    }
}
