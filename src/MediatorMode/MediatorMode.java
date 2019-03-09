package MediatorMode;

/**
 * @Author: jow
 * @Date: 2019/3/9 23:06
 * @Description
 * @Version 1.0
 * 中介者模式
 * 用一个中介对象来封装一系列的对象交互。中介者使各个对象不需要显示的相互引用，从而使其耦合松散，而且可以独立的改变它们之间的交互
 * mvc框架中充斥着大量的中介者模式
 * 数据层 视图层 以及视图
 */
public abstract class MediatorMode {
    public abstract void declare(String str, Country country);
}
